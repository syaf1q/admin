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
import javax.persistence.Lob;
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
@Table(name = "ap_staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApStaff.findAll", query = "SELECT a FROM ApStaff a"),
    @NamedQuery(name = "ApStaff.findById", query = "SELECT a FROM ApStaff a WHERE a.id = :id"),
    @NamedQuery(name = "ApStaff.findByName", query = "SELECT a FROM ApStaff a WHERE a.name = :name"),
    @NamedQuery(name = "ApStaff.findByStaffCode", query = "SELECT a FROM ApStaff a WHERE a.staffCode = :staffCode"),
    @NamedQuery(name = "ApStaff.findByNoKp", query = "SELECT a FROM ApStaff a WHERE a.noKp = :noKp"),
    @NamedQuery(name = "ApStaff.findByGender", query = "SELECT a FROM ApStaff a WHERE a.gender = :gender"),
    @NamedQuery(name = "ApStaff.findByDob", query = "SELECT a FROM ApStaff a WHERE a.dob = :dob"),
    @NamedQuery(name = "ApStaff.findByActive", query = "SELECT a FROM ApStaff a WHERE a.active = :active")})
public class ApStaff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "staff_code")
    private String staffCode;
    @Column(name = "no_kp")
    private Integer noKp;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Lob
    @Column(name = "address")
    private String address;
    @Column(name = "active")
    private Integer active;
    @OneToMany(mappedBy = "idApStaff")
    private List<ApLogin> apLoginList;
    @JoinColumn(name = "id_conf_roles", referencedColumnName = "id")
    @ManyToOne
    private ConfRoles idConfRoles;

    public ApStaff() {
    }

    public ApStaff(Integer id) {
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

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public Integer getNoKp() {
        return noKp;
    }

    public void setNoKp(Integer noKp) {
        this.noKp = noKp;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @XmlTransient
    public List<ApLogin> getApLoginList() {
        return apLoginList;
    }

    public void setApLoginList(List<ApLogin> apLoginList) {
        this.apLoginList = apLoginList;
    }

    public ConfRoles getIdConfRoles() {
        return idConfRoles;
    }

    public void setIdConfRoles(ConfRoles idConfRoles) {
        this.idConfRoles = idConfRoles;
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
        if (!(object instanceof ApStaff)) {
            return false;
        }
        ApStaff other = (ApStaff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ApStaff[ id=" + id + " ]";
    }
    
}
