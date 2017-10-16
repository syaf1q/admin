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
@Table(name = "conf_finance_code")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfFinanceCode.findAll", query = "SELECT c FROM ConfFinanceCode c"),
    @NamedQuery(name = "ConfFinanceCode.findById", query = "SELECT c FROM ConfFinanceCode c WHERE c.id = :id"),
    @NamedQuery(name = "ConfFinanceCode.findByCode", query = "SELECT c FROM ConfFinanceCode c WHERE c.code = :code"),
    @NamedQuery(name = "ConfFinanceCode.findByDescription", query = "SELECT c FROM ConfFinanceCode c WHERE c.description = :description")})
public class ConfFinanceCode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "idConfFinanceCode")
    private List<FinBillDetail> finBillDetailList;

    public ConfFinanceCode() {
    }

    public ConfFinanceCode(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof ConfFinanceCode)) {
            return false;
        }
        ConfFinanceCode other = (ConfFinanceCode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ConfFinanceCode[ id=" + id + " ]";
    }
    
}
