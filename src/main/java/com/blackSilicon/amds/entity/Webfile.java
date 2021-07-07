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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author ftadewale
 */
@Entity
@Table(name = "webfile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Webfile.findAll", query = "SELECT w FROM Webfile w"),
    @NamedQuery(name = "Webfile.findById", query = "SELECT w FROM Webfile w WHERE w.id = :id"),
    @NamedQuery(name = "Webfile.findByReference", query = "SELECT w FROM Webfile w WHERE w.reference = :reference"),
    @NamedQuery(name = "Webfile.findByBillRef", query = "SELECT w FROM Webfile w WHERE w.billRef = :billRef"),
    @NamedQuery(name = "Webfile.findByFilePath", query = "SELECT w FROM Webfile w WHERE w.filePath = :filePath"),
    @NamedQuery(name = "Webfile.findByCustomerId", query = "SELECT w FROM Webfile w WHERE w.customerId = :customerId"),
    @NamedQuery(name = "Webfile.findByEmail", query = "SELECT w FROM Webfile w WHERE w.email = :email"),
    @NamedQuery(name = "Webfile.findByEmailStatus", query = "SELECT w FROM Webfile w WHERE w.emailStatus = :emailStatus"),
    @NamedQuery(name = "Webfile.findByMobile", query = "SELECT w FROM Webfile w WHERE w.mobile = :mobile"),
    @NamedQuery(name = "Webfile.findBySmsStatus", query = "SELECT w FROM Webfile w WHERE w.smsStatus = :smsStatus"),
    @NamedQuery(name = "Webfile.findByVerified", query = "SELECT w FROM Webfile w WHERE w.verified = :verified"),
    @NamedQuery(name = "Webfile.findByCreated", query = "SELECT w FROM Webfile w WHERE w.created = :created")})
public class Webfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "reference")
    private String reference;
    @Size(max = 45)
    @Column(name = "bill_ref")
    private String billRef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "file_path")
    private String filePath;
    @Size(max = 45)
    @Column(name = "customer_id")
    private String customerId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "email_status")
    private short emailStatus;
    @Size(max = 45)
    @Column(name = "mobile")
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sms_status")
    private short smsStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "verified")
    private short verified;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Webfile() {
    }

    public Webfile(Integer id) {
        this.id = id;
    }

    public Webfile(Integer id, String reference, String filePath, short emailStatus, short smsStatus, short verified, Date created) {
        this.id = id;
        this.reference = reference;
        this.filePath = filePath;
        this.emailStatus = emailStatus;
        this.smsStatus = smsStatus;
        this.verified = verified;
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getBillRef() {
        return billRef;
    }

    public void setBillRef(String billRef) {
        this.billRef = billRef;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(short emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public short getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(short smsStatus) {
        this.smsStatus = smsStatus;
    }

    public short getVerified() {
        return verified;
    }

    public void setVerified(short verified) {
        this.verified = verified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Webfile)) {
            return false;
        }
        Webfile other = (Webfile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blackSilicon.amds.entity.Webfile[ id=" + id + " ]";
    }
    
}
