
package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;
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
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sharesTraded" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "symbol",
    "newPrice",
    "sharesTraded"
})
@XmlRootElement(name = "updateQuotePriceVolume")
public class UpdateQuotePriceVolume {

    @XmlElement(required = true, nillable = true)
    protected String symbol;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal newPrice;
    protected double sharesTraded;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewPrice(BigDecimal value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the sharesTraded property.
     * 
     */
    public double getSharesTraded() {
        return sharesTraded;
    }

    /**
     * Sets the value of the sharesTraded property.
     * 
     */
    public void setSharesTraded(double value) {
        this.sharesTraded = value;
    }

}
