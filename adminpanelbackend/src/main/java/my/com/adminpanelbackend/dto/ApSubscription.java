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
@Table(name = "ap_subscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApSubscription.findAll", query = "SELECT a FROM ApSubscription a"),
    @NamedQuery(name = "ApSubscription.findById", query = "SELECT a FROM ApSubscription a WHERE a.id = :id"),
    @NamedQuery(name = "ApSubscription.findBySubscriptionNo", query = "SELECT a FROM ApSubscription a WHERE a.subscriptionNo = :subscriptionNo"),
    @NamedQuery(name = "ApSubscription.findBySubscriptionDate", query = "SELECT a FROM ApSubscription a WHERE a.subscriptionDate = :subscriptionDate"),
    @NamedQuery(name = "ApSubscription.findByIdApPackage", query = "SELECT a FROM ApSubscription a WHERE a.idApPackage = :idApPackage"),
    @NamedQuery(name = "ApSubscription.findByActive", query = "SELECT a FROM ApSubscription a WHERE a.active = :active"),
    @NamedQuery(name = "ApSubscription.findByCreatedBy", query = "SELECT a FROM ApSubscription a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApSubscription.findByCreatedDate", query = "SELECT a FROM ApSubscription a WHERE a.createdDate = :createdDate")})
public class ApSubscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "subscription_no")
    private String subscriptionNo;
    @Column(name = "subscription_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date subscriptionDate;
    @Column(name = "id_ap_package")
    private Integer idApPackage;
    @Column(name = "active")
    private Integer active;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "id_ap_client", referencedColumnName = "id")
    @ManyToOne
    private ApClient idApClient;
    @OneToMany(mappedBy = "idApSubscription")
    private List<FinBill> finBillList;
    @OneToMany(mappedBy = "idApSubscription")
    private List<ApPackage> apPackageList;

    public ApSubscription() {
    }

    public ApSubscription(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubscriptionNo() {
        return subscriptionNo;
    }

    public void setSubscriptionNo(String subscriptionNo) {
        this.subscriptionNo = subscriptionNo;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Integer getIdApPackage() {
        return idApPackage;
    }

    public void setIdApPackage(Integer idApPackage) {
        this.idApPackage = idApPackage;
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

    public ApClient getIdApClient() {
        return idApClient;
    }

    public void setIdApClient(ApClient idApClient) {
        this.idApClient = idApClient;
    }

    @XmlTransient
    public List<FinBill> getFinBillList() {
        return finBillList;
    }

    public void setFinBillList(List<FinBill> finBillList) {
        this.finBillList = finBillList;
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
        if (!(object instanceof ApSubscription)) {
            return false;
        }
        ApSubscription other = (ApSubscription) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApSubscription[ id=" + id + " ]";
    }
    
}
