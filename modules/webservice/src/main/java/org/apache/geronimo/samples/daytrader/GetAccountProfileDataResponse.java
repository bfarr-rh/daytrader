
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
 *         &lt;element name="getAccountProfileDataReturn" type="{http://daytrader.samples.geronimo.apache.org}AccountProfileDataBean"/&gt;
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
    "getAccountProfileDataReturn"
})
@XmlRootElement(name = "getAccountProfileDataResponse")
public class GetAccountProfileDataResponse {

    @XmlElement(required = true, nillable = true)
    protected AccountProfileDataBean getAccountProfileDataReturn;

    /**
     * Gets the value of the getAccountProfileDataReturn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public AccountProfileDataBean getGetAccountProfileDataReturn() {
        return getAccountProfileDataReturn;
    }

    /**
     * Sets the value of the getAccountProfileDataReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public void setGetAccountProfileDataReturn(AccountProfileDataBean value) {
        this.getAccountProfileDataReturn = value;
    }

}
