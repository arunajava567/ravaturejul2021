package com.cg.intro;

public class Engine {

	
	Long chasisNumber;

	@Override
	public String toString() {
		return "Engine [chasisNumber=" + chasisNumber + "]";
	}

	public Engine(Long chasisNumber) {
		super();
		this.chasisNumber = chasisNumber;
	}

	public Long getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(Long chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	
}
