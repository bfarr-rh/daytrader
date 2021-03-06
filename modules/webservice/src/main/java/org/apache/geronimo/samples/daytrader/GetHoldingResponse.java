
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
 *         &lt;element name="getHoldingReturn" type="{http://daytrader.samples.geronimo.apache.org}HoldingDataBean"/&gt;
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
    "getHoldingReturn"
})
@XmlRootElement(name = "getHoldingResponse")
public class GetHoldingResponse {

    @XmlElement(required = true, nillable = true)
    protected HoldingDataBean getHoldingReturn;

    /**
     * Gets the value of the getHoldingReturn property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingDataBean }
     *     
     */
    public HoldingDataBean getGetHoldingReturn() {
        return getHoldingReturn;
    }

    /**
     * Sets the value of the getHoldingReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingDataBean }
     *     
     */
    public void setGetHoldingReturn(HoldingDataBean value) {
        this.getHoldingReturn = value;
    }

}
