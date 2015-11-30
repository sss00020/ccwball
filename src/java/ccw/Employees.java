/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccw;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "employees")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByEmpId", query = "SELECT e FROM Employees e WHERE e.employeesPK.empId = :empId"),
    @NamedQuery(name = "Employees.findByMsgId", query = "SELECT e FROM Employees e WHERE e.employeesPK.msgId = :msgId"),
    @NamedQuery(name = "Employees.findByName", query = "SELECT e FROM Employees e WHERE e.name = :name"),
    @NamedQuery(name = "Employees.findBySername", query = "SELECT e FROM Employees e WHERE e.sername = :sername"),
    @NamedQuery(name = "Employees.findByAddress", query = "SELECT e FROM Employees e WHERE e.address = :address"),
    @NamedQuery(name = "Employees.findByTel", query = "SELECT e FROM Employees e WHERE e.tel = :tel"),
    @NamedQuery(name = "Employees.findByMemId", query = "SELECT e FROM Employees e WHERE e.employeesPK.memId = :memId"),
    @NamedQuery(name = "Employees.findByProNo", query = "SELECT e FROM Employees e WHERE e.employeesPK.proNo = :proNo")})
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeesPK employeesPK;
    @Size(max = 40)
    @Column(name = "name")
    private String name;
    @Size(max = 40)
    @Column(name = "sername")
    private String sername;
    @Size(max = 60)
    @Column(name = "address")
    private String address;
    @Size(max = 10)
    @Column(name = "tel")
    private String tel;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne
    private Branch branchId;

    public Employees() {
    }

    public Employees(EmployeesPK employeesPK) {
        this.employeesPK = employeesPK;
    }

    public Employees(String empId, String msgId, String memId, String proNo) {
        this.employeesPK = new EmployeesPK(empId, msgId, memId, proNo);
    }

    public EmployeesPK getEmployeesPK() {
        return employeesPK;
    }

    public void setEmployeesPK(EmployeesPK employeesPK) {
        this.employeesPK = employeesPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Branch getBranchId() {
        return branchId;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeesPK != null ? employeesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.employeesPK == null && other.employeesPK != null) || (this.employeesPK != null && !this.employeesPK.equals(other.employeesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccw.Employees[ employeesPK=" + employeesPK + " ]";
    }
    
}
