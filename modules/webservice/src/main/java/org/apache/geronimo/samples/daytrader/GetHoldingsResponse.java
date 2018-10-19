
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
 *         &lt;element name="getHoldingsReturn" type="{http://daytrader.samples.geronimo.apache.org}ArrayOfHoldingDataBean"/&gt;
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
    "getHoldingsReturn"
})
@XmlRootElement(name = "getHoldingsResponse")
public class GetHoldingsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfHoldingDataBean getHoldingsReturn;

    /**
     * Gets the value of the getHoldingsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHoldingDataBean }
     *     
     */
    public ArrayOfHoldingDataBean getGetHoldingsReturn() {
        return getHoldingsReturn;
    }

    /**
     * Sets the value of the getHoldingsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHoldingDataBean }
     *     
     */
    public void setGetHoldingsReturn(ArrayOfHoldingDataBean value) {
        this.getHoldingsReturn = value;
    }

}
