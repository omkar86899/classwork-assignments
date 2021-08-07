package com.techlab.model;

public class FixedDeposit {
	private int accNo,years;
	private String accName;
	private double amount, principle;
	private IFestivalRate festName;
	
	public FixedDeposit(int accNo, String accName, double amount, double principle, int years, IFestivalRate festName) {
		this.accName = accName;
		this.accNo = accNo;
		this.amount = amount;
		this.principle = principle;
		this.years = years;
		this.festName = festName;
	}
	
	public int getAccNo() {
		return this.accNo;
	}
	public String getAccName() {
		return this.accName;
	}
	public double getAmount() {
		return this.amount;
	}
	public double getPrinciple() {
		return this.principle;
	}
	public int getYears() {
		return this.years;
	}
	public IFestivalRate getFestival() {
		return festName;
	}
	
	public double calculateSimpleInterest() {
		return principle*years*festName.getRate();
	}
}
