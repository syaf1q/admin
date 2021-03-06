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
@Table(name = "conf_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfMenu.findAll", query = "SELECT c FROM ConfMenu c"),
    @NamedQuery(name = "ConfMenu.findById", query = "SELECT c FROM ConfMenu c WHERE c.id = :id"),
    @NamedQuery(name = "ConfMenu.findByMenu", query = "SELECT c FROM ConfMenu c WHERE c.menu = :menu"),
    @NamedQuery(name = "ConfMenu.findByUrl", query = "SELECT c FROM ConfMenu c WHERE c.url = :url"),
    @NamedQuery(name = "ConfMenu.findByActive", query = "SELECT c FROM ConfMenu c WHERE c.active = :active")})
public class ConfMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "menu")
    private String menu;
    @Column(name = "url")
    private String url;
    @Column(name = "active")
    private Integer active;
    @OneToMany(mappedBy = "idConfMenu")
    private List<ConfSubmenu> confSubmenuList;

    public ConfMenu() {
    }

    public ConfMenu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
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

    @XmlTransient
    public List<ConfSubmenu> getConfSubmenuList() {
        return confSubmenuList;
    }

    public void setConfSubmenuList(List<ConfSubmenu> confSubmenuList) {
        this.confSubmenuList = confSubmenuList;
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
        if (!(object instanceof ConfMenu)) {
            return false;
        }
        ConfMenu other = (ConfMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ConfMenu[ id=" + id + " ]";
    }
    
}
