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
@Table(name = "conf_system")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfSystem.findAll", query = "SELECT c FROM ConfSystem c"),
    @NamedQuery(name = "ConfSystem.findById", query = "SELECT c FROM ConfSystem c WHERE c.id = :id"),
    @NamedQuery(name = "ConfSystem.findByName", query = "SELECT c FROM ConfSystem c WHERE c.name = :name"),
    @NamedQuery(name = "ConfSystem.findByCreatedBy", query = "SELECT c FROM ConfSystem c WHERE c.createdBy = :createdBy"),
    @NamedQuery(name = "ConfSystem.findByCreatedDate", query = "SELECT c FROM ConfSystem c WHERE c.createdDate = :createdDate")})
public class ConfSystem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(mappedBy = "idConfSystem")
    private List<ApPackage> apPackageList;

    public ConfSystem() {
    }

    public ConfSystem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public List<ApPackage> getApPackageList() {
        return apPackageList;
    }

    public void setApPackageList(List<ApPackage> apPackageList) {
        this.apPackageList = apPackageList;
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
        if (!(object instanceof ConfSystem)) {
            return false;
        }
        ConfSystem other = (ConfSystem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ConfSystem[ id=" + id + " ]";
    }
    
}
