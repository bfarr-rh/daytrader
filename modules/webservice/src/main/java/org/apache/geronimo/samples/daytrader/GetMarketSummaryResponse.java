
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
 *         &lt;element name="getMarketSummaryReturn" type="{http://daytrader.samples.geronimo.apache.org}MarketSummaryDataBeanWS"/&gt;
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
    "getMarketSummaryReturn"
})
@XmlRootElement(name = "getMarketSummaryResponse")
public class GetMarketSummaryResponse {

    @XmlElement(required = true, nillable = true)
    protected MarketSummaryDataBeanWS getMarketSummaryReturn;

    /**
     * Gets the value of the getMarketSummaryReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSummaryDataBeanWS }
     *     
     */
    public MarketSummaryDataBeanWS getGetMarketSummaryReturn() {
        return getMarketSummaryReturn;
    }

    /**
     * Sets the value of the getMarketSummaryReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSummaryDataBeanWS }
     *     
     */
    public void setGetMarketSummaryReturn(MarketSummaryDataBeanWS value) {
        this.getMarketSummaryReturn = value;
    }

}
