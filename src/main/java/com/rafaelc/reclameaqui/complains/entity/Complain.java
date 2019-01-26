package com.rafaelc.reclameaqui.complains.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "complains")
public class Complain {
	@Id
	private String id;
	private String title;
	private String description;
	private String locale;
	private String company;
	
	public Complain() {}
	
	public Complain(String title, String description, String locale, String company) {
		this.title = title;
		this.description = description;
		this.locale = locale;
		this.company = company;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
