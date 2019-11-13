package com.resource;

public class Ucgen {
	private String cesit;

	public Ucgen(String cesit) {
		this.cesit = cesit;
	}
	public String getCesit() {
		return cesit;
	}
	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	public void ciz() {
		System.out.println(getCesit() + " üçgen ciz.");
	}
}
