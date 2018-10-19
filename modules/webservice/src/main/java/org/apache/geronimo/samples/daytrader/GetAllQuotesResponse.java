
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
 *         &lt;element name="getAllQuotesReturn" type="{http://daytrader.samples.geronimo.apache.org}ArrayOfQuoteDataBean"/&gt;
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
    "getAllQuotesReturn"
})
@XmlRootElement(name = "getAllQuotesResponse")
public class GetAllQuotesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfQuoteDataBean getAllQuotesReturn;

    /**
     * Gets the value of the getAllQuotesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public ArrayOfQuoteDataBean getGetAllQuotesReturn() {
        return getAllQuotesReturn;
    }

    /**
     * Sets the value of the getAllQuotesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuoteDataBean }
     *     
     */
    public void setGetAllQuotesReturn(ArrayOfQuoteDataBean value) {
        this.getAllQuotesReturn = value;
    }

}
