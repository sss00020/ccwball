/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccw;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "departmentht")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departmentht.findAll", query = "SELECT d FROM Departmentht d"),
    @NamedQuery(name = "Departmentht.findByDepID", query = "SELECT d FROM Departmentht d WHERE d.depID = :depID"),
    @NamedQuery(name = "Departmentht.findByDepName", query = "SELECT d FROM Departmentht d WHERE d.depName = :depName")})
public class Departmentht implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "Dep_ID")
    private String depID;
    @Size(max = 20)
    @Column(name = "Dep_Name")
    private String depName;

    public Departmentht() {
    }

    public Departmentht(String depID) {
        this.depID = depID;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depID != null ? depID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departmentht)) {
            return false;
        }
        Departmentht other = (Departmentht) object;
        if ((this.depID == null && other.depID != null) || (this.depID != null && !this.depID.equals(other.depID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccw.Departmentht[ depID=" + depID + " ]";
    }
    
}
