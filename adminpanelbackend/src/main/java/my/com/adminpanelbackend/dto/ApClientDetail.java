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
import javax.persistence.Lob;
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
@Table(name = "ap_client_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApClientDetail.findAll", query = "SELECT a FROM ApClientDetail a"),
    @NamedQuery(name = "ApClientDetail.findById", query = "SELECT a FROM ApClientDetail a WHERE a.id = :id"),
    @NamedQuery(name = "ApClientDetail.findByCompanyName", query = "SELECT a FROM ApClientDetail a WHERE a.companyName = :companyName"),
    @NamedQuery(name = "ApClientDetail.findByCompanyRegNo", query = "SELECT a FROM ApClientDetail a WHERE a.companyRegNo = :companyRegNo"),
    @NamedQuery(name = "ApClientDetail.findByCompanyGstNo", query = "SELECT a FROM ApClientDetail a WHERE a.companyGstNo = :companyGstNo"),
    @NamedQuery(name = "ApClientDetail.findByCompanyRegistrationDate", query = "SELECT a FROM ApClientDetail a WHERE a.companyRegistrationDate = :companyRegistrationDate"),
    @NamedQuery(name = "ApClientDetail.findByBranch", query = "SELECT a FROM ApClientDetail a WHERE a.branch = :branch"),
    @NamedQuery(name = "ApClientDetail.findByCountry", query = "SELECT a FROM ApClientDetail a WHERE a.country = :country"),
    @NamedQuery(name = "ApClientDetail.findByCurrency", query = "SELECT a FROM ApClientDetail a WHERE a.currency = :currency"),
    @NamedQuery(name = "ApClientDetail.findByActive", query = "SELECT a FROM ApClientDetail a WHERE a.active = :active")})
public class ApClientDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_reg_no")
    private String companyRegNo;
    @Column(name = "company_gst_no")
    private String companyGstNo;
    @Column(name = "company_registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date companyRegistrationDate;
    @Column(name = "branch")
    private String branch;
    @Lob
    @Column(name = "address")
    private String address;
    @Column(name = "country")
    private String country;
    @Column(name = "currency")
    private String currency;
    @Column(name = "active")
    private Integer active;
    @JoinColumn(name = "id_ap_client", referencedColumnName = "id")
    @ManyToOne
    private ApClient idApClient;

    public ApClientDetail() {
    }

    public ApClientDetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyRegNo() {
        return companyRegNo;
    }

    public void setCompanyRegNo(String companyRegNo) {
        this.companyRegNo = companyRegNo;
    }

    public String getCompanyGstNo() {
        return companyGstNo;
    }

    public void setCompanyGstNo(String companyGstNo) {
        this.companyGstNo = companyGstNo;
    }

    public Date getCompanyRegistrationDate() {
        return companyRegistrationDate;
    }

    public void setCompanyRegistrationDate(Date companyRegistrationDate) {
        this.companyRegistrationDate = companyRegistrationDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public ApClient getIdApClient() {
        return idApClient;
    }

    public void setIdApClient(ApClient idApClient) {
        this.idApClient = idApClient;
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
        if (!(object instanceof ApClientDetail)) {
            return false;
        }
        ApClientDetail other = (ApClientDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApClientDetail[ id=" + id + " ]";
    }
    
}
