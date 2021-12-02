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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "emailrequest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emailrequest.findAll", query = "SELECT e FROM Emailrequest e"),
    @NamedQuery(name = "Emailrequest.findById", query = "SELECT e FROM Emailrequest e WHERE e.id = :id"),
    @NamedQuery(name = "Emailrequest.findByEmail", query = "SELECT e FROM Emailrequest e WHERE e.email = :email"),
    @NamedQuery(name = "Emailrequest.findByCreated", query = "SELECT e FROM Emailrequest e WHERE e.created = :created"),
    @NamedQuery(name = "Emailrequest.findBySent", query = "SELECT e FROM Emailrequest e WHERE e.sent = :sent"),
    @NamedQuery(name = "Emailrequest.findByDate", query = "SELECT e FROM Emailrequest e WHERE e.date = :date")})
public class Emailrequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @NotNull
    @Column(name = "email")
    private String email;
    @Column(name = "created")
    private int created;
    @Column(name = "sent")
    private int sent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "web_file", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Webfile webFile;

    public Emailrequest() {
    }

    public Emailrequest(Integer id) {
        this.id = id;
    }
    public Emailrequest(String email) {
        this.email = email;
    }

    public Emailrequest(Integer id, String email, Date date) {
        this.id = id;
        this.email = email;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getSent() {
        return sent;
    }

    public void setSent(int sent) {
        this.sent = sent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Webfile getWebFile() {
        return webFile;
    }

    public void setWebFile(Webfile webFile) {
        this.webFile = webFile;
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
        if (!(object instanceof Emailrequest)) {
            return false;
        }
        Emailrequest other = (Emailrequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Emailrequest{" + "id=" + id + ", email=" + email + ", created=" + created + ", sent=" + sent + ", date=" + date + ", webFile=" + webFile + '}';
    }

    
    
}
