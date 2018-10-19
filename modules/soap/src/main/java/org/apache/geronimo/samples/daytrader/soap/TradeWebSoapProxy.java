/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.geronimo.samples.daytrader.soap;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.geronimo.samples.daytrader.ArrayOfHoldingDataBean;
import org.apache.geronimo.samples.daytrader.ArrayOfOrderDataBean;
import org.apache.geronimo.samples.daytrader.TradeWSServices;
import org.apache.geronimo.samples.daytrader.beans.AccountDataBean;
import org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean;
import org.apache.geronimo.samples.daytrader.beans.HoldingDataBean;
import org.apache.geronimo.samples.daytrader.beans.OrderDataBean;
import org.apache.geronimo.samples.daytrader.beans.QuoteDataBean;
import org.apache.geronimo.samples.daytrader.core.MarketSummaryDataBean;
import org.apache.geronimo.samples.daytrader.core.RunStatsDataBean;

public class TradeWebSoapProxy implements org.apache.geronimo.samples.daytrader.core.TradeServices {

	private static org.apache.geronimo.samples.daytrader.TradeWSServices trade;
	private static String servicePort = "http://localhost:8080/daytrader-war/services/TradeWSServices";
	
    public TradeWebSoapProxy() {
    	if (trade == null) {
    		trade = getTrade();
    	}
    }

	public static org.apache.geronimo.samples.daytrader.TradeWSServices getTrade() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean(); 
		factory.setServiceClass(TradeWSServices.class); 
		factory.setAddress(servicePort); 
		TradeWSServices client = (TradeWSServices) factory.create(); 
		
		return client;
	}

	
	public static void updateServicePort() {
		// reconstruct Trade as service port has changed
		trade = getTrade();
	}
	
	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#buy(java.lang.String, java.lang.String, double, int)
	 */
	public org.apache.geronimo.samples.daytrader.beans.OrderDataBean buy(String userID, String symbol, double quantity,	int orderProcessingMode) throws Exception {
		return convertOrderDataBean(getTrade().buy(userID, symbol, quantity, orderProcessingMode));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#cancelOrder(java.lang.Integer, boolean)
	 */
	public void cancelOrder(Integer orderID, boolean twoPhase) throws Exception {
		getTrade().cancelOrder(orderID, twoPhase);
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#completeOrder(java.lang.Integer, boolean)
	 */
	public OrderDataBean completeOrder(Integer orderID, boolean twoPhase) throws Exception {
		return convertOrderDataBean(getTrade().completeOrder(orderID, twoPhase));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#createQuote(java.lang.String, java.lang.String, java.math.BigDecimal)
	 */
	public QuoteDataBean createQuote(String symbol, String companyName, BigDecimal price) throws Exception {
		return convertQuoteDataBean(getTrade().createQuote(symbol, companyName, price));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getAccountData(java.lang.String)
	 */
	public AccountDataBean getAccountData(String userID) {
		return convertAccountDataBean(getTrade().getAccountData(userID));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getAccountProfileData(java.lang.String)
	 */
	public AccountProfileDataBean getAccountProfileData(String userID) throws Exception {
		return convertAccountProfileDataBean(getTrade().getAccountProfileData(userID));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getAllQuotes()
	 */
	public Collection getAllQuotes() throws Exception {
		return convertQuoteDataBeanWSArrayToCollectionBase(getTrade().getAllQuotes().getQuoteDataBean().toArray());
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getClosedOrders(java.lang.String)
	 */
	public Collection getClosedOrders(String userID) throws Exception {
		ArrayOfOrderDataBean orders = getTrade().getClosedOrders(userID);
		ArrayList ordersRet = new ArrayList();
		if (orders == null || orders.getOrderDataBean().isEmpty()) {
			return ordersRet;
		}
		for (org.apache.geronimo.samples.daytrader.OrderDataBean odb : orders.getOrderDataBean()) {
			ordersRet.add(convertOrderDataBean(odb));
		}
		return ordersRet;
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getHolding(java.lang.Integer)
	 */
	public HoldingDataBean getHolding(Integer holdingID) throws Exception {
		return convertHoldingDataBean(getTrade().getHolding(holdingID));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getHoldings(java.lang.String)
	 */
	public Collection getHoldings(String userID) throws Exception {
		ArrayOfHoldingDataBean holdings = getTrade().getHoldings(userID);
		ArrayList holdingsRet = new ArrayList();
		
		if (holdings == null || holdings.getHoldingDataBean().size() == 0) {
			return holdingsRet;
		}
		
		for (org.apache.geronimo.samples.daytrader.HoldingDataBean holdingBean : holdings.getHoldingDataBean()) {
			holdingsRet.add(convertHoldingDataBean(holdingBean));
		}
		return holdingsRet;
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getMarketSummary()
	 */
	public MarketSummaryDataBean getMarketSummary() throws Exception {
		return convertMarketSummaryDataBean(getTrade().getMarketSummary());
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getOrders(java.lang.String)
	 */
	public Collection getOrders(String userID) throws Exception {
		ArrayOfOrderDataBean orders = getTrade().getOrders(userID);
		ArrayList ordersRet = new ArrayList();
		
		if (orders == null || orders.getOrderDataBean().size() == 0) {
			return ordersRet;
		}
		
		for (org.apache.geronimo.samples.daytrader.OrderDataBean odb : orders.getOrderDataBean()) {
			ordersRet.add(odb);
		}
		
		return ordersRet;
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#getQuote(java.lang.String)
	 */
	public QuoteDataBean getQuote(String symbol) throws Exception {
		return convertQuoteDataBean(getTrade().getQuote(symbol));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#login(java.lang.String, java.lang.String)
	 */
	public AccountDataBean login(String userID, String password) throws Exception {
		return convertAccountDataBean(getTrade().login(userID, password));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#logout(java.lang.String)
	 */
	public void logout(String userID) throws Exception {
		getTrade().logout(userID);
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#orderCompleted(java.lang.String, java.lang.Integer)
	 */
	public void orderCompleted(String userID, Integer orderID) throws Exception {
		getTrade().orderCompleted(userID, orderID);
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#queueOrder(java.lang.Integer, boolean)
	 */
	public void queueOrder(Integer orderID, boolean twoPhase) throws Exception {
		getTrade().queueOrder(orderID, twoPhase);
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#register(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal)
	 */
	public AccountDataBean register(String userID, String password, String fullname, String address, String email, String creditcard, BigDecimal openBalance) throws Exception {
		return convertAccountDataBean(getTrade().register(userID, password, fullname, address, email, creditcard, openBalance));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#resetTrade(boolean)
	 */
	public RunStatsDataBean resetTrade(boolean deleteAll) throws Exception {
		return convertRunStatsDataBean(getTrade().resetTrade(deleteAll));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#sell(java.lang.String, java.lang.Integer, int)
	 */
	public OrderDataBean sell(String userID, Integer holdingID,	int orderProcessingMode) throws Exception {
		return convertOrderDataBean(getTrade().sell(userID, holdingID, orderProcessingMode));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#updateAccountProfile(org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean)
	 */
	public AccountProfileDataBean updateAccountProfile(AccountProfileDataBean profileData) throws Exception {
		return convertAccountProfileDataBean(getTrade().updateAccountProfile(convertAccountProfileDataBeanToWS(profileData)));
	}

	/* (non-Javadoc)
	 * @see org.apache.geronimo.samples.daytrader.TradeServices#updateQuotePriceVolume(java.lang.String, java.math.BigDecimal, double)
	 */
	public QuoteDataBean updateQuotePriceVolume(String symbol, BigDecimal newPrice, double sharesTraded) throws Exception {
		return convertQuoteDataBean(getTrade().updateQuotePriceVolume(symbol, newPrice, sharesTraded));		
	}

	private org.apache.geronimo.samples.daytrader.beans.OrderDataBean convertOrderDataBean(org.apache.geronimo.samples.daytrader.OrderDataBean bean) {
		return new org.apache.geronimo.samples.daytrader.beans.OrderDataBean(
			bean.getOrderID(),
			bean.getOrderType(),
			bean.getOrderStatus(),
			bean.getOpenDate() != null ? bean.getOpenDate().toGregorianCalendar().getTime() : null,
			bean.getCompletionDate() != null ? bean.getCompletionDate().toGregorianCalendar().getTime() : null,
			bean.getQuantity(),
			bean.getPrice(),
			bean.getOrderFee(),
			bean.getSymbol());
	}

	private org.apache.geronimo.samples.daytrader.beans.QuoteDataBean convertQuoteDataBean(org.apache.geronimo.samples.daytrader.QuoteDataBean bean) {
		return new org.apache.geronimo.samples.daytrader.beans.QuoteDataBean(
			bean.getSymbol(),
			bean.getCompanyName(),
			bean.getVolume(),
			bean.getPrice(),
			bean.getOpen(),
			bean.getLow(),
			bean.getHigh(),
			bean.getChange());
	}

	private Collection convertQuoteDataBeanWSArrayToCollectionBase(Object[] quotes) {	
		ArrayList quotesRet = new ArrayList();
		if (quotes == null || quotes.length == 0) {
			return quotesRet;
		}
		for (int ii = 0; ii < quotes.length; ii++) {
			quotesRet.add(convertQuoteDataBean((org.apache.geronimo.samples.daytrader.QuoteDataBean)quotes[ii]));
		}
		return quotesRet;
	}

	private org.apache.geronimo.samples.daytrader.beans.HoldingDataBean convertHoldingDataBean(org.apache.geronimo.samples.daytrader.HoldingDataBean bean) {
		return new org.apache.geronimo.samples.daytrader.beans.HoldingDataBean(
			bean.getHoldingID(),
			bean.getQuantity(),
			bean.getPurchasePrice(),
			bean.getPurchaseDate().toGregorianCalendar().getTime(),
			bean.getQuoteID());
	}

	private org.apache.geronimo.samples.daytrader.beans.AccountDataBean convertAccountDataBean(org.apache.geronimo.samples.daytrader.AccountDataBean bean) {
		return new org.apache.geronimo.samples.daytrader.beans.AccountDataBean(
			bean.getAccountID(),
			bean.getLoginCount(),
			bean.getLogoutCount(),
			bean.getLastLogin().toGregorianCalendar().getTime(),
			bean.getCreationDate().toGregorianCalendar().getTime(),
			bean.getBalance(),
			bean.getOpenBalance(),
			bean.getProfileID());			
	}

	private org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean convertAccountProfileDataBean(org.apache.geronimo.samples.daytrader.AccountProfileDataBean bean) {
		return new org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean(
			bean.getUserID(),
			bean.getPassword(),
			bean.getFullName(),
			bean.getAddress(),
			bean.getEmail(),
			bean.getCreditCard());
	}

	private org.apache.geronimo.samples.daytrader.AccountProfileDataBean convertAccountProfileDataBeanToWS(org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean bean) {
		org.apache.geronimo.samples.daytrader.AccountProfileDataBean beanRet = new org.apache.geronimo.samples.daytrader.AccountProfileDataBean();
		beanRet.setUserID(bean.getUserID());
		beanRet.setPassword(bean.getPassword());
		beanRet.setFullName(bean.getFullName());
		beanRet.setAddress(bean.getAddress());
		beanRet.setEmail(bean.getEmail());
		beanRet.setCreditCard(bean.getCreditCard());
		return beanRet;
	}

	private org.apache.geronimo.samples.daytrader.core.MarketSummaryDataBean convertMarketSummaryDataBean(org.apache.geronimo.samples.daytrader.MarketSummaryDataBeanWS bean) {
		org.apache.geronimo.samples.daytrader.core.MarketSummaryDataBean retBean = new org.apache.geronimo.samples.daytrader.core.MarketSummaryDataBean();
		retBean.setTopGainers(convertQuoteDataBeanWSArrayToCollectionBase(bean.getTopGainers().getQuoteDataBean().toArray()));
		retBean.setTopLosers(convertQuoteDataBeanWSArrayToCollectionBase(bean.getTopLosers().getQuoteDataBean().toArray()));
		retBean.setTSIA(bean.getTSIA());
		retBean.setOpenTSIA(bean.getOpenTSIA());
		retBean.setVolume(bean.getVolume());
		// can't use contructor of MSBean as it sets this to the current time
		retBean.setSummaryDate(bean.getSummaryDate().toGregorianCalendar().getTime());
		return retBean; 
	}
	
	private org.apache.geronimo.samples.daytrader.core.RunStatsDataBean convertRunStatsDataBean(org.apache.geronimo.samples.daytrader.RunStatsDataBean bean) {
		org.apache.geronimo.samples.daytrader.core.RunStatsDataBean beanRet = new org.apache.geronimo.samples.daytrader.core.RunStatsDataBean();
		beanRet.setTradeUserCount(bean.getTradeUserCount());
		beanRet.setNewUserCount(bean.getNewUserCount());
		beanRet.setSumLoginCount(bean.getSumLoginCount());
		beanRet.setSumLogoutCount(bean.getSumLogoutCount());
		beanRet.setHoldingCount(bean.getHoldingCount());
		beanRet.setOrderCount(bean.getOrderCount());
		beanRet.setBuyOrderCount(bean.getBuyOrderCount());
		beanRet.setSellOrderCount(bean.getSellOrderCount());
		beanRet.setCancelledOrderCount(bean.getCancelledOrderCount());
		beanRet.setOpenOrderCount(bean.getOpenOrderCount());
		beanRet.setDeletedOrderCount(bean.getDeletedOrderCount());
		return beanRet;
	}
}
