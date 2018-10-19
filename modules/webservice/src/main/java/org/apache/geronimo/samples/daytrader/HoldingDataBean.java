
package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HoldingDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldingDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="holdingID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="purchasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="quoteID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingDataBean", propOrder = {
    "holdingID",
    "quantity",
    "purchasePrice",
    "purchaseDate",
    "quoteID"
})
public class HoldingDataBean {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer holdingID;
    protected double quantity;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal purchasePrice;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(required = true, nillable = true)
    protected String quoteID;

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
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the purchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchasePrice(BigDecimal value) {
        this.purchasePrice = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the quoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * Sets the value of the quoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
    }

}
