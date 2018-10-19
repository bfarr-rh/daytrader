
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
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="holdingID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderProcessingMode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "userID",
    "holdingID",
    "orderProcessingMode"
})
@XmlRootElement(name = "sell")
public class Sell {

    @XmlElement(required = true, nillable = true)
    protected String userID;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer holdingID;
    protected int orderProcessingMode;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the holdingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoldingID() {
        return holdingID;
    }

    /**
     * Sets the value of the holdingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoldingID(Integer value) {
        this.holdingID = value;
    }

    /**
     * Gets the value of the orderProcessingMode property.
     * 
     */
    public int getOrderProcessingMode() {
        return orderProcessingMode;
    }

    /**
     * Sets the value of the orderProcessingMode property.
     * 
     */
    public void setOrderProcessingMode(int value) {
        this.orderProcessingMode = value;
    }

}
