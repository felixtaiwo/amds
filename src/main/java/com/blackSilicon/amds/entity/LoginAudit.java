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
 * @author felix
 */
@Entity
@Table(name = "login_audit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginAudit.findAll", query = "SELECT l FROM LoginAudit l"),
    @NamedQuery(name = "LoginAudit.findById", query = "SELECT l FROM LoginAudit l WHERE l.id = :id"),
    @NamedQuery(name = "LoginAudit.findByDate", query = "SELECT l FROM LoginAudit l WHERE l.date = :date"),
    @NamedQuery(name = "LoginAudit.findByIpAddress", query = "SELECT l FROM LoginAudit l WHERE l.ipAddress = :ipAddress"),
    @NamedQuery(name = "LoginAudit.findByStatus", query = "SELECT l FROM LoginAudit l WHERE l.status = :status"),
    @NamedQuery(name = "LoginAudit.findByUsername", query = "SELECT l FROM LoginAudit l WHERE l.username = :username"),
    @NamedQuery(name = "LoginAudit.findByPlatform", query = "SELECT l FROM LoginAudit l WHERE l.platform = :platform")})
public class LoginAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ip_address")
    private String ipAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 45)
    @Column(name = "platform")
    private String platform;
    @JoinColumn(name = "webfile_id", referencedColumnName = "id")
    @ManyToOne
    private Webfile webfileId;

    public LoginAudit() {
    }

    public LoginAudit(Integer id) {
        this.id = id;
    }

    public LoginAudit(Integer id, Date date, String ipAddress, String status, String username) {
        this.id = id;
        this.date = date;
        this.ipAddress = ipAddress;
        this.status = status;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Webfile getWebfileId() {
        return webfileId;
    }

    public void setWebfileId(Webfile webfileId) {
        this.webfileId = webfileId;
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
        if (!(object instanceof LoginAudit)) {
            return false;
        }
        LoginAudit other = (LoginAudit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blackSilicon.amds.entity.LoginAudit[ id=" + id + " ]";
    }
    
}
