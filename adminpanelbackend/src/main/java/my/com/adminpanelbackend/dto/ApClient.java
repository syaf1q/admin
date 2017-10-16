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
@Table(name = "ap_client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApClient.findAll", query = "SELECT a FROM ApClient a"),
    @NamedQuery(name = "ApClient.findById", query = "SELECT a FROM ApClient a WHERE a.id = :id"),
    @NamedQuery(name = "ApClient.findByCompanyCode", query = "SELECT a FROM ApClient a WHERE a.companyCode = :companyCode"),
    @NamedQuery(name = "ApClient.findByContactPersonName", query = "SELECT a FROM ApClient a WHERE a.contactPersonName = :contactPersonName"),
    @NamedQuery(name = "ApClient.findByContactPersonHp", query = "SELECT a FROM ApClient a WHERE a.contactPersonHp = :contactPersonHp"),
    @NamedQuery(name = "ApClient.findByRegisterAccountDate", query = "SELECT a FROM ApClient a WHERE a.registerAccountDate = :registerAccountDate"),
    @NamedQuery(name = "ApClient.findByActive", query = "SELECT a FROM ApClient a WHERE a.active = :active"),
    @NamedQuery(name = "ApClient.findByCreatedBy", query = "SELECT a FROM ApClient a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApClient.findByCreatedDate", query = "SELECT a FROM ApClient a WHERE a.createdDate = :createdDate")})
public class ApClient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "company_code")
    private String companyCode;
    @Column(name = "contact_person_name")
    private String contactPersonName;
    @Column(name = "contact_person_hp")
    private String contactPersonHp;
    @Column(name = "register_account_date")
    @Temporal(TemporalType.DATE)
    private Date registerAccountDate;
    @Column(name = "active")
    private Integer active;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(mappedBy = "idApClient")
    private List<ApSubscription> apSubscriptionList;
    @OneToMany(mappedBy = "idApClient")
    private List<ApClientDetail> apClientDetailList;

    public ApClient() {
    }

    public ApClient(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonHp() {
        return contactPersonHp;
    }

    public void setContactPersonHp(String contactPersonHp) {
        this.contactPersonHp = contactPersonHp;
    }

    public Date getRegisterAccountDate() {
        return registerAccountDate;
    }

    public void setRegisterAccountDate(Date registerAccountDate) {
        this.registerAccountDate = registerAccountDate;
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
    public List<ApSubscription> getApSubscriptionList() {
        return apSubscriptionList;
    }

    public void setApSubscriptionList(List<ApSubscription> apSubscriptionList) {
        this.apSubscriptionList = apSubscriptionList;
    }

    @XmlTransient
    public List<ApClientDetail> getApClientDetailList() {
        return apClientDetailList;
    }

    public void setApClientDetailList(List<ApClientDetail> apClientDetailList) {
        this.apClientDetailList = apClientDetailList;
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
        if (!(object instanceof ApClient)) {
            return false;
        }
        ApClient other = (ApClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApClient[ id=" + id + " ]";
    }
    
}
