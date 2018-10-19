
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
 *         &lt;element name="getAccountDataReturn" type="{http://daytrader.samples.geronimo.apache.org}AccountDataBean"/&gt;
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
    "getAccountDataReturn"
})
@XmlRootElement(name = "getAccountDataResponse")
public class GetAccountDataResponse {

    @XmlElement(required = true, nillable = true)
    protected AccountDataBean getAccountDataReturn;

    /**
     * Gets the value of the getAccountDataReturn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDataBean }
     *     
     */
    public AccountDataBean getGetAccountDataReturn() {
        return getAccountDataReturn;
    }

    /**
     * Sets the value of the getAccountDataReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDataBean }
     *     
     */
    public void setGetAccountDataReturn(AccountDataBean value) {
        this.getAccountDataReturn = value;
    }

}
