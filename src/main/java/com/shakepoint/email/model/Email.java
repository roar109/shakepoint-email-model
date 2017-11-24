package com.shakepoint.email.model;

import java.util.Map;

import com.google.gson.Gson;

public class Email {

	private String to;
	private String templateName;
	private String subject;
	private Map<String, Object> variables;

	public Email(){}
	
	public Email(String to, String templateName, String subject, Map<String, Object> variables) {
		super();
		this.to = to;
		this.templateName = templateName;
		this.subject = subject;
		this.variables = variables;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}
}
