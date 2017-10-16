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
@Table(name = "fin_bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinBill.findAll", query = "SELECT f FROM FinBill f"),
    @NamedQuery(name = "FinBill.findById", query = "SELECT f FROM FinBill f WHERE f.id = :id"),
    @NamedQuery(name = "FinBill.findByLatestBillDate", query = "SELECT f FROM FinBill f WHERE f.latestBillDate = :latestBillDate"),
    @NamedQuery(name = "FinBill.findByTotalBillAmount", query = "SELECT f FROM FinBill f WHERE f.totalBillAmount = :totalBillAmount"),
    @NamedQuery(name = "FinBill.findByCreatedBy", query = "SELECT f FROM FinBill f WHERE f.createdBy = :createdBy"),
    @NamedQuery(name = "FinBill.findByCreatedDate", query = "SELECT f FROM FinBill f WHERE f.createdDate = :createdDate")})
public class FinBill implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "latest_bill_date")
    @Temporal(TemporalType.DATE)
    private Date latestBillDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_bill_amount")
    private Double totalBillAmount;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "id_ap_subscription", referencedColumnName = "id")
    @ManyToOne
    private ApSubscription idApSubscription;
    @OneToMany(mappedBy = "idConfBillType")
    private List<FinBill> finBillList;
    @JoinColumn(name = "id_conf_bill_type", referencedColumnName = "id")
    @ManyToOne
    private FinBill idConfBillType;
    @OneToMany(mappedBy = "idFinBil")
    private List<FinBillDetail> finBillDetailList;

    public FinBill() {
    }

    public FinBill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLatestBillDate() {
        return latestBillDate;
    }

    public void setLatestBillDate(Date latestBillDate) {
        this.latestBillDate = latestBillDate;
    }

    public Double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(Double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
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

    public ApSubscription getIdApSubscription() {
        return idApSubscription;
    }

    public void setIdApSubscription(ApSubscription idApSubscription) {
        this.idApSubscription = idApSubscription;
    }

    @XmlTransient
    public List<FinBill> getFinBillList() {
        return finBillList;
    }

    public void setFinBillList(List<FinBill> finBillList) {
        this.finBillList = finBillList;
    }

    public FinBill getIdConfBillType() {
        return idConfBillType;
    }

    public void setIdConfBillType(FinBill idConfBillType) {
        this.idConfBillType = idConfBillType;
    }

    @XmlTransient
    public List<FinBillDetail> getFinBillDetailList() {
        return finBillDetailList;
    }

    public void setFinBillDetailList(List<FinBillDetail> finBillDetailList) {
        this.finBillDetailList = finBillDetailList;
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
        if (!(object instanceof FinBill)) {
            return false;
        }
        FinBill other = (FinBill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.FinBill[ id=" + id + " ]";
    }
    
}
