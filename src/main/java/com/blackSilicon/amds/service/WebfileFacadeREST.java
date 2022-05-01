/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.service;

import com.blackSilicon.amds.entity.Emailrequest;
import com.blackSilicon.amds.entity.LoginAudit;
import com.blackSilicon.amds.session.EmailrequestFacade;
import com.blackSilicon.amds.entity.Webfile;
import com.blackSilicon.amds.session.LoginAuditFacade;
import com.blackSilicon.amds.session.WebfileFacade;
import com.blackSilicon.amds.utils.SecuredAdmin;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author ftadewale
 */
@Stateless
@Path("webfile")
public class WebfileFacadeREST extends AbstractFacade<Webfile> {
     @Context
    HttpServletRequest request;
    @EJB
    private WebfileFacade wf;
    @EJB
    private EmailrequestFacade emf;
    @EJB
    private LoginAuditFacade lf;
    @PersistenceContext(unitName = "webfilePU")
    private EntityManager em;

    public WebfileFacadeREST() {
        super(Webfile.class);
    }
    
    

    
    @GET
    @Path("{ref}/sendemail/{email}")
    public void edit(@PathParam("ref") String ref, @PathParam("email") String email) {
        Webfile w=wf.findByRef(ref);
         Emailrequest e =emf.findByEmail(email);
         if(e.getId()!=null){
            e.setWebFile(w);
            e.setDate(new Date());
            e.setSent(0);
            e.setCreated(0);
            emf.edit(e);
         }
         else{
            Emailrequest emailrequest =new Emailrequest(email);
            emailrequest.setWebFile(w);
            emailrequest.setDate(new Date());
            emailrequest.setSent(0);
            emailrequest.setCreated(0);
            System.out.println(emailrequest);
            emf.create(emailrequest);
        }
       
    }

    

    @GET
    @Path("{ref}")
    @Produces( MediaType.APPLICATION_JSON)
    public String find(@PathParam("ref") String ref) {
        String mobile = wf.findByRef(ref).getMobile();
        return mobile.substring(0, mobile.length()-4);
    }
    @GET
    @Path("{ref}/{mobile}")
    @Produces( MediaType.APPLICATION_JSON)
    public Response find(@PathParam("ref") String ref,@PathParam("mobile") String mobile) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");  
        if (ipAddress == null) {  
            ipAddress = request.getRemoteAddr();  
        }
        LoginAudit loginaudit = new LoginAudit();
        loginaudit.setDate(new Date());
        loginaudit.setPlatform("client");
        loginaudit.setWebfileId(wf.findByRef(ref));
        loginaudit.setIpAddress(ipAddress);
        String mobileNo=wf.findByRef(ref).getMobile();
        if(mobile.equals(mobileNo.substring(mobileNo.length()-4, mobileNo.length()))){
            loginaudit.setStatus("successful");
            lf.create(loginaudit);
            return Response.status(Response.Status.OK).entity(wf.findByRef(ref)).build();
        }
        else {
            loginaudit.setStatus("failed");
            lf.create(loginaudit);
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
//    @GET
//    @Override
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Webfile> findAll() {
//        return super.findAll();
//    }

//    @GET
//    @Path("{from}/{to}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Webfile> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
//        return super.findRange(new int[]{from, to});
//    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
    @GET
    @SecuredAdmin
    @Path("search/ref/mobile/{ref}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Webfile> findByRefOrMobile(@PathParam("ref") String ref) {
        return wf.findByRefOrMobile(ref);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
