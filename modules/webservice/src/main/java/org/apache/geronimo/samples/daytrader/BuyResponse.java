
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
 *         &lt;element name="buyReturn" type="{http://daytrader.samples.geronimo.apache.org}OrderDataBean"/&gt;
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
    "buyReturn"
})
@XmlRootElement(name = "buyResponse")
public class BuyResponse {

    @XmlElement(required = true, nillable = true)
    protected OrderDataBean buyReturn;

    /**
     * Gets the value of the buyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDataBean }
     *     
     */
    public OrderDataBean getBuyReturn() {
        return buyReturn;
    }

    /**
     * Sets the value of the buyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDataBean }
     *     
     */
    public void setBuyReturn(OrderDataBean value) {
        this.buyReturn = value;
    }

}
