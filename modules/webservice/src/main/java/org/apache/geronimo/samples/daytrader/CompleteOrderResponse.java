
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
 *         &lt;element name="completeOrderReturn" type="{http://daytrader.samples.geronimo.apache.org}OrderDataBean"/&gt;
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
    "completeOrderReturn"
})
@XmlRootElement(name = "completeOrderResponse")
public class CompleteOrderResponse {

    @XmlElement(required = true, nillable = true)
    protected OrderDataBean completeOrderReturn;

    /**
     * Gets the value of the completeOrderReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDataBean }
     *     
     */
    public OrderDataBean getCompleteOrderReturn() {
        return completeOrderReturn;
    }

    /**
     * Sets the value of the completeOrderReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDataBean }
     *     
     */
    public void setCompleteOrderReturn(OrderDataBean value) {
        this.completeOrderReturn = value;
    }

}
