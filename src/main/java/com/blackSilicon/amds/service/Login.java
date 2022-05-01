/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.service;

import com.blackSilicon.amds.entity.Emailrequest;
import com.blackSilicon.amds.entity.LoginAudit;
import com.blackSilicon.amds.entity.User;
import com.blackSilicon.amds.entity.Webfile;
import com.blackSilicon.amds.utils.JWTHelper;
import com.blackSilicon.amds.utils.PasswordHash;
import com.blackSilicon.amds.utils.SecuredAdmin;
import com.blackSilicon.amds.session.LoginAuditFacade;
import com.blackSilicon.amds.session.UserFacade;
import com.blackSilicon.amds.session.WebfileFacade;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.POST;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

/**
 *
 * @author felix
 */
@Stateless
@Path("user")
public class Login {

    @EJB
    PasswordHash ph;
    @EJB
    UserFacade uf;
    @EJB
    WebfileFacade wf;
    @EJB
    LoginAuditFacade laf;
    @EJB
    JWTHelper jwt;
    @Context
    HttpServletRequest request;

    @Path("login")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginAndFilter(User user, @QueryParam("from") @DefaultValue("0") long from, @QueryParam("page") @DefaultValue("0") long to) {
        Map<String, Object> result = new HashMap<>();

        //InetAddress inet = null;
        User u = uf.findByUsername(user.getUsername());
        String ipAddress = request.getHeader("X-FORWARDED-FOR");  
        if (ipAddress == null) {  
            ipAddress = request.getRemoteAddr();  
        }
        LoginAudit loginaudit = new LoginAudit();
        loginaudit.setDate(new Date());
        loginaudit.setUsername(user.getUsername());
        loginaudit.setIpAddress(ipAddress);
        loginaudit.setPlatform("Admin");
        if (ph.verifyHash(user.getPassword(), u.getPassword())) {
            loginaudit.setStatus("successful");
            laf.create(loginaudit);
            u.setLastLogin(new Date());
            uf.edit(u);
            result.put("jwt", jwt.generateToken(u));
            result.put("user", user.getUsername());
            return Response.status(Response.Status.OK).entity(result).build();
        } else {
            loginaudit.setStatus("failed");
            laf.create(loginaudit);
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }

    @Path("signup")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createuser(User user) {
        user.setDateCreated(new Date());
        user.setPassword(ph.hash(user.getPassword()));
        uf.create(user);
    }

    @Path("getdata")
    @GET
    @SecuredAdmin
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Filter(@QueryParam("from") @DefaultValue("0") long from, @QueryParam("to") @DefaultValue("0") long to) {
        Map<String, Object> result = new HashMap<>();
        int webfilecount = 0;
        int pendingsmsrequestcount = 0;
        int pendingemailrequestcount = 0;
        int verifiedfiles = 0;
        int total = wf.count();

        List<Webfile> webfile =wf.filter(from, to);
        webfilecount = webfile.size();
        for(Webfile w:webfile){
            if(w.getVerified()==1) verifiedfiles++;
            if(w.getSmsStatus()==0) pendingsmsrequestcount++;
            for(Emailrequest e:w.getEmailrequest()){
                if(e.getCreated()==0) pendingemailrequestcount++;
            }
            
        }
        result.put("total", total);
        result.put("webfilecount", webfilecount);
        result.put("pendingsmsrequestcount", pendingsmsrequestcount);
        result.put("pendingemailrequestcount",pendingemailrequestcount);
        result.put("verifiedfiles", verifiedfiles);
        return Response.status(Response.Status.OK).entity(result).build();
    }
    @DELETE
    @Path("delete/{username}")
    public Response deleteAdminUser(@PathParam("username")String username){
        uf.remove(uf.findByUsername(username));
        return Response.status(Response.Status.OK).build();
    }
}
