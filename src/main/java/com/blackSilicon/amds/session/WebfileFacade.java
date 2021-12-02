/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.session;

import com.blackSilicon.amds.entity.AbstractFacade;
import com.blackSilicon.amds.entity.Webfile;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ftadewale
 */
@Stateless
public class WebfileFacade extends AbstractFacade<Webfile> {

    @PersistenceContext(unitName = "webfilePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WebfileFacade() {
        super(Webfile.class);
    }
    
    public Webfile findByRef(String ref){
       Webfile user = new Webfile();
        Query query = em.createNamedQuery("Webfile.findByReference");
        query.setParameter("reference", ref);
        if(query.getResultList().size()>0) 
            user= (Webfile)query.getResultList().get(0);
        return user;
    }
    
}
