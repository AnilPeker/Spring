package com.resource;

public class Musteri {
	private Siparis siparis;

	public Musteri() {
		System.out.println("Musteri olu�turuldu");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	public void hesabiOde() {
		System.out.println("Musteri s�n�f�ndaki hesabiOde methodu");
		siparis.toplamTutar();
	}
	

}
