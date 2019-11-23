package com.resource;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {

	private Integer yasi;
	private String adi,soyadi;
	
	
	public int getYasi() {
		return yasi;
	}
	@Required
	public void setYasi(Integer yasi) {
		this.yasi = yasi;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
	@Override
	public String toString() {
		return "Ogrenci [yasi=" + yasi + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
	

}
