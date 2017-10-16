/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.adminpanelbackend.dto;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author syafiq
 */
@Entity
@Table(name = "fin_transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinTransaction.findAll", query = "SELECT f FROM FinTransaction f"),
    @NamedQuery(name = "FinTransaction.findById", query = "SELECT f FROM FinTransaction f WHERE f.id = :id"),
    @NamedQuery(name = "FinTransaction.findByIdConfFinanceCode", query = "SELECT f FROM FinTransaction f WHERE f.idConfFinanceCode = :idConfFinanceCode"),
    @NamedQuery(name = "FinTransaction.findByIdFinResit", query = "SELECT f FROM FinTransaction f WHERE f.idFinResit = :idFinResit")})
public class FinTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_conf_finance_code")
    private Integer idConfFinanceCode;
    @Column(name = "id_fin_resit")
    private Integer idFinResit;
    @OneToMany(mappedBy = "idFinTransaction")
    private List<FinTransactionDetail> finTransactionDetailList;

    public FinTransaction() {
    }

    public FinTransaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdConfFinanceCode() {
        return idConfFinanceCode;
    }

    public void setIdConfFinanceCode(Integer idConfFinanceCode) {
        this.idConfFinanceCode = idConfFinanceCode;
    }

    public Integer getIdFinResit() {
        return idFinResit;
    }

    public void setIdFinResit(Integer idFinResit) {
        this.idFinResit = idFinResit;
    }

    @XmlTransient
    public List<FinTransactionDetail> getFinTransactionDetailList() {
        return finTransactionDetailList;
    }

    public void setFinTransactionDetailList(List<FinTransactionDetail> finTransactionDetailList) {
        this.finTransactionDetailList = finTransactionDetailList;
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
        if (!(object instanceof FinTransaction)) {
            return false;
        }
        FinTransaction other = (FinTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.FinTransaction[ id=" + id + " ]";
    }
    
}
