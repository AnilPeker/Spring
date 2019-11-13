package com.resource;

public class Musteri {
	private Siparis siparis;

	public Musteri() {
		System.out.println("Musteri oluşturuldu");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	public void hesabiOde() {
		System.out.println("Musteri sınıfındaki hesabiOde methodu");
		siparis.toplamTutar();
	}
	

}
