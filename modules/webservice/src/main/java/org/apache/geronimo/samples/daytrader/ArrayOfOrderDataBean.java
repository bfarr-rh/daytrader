
package org.apache.geronimo.samples.daytrader;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDataBean" type="{http://daytrader.samples.geronimo.apache.org}OrderDataBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderDataBean", propOrder = {
    "orderDataBean"
})
public class ArrayOfOrderDataBean {

    @XmlElement(name = "OrderDataBean", nillable = true)
    protected List<OrderDataBean> orderDataBean;

    /**
     * Gets the value of the orderDataBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDataBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDataBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderDataBean }
     * 
     * 
     */
    public List<OrderDataBean> getOrderDataBean() {
        if (orderDataBean == null) {
            orderDataBean = new ArrayList<OrderDataBean>();
        }
        return this.orderDataBean;
    }

}
