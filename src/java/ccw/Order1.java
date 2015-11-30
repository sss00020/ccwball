/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
    @NamedQuery(name = "Order1.findByMemId", query = "SELECT o FROM Order1 o WHERE o.memId = :memId"),
    @NamedQuery(name = "Order1.findByProNo", query = "SELECT o FROM Order1 o WHERE o.proNo = :proNo"),
    @NamedQuery(name = "Order1.findByTimeIn", query = "SELECT o FROM Order1 o WHERE o.timeIn = :timeIn"),
    @NamedQuery(name = "Order1.findByAmount", query = "SELECT o FROM Order1 o WHERE o.amount = :amount"),
    @NamedQuery(name = "Order1.findByTotal", query = "SELECT o FROM Order1 o WHERE o.total = :total"),
    @NamedQuery(name = "Order1.findByTimeOut", query = "SELECT o FROM Order1 o WHERE o.timeOut = :timeOut"),
    @NamedQuery(name = "Order1.findByEmpId", query = "SELECT o FROM Order1 o WHERE o.empId = :empId"),
    @NamedQuery(name = "Order1.findByMsgId", query = "SELECT o FROM Order1 o WHERE o.msgId = :msgId"),
    @NamedQuery(name = "Order1.findByCampId", query = "SELECT o FROM Order1 o WHERE o.campId = :campId")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    @Column(name = "time_in")
    @Temporal(TemporalType.DATE)
    private Date timeIn;
    @Column(name = "amount")
    private Integer amount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "time_out")
    @Temporal(TemporalType.DATE)
    private Date timeOut;
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
    @Size(max = 10)
    @Column(name = "camp_id")
    private String campId;
    @OneToMany(mappedBy = "memId")
    private Collection<Product> productCollection;

    public Order1() {
    }

    public Order1(String memId) {
        this.memId = memId;
    }

    public Order1(String memId, String proNo, String empId, String msgId) {
        this.memId = memId;
        this.proNo = proNo;
        this.empId = empId;
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

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
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

    public String getCampId() {
        return campId;
    }

    public void setCampId(String campId) {
        this.campId = campId;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memId != null ? memId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.memId == null && other.memId != null) || (this.memId != null && !this.memId.equals(other.memId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccw.Order1[ memId=" + memId + " ]";
    }
    
}
