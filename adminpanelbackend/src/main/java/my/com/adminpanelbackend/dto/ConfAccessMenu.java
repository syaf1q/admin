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
@Table(name = "conf_access_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfAccessMenu.findAll", query = "SELECT c FROM ConfAccessMenu c"),
    @NamedQuery(name = "ConfAccessMenu.findById", query = "SELECT c FROM ConfAccessMenu c WHERE c.id = :id")})
public class ConfAccessMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id_conf_submenu", referencedColumnName = "id")
    @ManyToOne
    private ConfSubmenu idConfSubmenu;
    @JoinColumn(name = "id_ap_login", referencedColumnName = "id")
    @ManyToOne
    private ApLogin idApLogin;

    public ConfAccessMenu() {
    }

    public ConfAccessMenu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ConfSubmenu getIdConfSubmenu() {
        return idConfSubmenu;
    }

    public void setIdConfSubmenu(ConfSubmenu idConfSubmenu) {
        this.idConfSubmenu = idConfSubmenu;
    }

    public ApLogin getIdApLogin() {
        return idApLogin;
    }

    public void setIdApLogin(ApLogin idApLogin) {
        this.idApLogin = idApLogin;
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
        if (!(object instanceof ConfAccessMenu)) {
            return false;
        }
        ConfAccessMenu other = (ConfAccessMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.com.adminpanelbackend.dto.ConfAccessMenu[ id=" + id + " ]";
    }
    
}
