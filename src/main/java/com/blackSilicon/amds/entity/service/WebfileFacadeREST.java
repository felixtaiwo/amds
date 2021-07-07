/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.entity.service;

import com.blackSilicon.amds.entity.Webfile;
import com.blackSilicon.amds.entity.WebfileFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ftadewale
 */
@Stateless
@Path("webfile")
public class WebfileFacadeREST extends AbstractFacade<Webfile> {
    @EJB
    private WebfileFacade wf;
    @PersistenceContext(unitName = "webfilePU")
    private EntityManager em;

    public WebfileFacadeREST() {
        super(Webfile.class);
    }
    
    

    
    @GET
    @Path("{ref}/{email}")
    public void edit(@PathParam("ref") String ref, @PathParam("email") String email) {
        Webfile w=wf.findByRef(ref);
        w.setEmail(email);
        w.setEmailStatus((short)0);
        super.edit(w);
    }

    

    @GET
    @Path("{ref}")
    @Produces( MediaType.APPLICATION_JSON)
    public Webfile find(@PathParam("ref") String ref) {
        return wf.findByRef(ref);
    }

    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<Webfile> findAll() {
        return super.findAll();
    }

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

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
