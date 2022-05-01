/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.session;

import com.blackSilicon.amds.entity.Invoicecert;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author felix
 */
@Stateless
public class InvoicecertFacade extends AbstractFacade<Invoicecert> {

    @PersistenceContext(unitName = "webfilePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InvoicecertFacade() {
        super(Invoicecert.class);
    }
    
}
