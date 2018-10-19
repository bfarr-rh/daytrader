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


import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.geronimo.samples.daytrader.*;


public class Convert {
	  
    static OrderDataBean[] convertOrderDataBeanCollection(Collection col) {
        OrderDataBean[] wsBeans = new OrderDataBean[col.size()];
        int i = 0;
        for (Object o : col) {
            wsBeans[i++] = convertOrderDataBean((org.apache.geronimo.samples.daytrader.beans.OrderDataBean)o);            
        }
        return wsBeans;
    }
    
    static OrderDataBean convertOrderDataBean(org.apache.geronimo.samples.daytrader.beans.OrderDataBean bean) {
        OrderDataBean wsBean = new OrderDataBean();
        wsBean.setOrderID(bean.getOrderID());
        wsBean.setOrderType(bean.getOrderType());
        wsBean.setOrderStatus(bean.getOrderStatus());
        wsBean.setOpenDate(toCalendar(bean.getOpenDate()));
        wsBean.setCompletionDate(toCalendar(bean.getCompletionDate()));
        wsBean.setQuantity(bean.getQuantity());
        wsBean.setPrice(bean.getPrice());
        wsBean.setOrderFee(bean.getOrderFee());
        wsBean.setSymbol(bean.getSymbol());
        return wsBean;
    }
    
    static ArrayOfQuoteDataBean convertQuoteDataBeanCollection(Collection col) {
    	ArrayOfQuoteDataBean array = new ArrayOfQuoteDataBean();

        for (Object o : col) {
        	array.getQuoteDataBean().add(convertQuoteDataBean((org.apache.geronimo.samples.daytrader.beans.QuoteDataBean)o));        
        }

        return array;
    }
    
    static QuoteDataBean convertQuoteDataBean(org.apache.geronimo.samples.daytrader.beans.QuoteDataBean bean) {
        QuoteDataBean wsBean = new QuoteDataBean();
        wsBean.setSymbol(bean.getSymbol());
        wsBean.setCompanyName(bean.getCompanyName());
        wsBean.setVolume(bean.getVolume());
        wsBean.setPrice(bean.getPrice());
        wsBean.setOpen(bean.getOpen());
        wsBean.setLow(bean.getLow());
        wsBean.setHigh(bean.getHigh());
        wsBean.setChange(bean.getChange());
        return wsBean;
    }
    
    static RunStatsDataBean convertRunStatsDataBean(org.apache.geronimo.samples.daytrader.core.RunStatsDataBean bean) {
        RunStatsDataBean wsBean = new RunStatsDataBean();        
        wsBean.setTradeUserCount(bean.getTradeUserCount());
        wsBean.setNewUserCount(bean.getNewUserCount());
        wsBean.setSumLoginCount(bean.getSumLoginCount());
        wsBean.setSumLogoutCount(bean.getSumLogoutCount());
        wsBean.setHoldingCount(bean.getHoldingCount());
        wsBean.setOrderCount(bean.getOrderCount());
        wsBean.setBuyOrderCount(bean.getBuyOrderCount());
        wsBean.setSellOrderCount(bean.getSellOrderCount());
        wsBean.setCancelledOrderCount(bean.getCancelledOrderCount());
        wsBean.setOpenOrderCount(bean.getOpenOrderCount());
        wsBean.setDeletedOrderCount(bean.getDeletedOrderCount());
        return wsBean;
    }
    
    static AccountDataBean convertAccountDataBean(org.apache.geronimo.samples.daytrader.beans.AccountDataBean bean) {
        AccountDataBean wsBean = new AccountDataBean();
        wsBean.setAccountID(bean.getAccountID());
        wsBean.setLoginCount(bean.getLoginCount());
        wsBean.setLogoutCount(bean.getLogoutCount());
        wsBean.setLastLogin(toCalendar(bean.getLastLogin()));
        wsBean.setCreationDate(toCalendar(bean.getCreationDate()));
        wsBean.setBalance(bean.getBalance());
        wsBean.setOpenBalance(bean.getOpenBalance());
        wsBean.setProfileID(bean.getProfileID());
        return wsBean;
    }
    
    static AccountProfileDataBean convertAccountProfileDataBean(org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean bean) {
        AccountProfileDataBean wsBean = new AccountProfileDataBean();
        wsBean.setUserID(bean.getUserID());
        wsBean.setPassword(bean.getPassword());
        wsBean.setFullName(bean.getFullName());
        wsBean.setAddress(bean.getAddress());
        wsBean.setEmail(bean.getEmail());
        wsBean.setCreditCard(bean.getCreditCard());
        return wsBean;
    }
    
    static org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean convertAccountProfileDataBean(AccountProfileDataBean wsBean) {
        org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean bean = new org.apache.geronimo.samples.daytrader.beans.AccountProfileDataBean();    
        bean.setUserID(wsBean.getUserID());
        bean.setPassword(wsBean.getPassword());
        bean.setFullName(wsBean.getFullName());
        bean.setAddress(wsBean.getAddress());
        bean.setEmail(wsBean.getEmail());
        bean.setCreditCard(wsBean.getCreditCard());
        return bean;
    }
        
    static HoldingDataBean[] convertHoldingDataBeanCollection(Collection col) {
        HoldingDataBean[] wsBeans = new HoldingDataBean[col.size()];
        int i = 0;
        for (Object o : col) {
            wsBeans[i++] = convertHoldingDataBean((org.apache.geronimo.samples.daytrader.beans.HoldingDataBean)o);            
        }
        return wsBeans;
    }     
        
    static HoldingDataBean convertHoldingDataBean(org.apache.geronimo.samples.daytrader.beans.HoldingDataBean bean) {
        HoldingDataBean wsBean = new HoldingDataBean();
        wsBean.setHoldingID(bean.getHoldingID());
        wsBean.setQuantity(bean.getQuantity());
        wsBean.setPurchasePrice(bean.getPurchasePrice());
        wsBean.setPurchaseDate(toCalendar(bean.getPurchaseDate()));
        wsBean.setQuoteID(bean.getQuoteID());
        return wsBean;
    }
    
    static MarketSummaryDataBeanWS convertMarketSummaryDataBean(org.apache.geronimo.samples.daytrader.core.MarketSummaryDataBean bean) {
        MarketSummaryDataBeanWS wsBean = new MarketSummaryDataBeanWS();   
        wsBean.setTopGainers(convertQuoteDataBeanCollection(bean.getTopGainers()));
        wsBean.setTopLosers(convertQuoteDataBeanCollection(bean.getTopLosers()));        
        wsBean.setTSIA(bean.getTSIA());
        wsBean.setOpenTSIA(bean.getOpenTSIA());
        wsBean.setVolume(bean.getVolume());
        wsBean.setSummaryDate(toCalendar(bean.getSummaryDate()));        
        return wsBean; 
    }    
    
    static XMLGregorianCalendar toCalendar(Date date) {
        if (date == null) {
            return null;
        }
        
        GregorianCalendar gCalendar = new GregorianCalendar();

        gCalendar.setTime(date);

        XMLGregorianCalendar xmlCalendar = null;

        try {

        	xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);

        } catch (DatatypeConfigurationException ex) {

        	ex.printStackTrace();

        }

        return xmlCalendar;      
    }
}
