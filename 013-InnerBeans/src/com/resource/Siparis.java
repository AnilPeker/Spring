package com.resource;

public class Siparis {
	private int tutar;

	public Siparis() {
		System.out.println("Siparis Olusturuldu.");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	public void toplamTutar() {
		System.out.println("Toplam tutar:" + getTutar());
	}
}
