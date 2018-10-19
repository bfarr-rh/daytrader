
package org.apache.geronimo.samples.daytrader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunStatsDataBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunStatsDataBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeUserCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="newUserCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sumLoginCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sumLogoutCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="holdingCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="buyOrderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sellOrderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancelledOrderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="openOrderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deletedOrderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tradeStockCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunStatsDataBean", propOrder = {
    "tradeUserCount",
    "newUserCount",
    "sumLoginCount",
    "sumLogoutCount",
    "holdingCount",
    "buyOrderCount",
    "sellOrderCount",
    "cancelledOrderCount",
    "openOrderCount",
    "deletedOrderCount",
    "orderCount",
    "tradeStockCount"
})
public class RunStatsDataBean {

    protected int tradeUserCount;
    protected int newUserCount;
    protected int sumLoginCount;
    protected int sumLogoutCount;
    protected int holdingCount;
    protected int buyOrderCount;
    protected int sellOrderCount;
    protected int cancelledOrderCount;
    protected int openOrderCount;
    protected int deletedOrderCount;
    protected int orderCount;
    protected int tradeStockCount;

    /**
     * Gets the value of the tradeUserCount property.
     * 
     */
    public int getTradeUserCount() {
        return tradeUserCount;
    }

    /**
     * Sets the value of the tradeUserCount property.
     * 
     */
    public void setTradeUserCount(int value) {
        this.tradeUserCount = value;
    }

    /**
     * Gets the value of the newUserCount property.
     * 
     */
    public int getNewUserCount() {
        return newUserCount;
    }

    /**
     * Sets the value of the newUserCount property.
     * 
     */
    public void setNewUserCount(int value) {
        this.newUserCount = value;
    }

    /**
     * Gets the value of the sumLoginCount property.
     * 
     */
    public int getSumLoginCount() {
        return sumLoginCount;
    }

    /**
     * Sets the value of the sumLoginCount property.
     * 
     */
    public void setSumLoginCount(int value) {
        this.sumLoginCount = value;
    }

    /**
     * Gets the value of the sumLogoutCount property.
     * 
     */
    public int getSumLogoutCount() {
        return sumLogoutCount;
    }

    /**
     * Sets the value of the sumLogoutCount property.
     * 
     */
    public void setSumLogoutCount(int value) {
        this.sumLogoutCount = value;
    }

    /**
     * Gets the value of the holdingCount property.
     * 
     */
    public int getHoldingCount() {
        return holdingCount;
    }

    /**
     * Sets the value of the holdingCount property.
     * 
     */
    public void setHoldingCount(int value) {
        this.holdingCount = value;
    }

    /**
     * Gets the value of the buyOrderCount property.
     * 
     */
    public int getBuyOrderCount() {
        return buyOrderCount;
    }

    /**
     * Sets the value of the buyOrderCount property.
     * 
     */
    public void setBuyOrderCount(int value) {
        this.buyOrderCount = value;
    }

    /**
     * Gets the value of the sellOrderCount property.
     * 
     */
    public int getSellOrderCount() {
        return sellOrderCount;
    }

    /**
     * Sets the value of the sellOrderCount property.
     * 
     */
    public void setSellOrderCount(int value) {
        this.sellOrderCount = value;
    }

    /**
     * Gets the value of the cancelledOrderCount property.
     * 
     */
    public int getCancelledOrderCount() {
        return cancelledOrderCount;
    }

    /**
     * Sets the value of the cancelledOrderCount property.
     * 
     */
    public void setCancelledOrderCount(int value) {
        this.cancelledOrderCount = value;
    }

    /**
     * Gets the value of the openOrderCount property.
     * 
     */
    public int getOpenOrderCount() {
        return openOrderCount;
    }

    /**
     * Sets the value of the openOrderCount property.
     * 
     */
    public void setOpenOrderCount(int value) {
        this.openOrderCount = value;
    }

    /**
     * Gets the value of the deletedOrderCount property.
     * 
     */
    public int getDeletedOrderCount() {
        return deletedOrderCount;
    }

    /**
     * Sets the value of the deletedOrderCount property.
     * 
     */
    public void setDeletedOrderCount(int value) {
        this.deletedOrderCount = value;
    }

    /**
     * Gets the value of the orderCount property.
     * 
     */
    public int getOrderCount() {
        return orderCount;
    }

    /**
     * Sets the value of the orderCount property.
     * 
     */
    public void setOrderCount(int value) {
        this.orderCount = value;
    }

    /**
     * Gets the value of the tradeStockCount property.
     * 
     */
    public int getTradeStockCount() {
        return tradeStockCount;
    }

    /**
     * Sets the value of the tradeStockCount property.
     * 
     */
    public void setTradeStockCount(int value) {
        this.tradeStockCount = value;
    }

}
