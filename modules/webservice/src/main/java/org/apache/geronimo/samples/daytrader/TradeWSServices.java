package org.apache.geronimo.samples.daytrader;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12.redhat-1
 * 2018-10-14T21:00:36.565+11:00
 * Generated source version: 3.1.12.redhat-1
 * 
 */
@WebService(targetNamespace = "http://daytrader.samples.geronimo.apache.org", name = "TradeWSServices")
@XmlSeeAlso({ObjectFactory.class})
public interface TradeWSServices {

    @WebMethod
    @RequestWrapper(localName = "getAllQuotes", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAllQuotes")
    @ResponseWrapper(localName = "getAllQuotesResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAllQuotesResponse")
    @WebResult(name = "getAllQuotesReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.ArrayOfQuoteDataBean getAllQuotes();

    @WebMethod
    @RequestWrapper(localName = "getMarketSummary", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetMarketSummary")
    @ResponseWrapper(localName = "getMarketSummaryResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetMarketSummaryResponse")
    @WebResult(name = "getMarketSummaryReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.MarketSummaryDataBeanWS getMarketSummary();

    @WebMethod
    @RequestWrapper(localName = "getAccountProfileData", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAccountProfileData")
    @ResponseWrapper(localName = "getAccountProfileDataResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAccountProfileDataResponse")
    @WebResult(name = "getAccountProfileDataReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.AccountProfileDataBean getAccountProfileData(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "register", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.RegisterResponse")
    @WebResult(name = "registerReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.AccountDataBean register(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID,
        @WebParam(name = "password", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String password,
        @WebParam(name = "fullname", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String fullname,
        @WebParam(name = "address", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String address,
        @WebParam(name = "email", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String email,
        @WebParam(name = "creditcard", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String creditcard,
        @WebParam(name = "openBalance", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.math.BigDecimal openBalance
    );

    @WebMethod
    @RequestWrapper(localName = "completeOrder", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CompleteOrder")
    @ResponseWrapper(localName = "completeOrderResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CompleteOrderResponse")
    @WebResult(name = "completeOrderReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.OrderDataBean completeOrder(
        @WebParam(name = "orderID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer orderID,
        @WebParam(name = "twoPhase", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        boolean twoPhase
    );

    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.LogoutResponse")
    public void logout(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "queueOrder", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.QueueOrder")
    @ResponseWrapper(localName = "queueOrderResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.QueueOrderResponse")
    public void queueOrder(
        @WebParam(name = "orderID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer orderID,
        @WebParam(name = "twoPhase", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        boolean twoPhase
    );

    @WebMethod
    @RequestWrapper(localName = "orderCompleted", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.OrderCompleted")
    @ResponseWrapper(localName = "orderCompletedResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.OrderCompletedResponse")
    public void orderCompleted(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID,
        @WebParam(name = "orderID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer orderID
    );

    @WebMethod
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetQuoteResponse")
    @WebResult(name = "getQuoteReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.QuoteDataBean getQuote(
        @WebParam(name = "symbol", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String symbol
    );

    @WebMethod
    @RequestWrapper(localName = "login", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.LoginResponse")
    @WebResult(name = "loginReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.AccountDataBean login(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID,
        @WebParam(name = "password", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String password
    );

    @WebMethod
    @RequestWrapper(localName = "getOrders", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetOrders")
    @ResponseWrapper(localName = "getOrdersResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetOrdersResponse")
    @WebResult(name = "getOrdersReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.ArrayOfOrderDataBean getOrders(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "getHolding", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetHolding")
    @ResponseWrapper(localName = "getHoldingResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetHoldingResponse")
    @WebResult(name = "getHoldingReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.HoldingDataBean getHolding(
        @WebParam(name = "holdingID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer holdingID
    );

    @WebMethod
    @RequestWrapper(localName = "getAccountData", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAccountData")
    @ResponseWrapper(localName = "getAccountDataResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetAccountDataResponse")
    @WebResult(name = "getAccountDataReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.AccountDataBean getAccountData(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "createQuote", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CreateQuote")
    @ResponseWrapper(localName = "createQuoteResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CreateQuoteResponse")
    @WebResult(name = "createQuoteReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.QuoteDataBean createQuote(
        @WebParam(name = "symbol", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String symbol,
        @WebParam(name = "companyName", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String companyName,
        @WebParam(name = "price", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.math.BigDecimal price
    );

    @WebMethod
    @RequestWrapper(localName = "getHoldings", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetHoldings")
    @ResponseWrapper(localName = "getHoldingsResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetHoldingsResponse")
    @WebResult(name = "getHoldingsReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.ArrayOfHoldingDataBean getHoldings(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "updateAccountProfile", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.UpdateAccountProfile")
    @ResponseWrapper(localName = "updateAccountProfileResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.UpdateAccountProfileResponse")
    @WebResult(name = "updateAccountProfileReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.AccountProfileDataBean updateAccountProfile(
        @WebParam(name = "profileData", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        org.apache.geronimo.samples.daytrader.AccountProfileDataBean profileData
    );

    @WebMethod
    @RequestWrapper(localName = "resetTrade", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.ResetTrade")
    @ResponseWrapper(localName = "resetTradeResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.ResetTradeResponse")
    @WebResult(name = "resetTradeReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.RunStatsDataBean resetTrade(
        @WebParam(name = "deleteAll", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        boolean deleteAll
    );

    @WebMethod
    @RequestWrapper(localName = "cancelOrder", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CancelOrder")
    @ResponseWrapper(localName = "cancelOrderResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.CancelOrderResponse")
    public void cancelOrder(
        @WebParam(name = "orderID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer orderID,
        @WebParam(name = "twoPhase", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        boolean twoPhase
    );

    @WebMethod
    @RequestWrapper(localName = "updateQuotePriceVolume", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.UpdateQuotePriceVolume")
    @ResponseWrapper(localName = "updateQuotePriceVolumeResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.UpdateQuotePriceVolumeResponse")
    @WebResult(name = "updateQuotePriceVolumeReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.QuoteDataBean updateQuotePriceVolume(
        @WebParam(name = "symbol", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String symbol,
        @WebParam(name = "newPrice", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.math.BigDecimal newPrice,
        @WebParam(name = "sharesTraded", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        double sharesTraded
    );

    @WebMethod
    @RequestWrapper(localName = "getClosedOrders", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetClosedOrders")
    @ResponseWrapper(localName = "getClosedOrdersResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.GetClosedOrdersResponse")
    @WebResult(name = "getClosedOrdersReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.ArrayOfOrderDataBean getClosedOrders(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID
    );

    @WebMethod
    @RequestWrapper(localName = "buy", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.Buy")
    @ResponseWrapper(localName = "buyResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.BuyResponse")
    @WebResult(name = "buyReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.OrderDataBean buy(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID,
        @WebParam(name = "symbol", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String symbol,
        @WebParam(name = "quantity", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        double quantity,
        @WebParam(name = "orderProcessingMode", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        int orderProcessingMode
    );

    @WebMethod
    @RequestWrapper(localName = "sell", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.Sell")
    @ResponseWrapper(localName = "sellResponse", targetNamespace = "http://daytrader.samples.geronimo.apache.org", className = "org.apache.geronimo.samples.daytrader.SellResponse")
    @WebResult(name = "sellReturn", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
    public org.apache.geronimo.samples.daytrader.OrderDataBean sell(
        @WebParam(name = "userID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.String userID,
        @WebParam(name = "holdingID", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        java.lang.Integer holdingID,
        @WebParam(name = "orderProcessingMode", targetNamespace = "http://daytrader.samples.geronimo.apache.org")
        int orderProcessingMode
    );
}
