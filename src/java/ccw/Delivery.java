/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccw;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "delivery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d"),
    @NamedQuery(name = "Delivery.findByMemId", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.memId = :memId"),
    @NamedQuery(name = "Delivery.findByMsgId", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.msgId = :msgId"),
    @NamedQuery(name = "Delivery.findByProNo", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.proNo = :proNo"),
    @NamedQuery(name = "Delivery.findByEmpId", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.empId = :empId")})
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeliveryPK deliveryPK;

    public Delivery() {
    }

    public Delivery(DeliveryPK deliveryPK) {
        this.deliveryPK = deliveryPK;
    }

    public Delivery(String memId, String msgId, String proNo, String empId) {
        this.deliveryPK = new DeliveryPK(memId, msgId, proNo, empId);
    }

    public DeliveryPK getDeliveryPK() {
        return deliveryPK;
    }

    public void setDeliveryPK(DeliveryPK deliveryPK) {
        this.deliveryPK = deliveryPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryPK != null ? deliveryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryPK == null && other.deliveryPK != null) || (this.deliveryPK != null && !this.deliveryPK.equals(other.deliveryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccw.Delivery[ deliveryPK=" + deliveryPK + " ]";
    }
    
}
