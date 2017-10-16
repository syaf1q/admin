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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "conf_submenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfSubmenu.findAll", query = "SELECT c FROM ConfSubmenu c"),
    @NamedQuery(name = "ConfSubmenu.findById", query = "SELECT c FROM ConfSubmenu c WHERE c.id = :id"),
    @NamedQuery(name = "ConfSubmenu.findBySubmenu", query = "SELECT c FROM ConfSubmenu c WHERE c.submenu = :submenu"),
    @NamedQuery(name = "ConfSubmenu.findByUrl", query = "SELECT c FROM ConfSubmenu c WHERE c.url = :url"),
    @NamedQuery(name = "ConfSubmenu.findByActive", query = "SELECT c FROM ConfSubmenu c WHERE c.active = :active")})
public class ConfSubmenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "submenu")
    private String submenu;
    @Column(name = "url")
    private String url;
    @Column(name = "active")
    private Integer active;
    @JoinColumn(name = "id_conf_menu", referencedColumnName = "id")
    @ManyToOne
    private ConfMenu idConfMenu;
    @OneToMany(mappedBy = "idConfSubmenu")
    private List<ConfAccessMenu> confAccessMenuList;

    public ConfSubmenu() {
    }

    public ConfSubmenu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public ConfMenu getIdConfMenu() {
        return idConfMenu;
    }

    public void setIdConfMenu(ConfMenu idConfMenu) {
        this.idConfMenu = idConfMenu;
    }

    @XmlTransient
    public List<ConfAccessMenu> getConfAccessMenuList() {
        return confAccessMenuList;
    }

    public void setConfAccessMenuList(List<ConfAccessMenu> confAccessMenuList) {
        this.confAccessMenuList = confAccessMenuList;
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
        if (!(object instanceof ConfSubmenu)) {
            return false;
        }
        ConfSubmenu other = (ConfSubmenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ConfSubmenu[ id=" + id + " ]";
    }
    
}
