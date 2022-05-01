/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blackSilicon.amds.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "invoicecert")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoicecert.findAll", query = "SELECT i FROM Invoicecert i"),
    @NamedQuery(name = "Invoicecert.findByTransRef", query = "SELECT i FROM Invoicecert i WHERE i.transRef = :transRef"),
    @NamedQuery(name = "Invoicecert.findByMobile", query = "SELECT i FROM Invoicecert i WHERE i.mobile = :mobile"),
    @NamedQuery(name = "Invoicecert.findByDateIssued", query = "SELECT i FROM Invoicecert i WHERE i.dateIssued = :dateIssued"),
    @NamedQuery(name = "Invoicecert.findByIssued", query = "SELECT i FROM Invoicecert i WHERE i.issued = :issued")})
public class Invoicecert implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trans_ref")
    private String transRef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "mobile")
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email")
    private String email;
    @Column(name = "date_issued")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIssued;
    @Basic(optional = false)
    @NotNull
    @Column(name = "issued")
    private int issued;

    public Invoicecert() {
    }

    public Invoicecert(String transRef) {
        this.transRef = transRef;
    }

    public Invoicecert(String transRef, String mobile, Character issued) {
        this.transRef = transRef;
        this.mobile = mobile;
        this.issued = issued;
    }

    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transRef != null ? transRef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoicecert)) {
            return false;
        }
        Invoicecert other = (Invoicecert) object;
        if ((this.transRef == null && other.transRef != null) || (this.transRef != null && !this.transRef.equals(other.transRef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blackSilicon.amds.entity.Invoicecert[ transRef=" + transRef + " ]";
    }
    
}
