package com.weatherbychar.dao;

/**
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class OWA_Weather {
	
	private String id;
	private String main;
	private String description;
	private String icon;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("\n\t id : ").append(id);
		buff.append("\n\t main : ").append(main);
		buff.append("\n\t description : ").append(description);
		buff.append("\n\t icon : ").append(icon);
		
		return buff.toString();
	}
}
