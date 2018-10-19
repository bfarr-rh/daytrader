
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
 *         &lt;element name="createQuoteReturn" type="{http://daytrader.samples.geronimo.apache.org}QuoteDataBean"/&gt;
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
    "createQuoteReturn"
})
@XmlRootElement(name = "createQuoteResponse")
public class CreateQuoteResponse {

    @XmlElement(required = true, nillable = true)
    protected QuoteDataBean createQuoteReturn;

    /**
     * Gets the value of the createQuoteReturn property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteDataBean }
     *     
     */
    public QuoteDataBean getCreateQuoteReturn() {
        return createQuoteReturn;
    }

    /**
     * Sets the value of the createQuoteReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteDataBean }
     *     
     */
    public void setCreateQuoteReturn(QuoteDataBean value) {
        this.createQuoteReturn = value;
    }

}
