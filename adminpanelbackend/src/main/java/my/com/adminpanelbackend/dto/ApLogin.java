/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.adminpanelbackend.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author syafiq
 */
@Entity
@Table(name = "ap_login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApLogin.findAll", query = "SELECT a FROM ApLogin a"),
    @NamedQuery(name = "ApLogin.findById", query = "SELECT a FROM ApLogin a WHERE a.id = :id"),
    @NamedQuery(name = "ApLogin.findByUsername", query = "SELECT a FROM ApLogin a WHERE a.username = :username"),
    @NamedQuery(name = "ApLogin.findByPassword", query = "SELECT a FROM ApLogin a WHERE a.password = :password"),
    @NamedQuery(name = "ApLogin.findByLastLogin", query = "SELECT a FROM ApLogin a WHERE a.lastLogin = :lastLogin"),
    @NamedQuery(name = "ApLogin.findByActive", query = "SELECT a FROM ApLogin a WHERE a.active = :active"),
    @NamedQuery(name = "ApLogin.findByCreatedBy", query = "SELECT a FROM ApLogin a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApLogin.findByCreatedDate", query = "SELECT a FROM ApLogin a WHERE a.createdDate = :createdDate")})
public class ApLogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "active")
    private Integer active;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(mappedBy = "idApLogin")
    private List<ConfAccessMenu> confAccessMenuList;
    @JoinColumn(name = "id_ap_staff", referencedColumnName = "id")
    @ManyToOne
    private ApStaff idApStaff;

    public ApLogin() {
    }

    public ApLogin(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @XmlTransient
    public List<ConfAccessMenu> getConfAccessMenuList() {
        return confAccessMenuList;
    }

    public void setConfAccessMenuList(List<ConfAccessMenu> confAccessMenuList) {
        this.confAccessMenuList = confAccessMenuList;
    }

    public ApStaff getIdApStaff() {
        return idApStaff;
    }

    public void setIdApStaff(ApStaff idApStaff) {
        this.idApStaff = idApStaff;
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
        if (!(object instanceof ApLogin)) {
            return false;
        }
        ApLogin other = (ApLogin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApLogin[ id=" + id + " ]";
    }
    
}
