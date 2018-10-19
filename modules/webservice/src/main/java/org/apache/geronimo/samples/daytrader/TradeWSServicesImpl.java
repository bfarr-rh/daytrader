package org.apache.geronimo.samples.daytrader;

import java.math.BigDecimal;

@javax.jws.WebService(endpointInterface="org.apache.geronimo.samples.daytrader.TradeWSServices")
public class TradeWSServicesImpl implements TradeWSServices {

	
	@Override
	public ArrayOfQuoteDataBean getAllQuotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarketSummaryDataBeanWS getMarketSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountProfileDataBean getAccountProfileData(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDataBean register(String userID, String password, String fullname, String address, String email,
			String creditcard, BigDecimal openBalance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDataBean completeOrder(Integer orderID, boolean twoPhase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(String userID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void queueOrder(Integer orderID, boolean twoPhase) {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderCompleted(String userID, Integer orderID) {
		// TODO Auto-generated method stub

	}

	@Override
	public QuoteDataBean getQuote(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDataBean login(String userID, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfOrderDataBean getOrders(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HoldingDataBean getHolding(Integer holdingID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDataBean getAccountData(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuoteDataBean createQuote(String symbol, String companyName, BigDecimal price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfHoldingDataBean getHoldings(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountProfileDataBean updateAccountProfile(AccountProfileDataBean profileData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RunStatsDataBean resetTrade(boolean deleteAll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelOrder(Integer orderID, boolean twoPhase) {
		// TODO Auto-generated method stub

	}

	@Override
	public QuoteDataBean updateQuotePriceVolume(String symbol, BigDecimal newPrice, double sharesTraded) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfOrderDataBean getClosedOrders(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDataBean buy(String userID, String symbol, double quantity, int orderProcessingMode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDataBean sell(String userID, Integer holdingID, int orderProcessingMode) {
		// TODO Auto-generated method stub
		return null;
	}

}
