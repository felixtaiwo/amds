/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.session;

import com.blackSilicon.amds.entity.AbstractFacade;
import com.blackSilicon.amds.entity.Emailrequest;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ftadewale
 */
@Stateless
public class EmailrequestFacade extends AbstractFacade<Emailrequest> {

    @PersistenceContext(unitName = "webfilePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailrequestFacade() {
        super(Emailrequest.class);
    }
    
    public Emailrequest findByEmail(String email){
       Emailrequest user = new Emailrequest();
        Query query = em.createNamedQuery("Emailrequest.findByEmail");
        query.setParameter("email", email);
        if(query.getResultList().size()>0) 
            user= (Emailrequest)query.getResultList().get(0);
        return user;
    }
    
}
