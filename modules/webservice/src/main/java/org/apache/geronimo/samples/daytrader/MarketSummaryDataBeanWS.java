
package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarketSummaryDataBeanWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSummaryDataBeanWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSIA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="openTSIA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="topGainers" type="{http://daytrader.samples.geronimo.apache.org}ArrayOfQuoteDataBean"/&gt;
 *         &lt;element name="topLosers" type="{http://daytrader.samples.geronimo.apache.org}ArrayOfQuoteDataBean"/&gt;
 *         &lt;element name="summaryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSummaryDataBeanWS", propOrder = {
    "tsia",
    "openTSIA",
    "volume",
    "topGainers",
    "topLosers",
    "summaryDate"
})
public class MarketSummaryDataBeanWS {

    @XmlElement(name = "TSIA", required = true, nillable = true)
    protected BigDecimal tsia;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal openTSIA;
    protected double volume;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfQuoteDataBean topGainers;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfQuoteDataBean topLosers;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar summaryDate;

    /**
     * Gets the value of the tsia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSIA() {
        return tsia;
    }

    /**
     * Sets the value of the tsia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSIA(BigDecimal value) {
        this.tsia = value;
    }

    /**
     * Gets the value of the openTSIA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenTSIA() {
        return openTSIA;
    }

    /**
     * Sets the value of the openTSIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenTSIA(BigDecimal value) {
        this.openTSIA = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the topGainers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public ArrayOfQuoteDataBean getTopGainers() {
        return topGainers;
    }

    /**
     * Sets the value of the topGainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public void setTopGainers(ArrayOfQuoteDataBean value) {
        this.topGainers = value;
    }

    /**
     * Gets the value of the topLosers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public ArrayOfQuoteDataBean getTopLosers() {
        return topLosers;
    }

    /**
     * Sets the value of the topLosers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public void setTopLosers(ArrayOfQuoteDataBean value) {
        this.topLosers = value;
    }

    /**
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSummaryDate(XMLGregorianCalendar value) {
        this.summaryDate = value;
    }

}
