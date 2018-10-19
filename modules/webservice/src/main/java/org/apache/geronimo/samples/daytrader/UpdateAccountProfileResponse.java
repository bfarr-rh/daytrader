
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
 *         &lt;element name="updateAccountProfileReturn" type="{http://daytrader.samples.geronimo.apache.org}AccountProfileDataBean"/&gt;
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
    "updateAccountProfileReturn"
})
@XmlRootElement(name = "updateAccountProfileResponse")
public class UpdateAccountProfileResponse {

    @XmlElement(required = true, nillable = true)
    protected AccountProfileDataBean updateAccountProfileReturn;

    /**
     * Gets the value of the updateAccountProfileReturn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public AccountProfileDataBean getUpdateAccountProfileReturn() {
        return updateAccountProfileReturn;
    }

    /**
     * Sets the value of the updateAccountProfileReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public void setUpdateAccountProfileReturn(AccountProfileDataBean value) {
        this.updateAccountProfileReturn = value;
    }

}
