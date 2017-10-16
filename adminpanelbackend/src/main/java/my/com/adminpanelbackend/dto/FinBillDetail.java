/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.adminpanelbackend.dto;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author syafiq
 */
@Entity
@Table(name = "fin_bill_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinBillDetail.findAll", query = "SELECT f FROM FinBillDetail f"),
    @NamedQuery(name = "FinBillDetail.findById", query = "SELECT f FROM FinBillDetail f WHERE f.id = :id"),
    @NamedQuery(name = "FinBillDetail.findByBillNo", query = "SELECT f FROM FinBillDetail f WHERE f.billNo = :billNo"),
    @NamedQuery(name = "FinBillDetail.findByBillDate", query = "SELECT f FROM FinBillDetail f WHERE f.billDate = :billDate"),
    @NamedQuery(name = "FinBillDetail.findByBilMonth", query = "SELECT f FROM FinBillDetail f WHERE f.bilMonth = :bilMonth"),
    @NamedQuery(name = "FinBillDetail.findByBilYear", query = "SELECT f FROM FinBillDetail f WHERE f.bilYear = :bilYear"),
    @NamedQuery(name = "FinBillDetail.findByAmount", query = "SELECT f FROM FinBillDetail f WHERE f.amount = :amount")})
public class FinBillDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "bill_no")
    private String billNo;
    @Column(name = "bill_date")
    private String billDate;
    @Column(name = "bil_month")
    private Integer bilMonth;
    @Column(name = "bil_year")
    private Integer bilYear;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @JoinColumn(name = "id_fin_bil", referencedColumnName = "id")
    @ManyToOne
    private FinBill idFinBil;
    @JoinColumn(name = "id_conf_finance_code", referencedColumnName = "id")
    @ManyToOne
    private ConfFinanceCode idConfFinanceCode;

    public FinBillDetail() {
    }

    public FinBillDetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public Integer getBilMonth() {
        return bilMonth;
    }

    public void setBilMonth(Integer bilMonth) {
        this.bilMonth = bilMonth;
    }

    public Integer getBilYear() {
        return bilYear;
    }

    public void setBilYear(Integer bilYear) {
        this.bilYear = bilYear;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FinBill getIdFinBil() {
        return idFinBil;
    }

    public void setIdFinBil(FinBill idFinBil) {
        this.idFinBil = idFinBil;
    }

    public ConfFinanceCode getIdConfFinanceCode() {
        return idConfFinanceCode;
    }

    public void setIdConfFinanceCode(ConfFinanceCode idConfFinanceCode) {
        this.idConfFinanceCode = idConfFinanceCode;
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
        if (!(object instanceof FinBillDetail)) {
            return false;
        }
        FinBillDetail other = (FinBillDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.FinBillDetail[ id=" + id + " ]";
    }
    
}
