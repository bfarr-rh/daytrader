
package org.apache.geronimo.samples.daytrader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="twoPhase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderID",
    "twoPhase"
})
@XmlRootElement(name = "queueOrder")
public class QueueOrder {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orderID;
    protected boolean twoPhase;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderID(Integer value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the twoPhase property.
     * 
     */
    public boolean isTwoPhase() {
        return twoPhase;
    }

    /**
     * Sets the value of the twoPhase property.
     * 
     */
    public void setTwoPhase(boolean value) {
        this.twoPhase = value;
    }

}
