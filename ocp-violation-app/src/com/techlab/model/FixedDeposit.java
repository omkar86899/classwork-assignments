package com.techlab.model;

public class FixedDeposit {
	private int accNo,years;
	private String accName;
	private double amount, principle;
	FestivalType festival;
	
	public FixedDeposit(int accNo, String accName, double amount, double principle, int years, FestivalType festival) {
		this.accName = accName;
		this.accNo = accNo;
		this.amount = amount;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
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
	
	public double calculateSimpleInterest() {
		if(this.festival == FestivalType.NORMAL) {
			return principle*years*7;
		}
		else if(this.festival == FestivalType.HOLI) {
			return principle*years*9;
		}
		else {
			return principle*years*10;
		}
	}
}
