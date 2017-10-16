/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.adminpanelbackend.dto;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author syafiq
 */
@Entity
@Table(name = "ap_package")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApPackage.findAll", query = "SELECT a FROM ApPackage a"),
    @NamedQuery(name = "ApPackage.findById", query = "SELECT a FROM ApPackage a WHERE a.id = :id"),
    @NamedQuery(name = "ApPackage.findByPackageName", query = "SELECT a FROM ApPackage a WHERE a.packageName = :packageName"),
    @NamedQuery(name = "ApPackage.findByPackageValue", query = "SELECT a FROM ApPackage a WHERE a.packageValue = :packageValue"),
    @NamedQuery(name = "ApPackage.findByPackageExpired", query = "SELECT a FROM ApPackage a WHERE a.packageExpired = :packageExpired"),
    @NamedQuery(name = "ApPackage.findByCreatedBy", query = "SELECT a FROM ApPackage a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApPackage.findByCreatedDate", query = "SELECT a FROM ApPackage a WHERE a.createdDate = :createdDate")})
public class ApPackage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "package_name")
    private String packageName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "package_value")
    private Double packageValue;
    @Column(name = "package_expired")
    @Temporal(TemporalType.DATE)
    private Date packageExpired;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "id_conf_system", referencedColumnName = "id")
    @ManyToOne
    private ConfSystem idConfSystem;
    @JoinColumn(name = "id_ap_subscription", referencedColumnName = "id")
    @ManyToOne
    private ApSubscription idApSubscription;

    public ApPackage() {
    }

    public ApPackage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(Double packageValue) {
        this.packageValue = packageValue;
    }

    public Date getPackageExpired() {
        return packageExpired;
    }

    public void setPackageExpired(Date packageExpired) {
        this.packageExpired = packageExpired;
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

    public ConfSystem getIdConfSystem() {
        return idConfSystem;
    }

    public void setIdConfSystem(ConfSystem idConfSystem) {
        this.idConfSystem = idConfSystem;
    }

    public ApSubscription getIdApSubscription() {
        return idApSubscription;
    }

    public void setIdApSubscription(ApSubscription idApSubscription) {
        this.idApSubscription = idApSubscription;
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
        if (!(object instanceof ApPackage)) {
            return false;
        }
        ApPackage other = (ApPackage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApPackage[ id=" + id + " ]";
    }
    
}
