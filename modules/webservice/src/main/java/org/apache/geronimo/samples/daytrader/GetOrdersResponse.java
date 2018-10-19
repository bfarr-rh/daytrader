
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
 *         &lt;element name="getOrdersReturn" type="{http://daytrader.samples.geronimo.apache.org}ArrayOfOrderDataBean"/&gt;
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
    "getOrdersReturn"
})
@XmlRootElement(name = "getOrdersResponse")
public class GetOrdersResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfOrderDataBean getOrdersReturn;

    /**
     * Gets the value of the getOrdersReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderDataBean }
     *     
     */
    public ArrayOfOrderDataBean getGetOrdersReturn() {
        return getOrdersReturn;
    }

    /**
     * Sets the value of the getOrdersReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderDataBean }
     *     
     */
    public void setGetOrdersReturn(ArrayOfOrderDataBean value) {
        this.getOrdersReturn = value;
    }

}
