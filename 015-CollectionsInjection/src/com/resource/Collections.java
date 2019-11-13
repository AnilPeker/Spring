package com.resource;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
	List<?> list;
	Set<?> set;
	Map<?, ?> map;
	Properties properties;
	
	
	public List<?> getOgrenciList(){ 
		System.out.println("List elemanlarý : " + list);
		return list;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		this.list = ogrenciList;
	}
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanlarý : " + set);
		return set;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.set = ogrenciSet;
	}
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanlarý : " + map);
		return map;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.map = ogrenciMap;
	}
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanlarý : " + properties);
		return properties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.properties = ogrenciProperties;
	}
	@Override
	public String toString() {
		return "list=" + list + "\nset=" + set + "\nmap=" + map + "\nproperties=" + properties + "]";
	}
	
	

}
