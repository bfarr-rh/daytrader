
package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loginCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="logoutCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="openBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDataBean", propOrder = {
    "accountID",
    "loginCount",
    "logoutCount",
    "lastLogin",
    "creationDate",
    "balance",
    "openBalance",
    "profileID"
})
public class AccountDataBean {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer accountID;
    protected int loginCount;
    protected int logoutCount;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal balance;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal openBalance;
    @XmlElement(required = true, nillable = true)
    protected String profileID;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountID(Integer value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the loginCount property.
     * 
     */
    public int getLoginCount() {
        return loginCount;
    }

    /**
     * Sets the value of the loginCount property.
     * 
     */
    public void setLoginCount(int value) {
        this.loginCount = value;
    }

    /**
     * Gets the value of the logoutCount property.
     * 
     */
    public int getLogoutCount() {
        return logoutCount;
    }

    /**
     * Sets the value of the logoutCount property.
     * 
     */
    public void setLogoutCount(int value) {
        this.logoutCount = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the openBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenBalance() {
        return openBalance;
    }

    /**
     * Sets the value of the openBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenBalance(BigDecimal value) {
        this.openBalance = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

}
