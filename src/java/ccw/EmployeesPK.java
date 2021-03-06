/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccw;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Tan
 */
@Embeddable
public class EmployeesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "emp_id")
    private String empId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "msg_id")
    private String msgId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "mem_id")
    private String memId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pro_no")
    private String proNo;

    public EmployeesPK() {
    }

    public EmployeesPK(String empId, String msgId, String memId, String proNo) {
        this.empId = empId;
        this.msgId = msgId;
        this.memId = memId;
        this.proNo = proNo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        hash += (msgId != null ? msgId.hashCode() : 0);
        hash += (memId != null ? memId.hashCode() : 0);
        hash += (proNo != null ? proNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeesPK)) {
            return false;
        }
        EmployeesPK other = (EmployeesPK) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        if ((this.memId == null && other.memId != null) || (this.memId != null && !this.memId.equals(other.memId))) {
            return false;
        }
        if ((this.proNo == null && other.proNo != null) || (this.proNo != null && !this.proNo.equals(other.proNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccw.EmployeesPK[ empId=" + empId + ", msgId=" + msgId + ", memId=" + memId + ", proNo=" + proNo + " ]";
    }
    
}
