package com.szcgc.wechat.entity;

import java.util.Map;

public class TemplateMessage {

	private String touser;
	private String template_id;
	private String url;
	private Map<String, TemplateMsgData> data;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, TemplateMsgData> getData() {
		return data;
	}

	public void setData(Map<String, TemplateMsgData> data) {
		this.data = data;
	}

	public TemplateMessage(String touser, String template_id, String url, Map<String, TemplateMsgData> data) {
		super();
		this.touser = touser;
		this.template_id = template_id;
		this.url = url;
		this.data = data;
	}

}
