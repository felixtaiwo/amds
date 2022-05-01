/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.session;

import com.blackSilicon.amds.entity.AbstractFacade;
import com.blackSilicon.amds.entity.Webfile;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    public List<Webfile> filter(long from, long to){
        if(from>to){
            return new ArrayList<>();
        }
        Query query;
        if(to==0||from==0) query = em.createNativeQuery("select * from webfile",Webfile.class);
        else{
         query = em.createNativeQuery("select * from webfile where created>=:from and created<=:to",Webfile.class);
        query.setParameter("from", new Date(from));
        query.setParameter("to", new Date(to));
                }
        if(query.getResultList().size()>0) return (List<Webfile>)query.getResultList();
        return new ArrayList<>();
    }
    public List<Webfile> findByRefOrMobile(String ref){
        Query query = em.createNativeQuery("select * from webfile where reference like :ref or mobile like :mobile",Webfile.class);
        query.setParameter("ref", "%"+ref+"%");
        query.setParameter("mobile", "%"+ref+"%");
        return (List<Webfile>)query.getResultList();
    }
}
