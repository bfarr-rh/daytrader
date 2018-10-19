
package org.apache.geronimo.samples.daytrader;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHoldingDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHoldingDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HoldingDataBean" type="{http://daytrader.samples.geronimo.apache.org}HoldingDataBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHoldingDataBean", propOrder = {
    "holdingDataBean"
})
public class ArrayOfHoldingDataBean {

    @XmlElement(name = "HoldingDataBean", nillable = true)
    protected List<HoldingDataBean> holdingDataBean;

    /**
     * Gets the value of the holdingDataBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdingDataBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldingDataBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingDataBean }
     * 
     * 
     */
    public List<HoldingDataBean> getHoldingDataBean() {
        if (holdingDataBean == null) {
            holdingDataBean = new ArrayList<HoldingDataBean>();
        }
        return this.holdingDataBean;
    }

}
