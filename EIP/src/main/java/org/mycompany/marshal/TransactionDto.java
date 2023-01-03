package org.mycompany.marshal;

public class TransactionDto  {
	private String transactionID;
	private String senderAccountId;
	private String receiverAccountId;
	private String amount;
	private String currenecy;
	private String transactionDate;
	
//	public TransactionDto() {
// 	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getSenderAccountId() {
		return senderAccountId;
	}
	public void setSenderAccountId(String senderAccountId) {
		this.senderAccountId = senderAccountId;
	}
	public String getReceiverAccountId() {
		return receiverAccountId;
	}
	public void setReceiverAccountId(String receiverAccountId) {
		this.receiverAccountId = receiverAccountId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String account) {
		this.amount = account;
	}
	public String getCurrenecy() {
		return currenecy;
	}
	public void setCurrenecy(String currenecy) {
		this.currenecy = currenecy;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	

}
