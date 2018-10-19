
package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="completionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="orderFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDataBean", propOrder = {
    "orderID",
    "orderType",
    "orderStatus",
    "openDate",
    "completionDate",
    "quantity",
    "price",
    "orderFee",
    "symbol"
})
public class OrderDataBean {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orderID;
    @XmlElement(required = true, nillable = true)
    protected String orderType;
    @XmlElement(required = true, nillable = true)
    protected String orderStatus;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    protected double quantity;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal price;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal orderFee;
    @XmlElement(required = true, nillable = true)
    protected String symbol;

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
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the orderFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderFee() {
        return orderFee;
    }

    /**
     * Sets the value of the orderFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderFee(BigDecimal value) {
        this.orderFee = value;
    }

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

}
