package com.resource;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ogrenci {
	List<?> ogrenciList;
	Set<?> ogrenciSet;
	Map<?, ?> ogrenciMap;
	Properties ogrenciProperties;
	
	
	public List<?> getOgrenciList() {
		System.out.println("List elemanlarý : " + ogrenciList);
		return ogrenciList;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanlarý : " + ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanlarý : " + ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanlarý : " + ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
	
	

}
