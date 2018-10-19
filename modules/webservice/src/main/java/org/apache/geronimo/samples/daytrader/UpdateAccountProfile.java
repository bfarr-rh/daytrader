
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
 *         &lt;element name="profileData" type="{http://daytrader.samples.geronimo.apache.org}AccountProfileDataBean"/&gt;
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
    "profileData"
})
@XmlRootElement(name = "updateAccountProfile")
public class UpdateAccountProfile {

    @XmlElement(required = true, nillable = true)
    protected AccountProfileDataBean profileData;

    /**
     * Gets the value of the profileData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public AccountProfileDataBean getProfileData() {
        return profileData;
    }

    /**
     * Sets the value of the profileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProfileDataBean }
     *     
     */
    public void setProfileData(AccountProfileDataBean value) {
        this.profileData = value;
    }

}
