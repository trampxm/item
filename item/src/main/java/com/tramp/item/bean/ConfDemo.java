package com.tramp.item.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="com.tramp")
@PropertySource(value="classpath:conf-demo.properties")
public class ConfDemo {
	
	private String url;
	
	private String name;
	
	private String pwd;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "ConfDemo [url=" + url + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	

}
