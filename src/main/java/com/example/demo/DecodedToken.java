package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DecodedToken {
	private String iat;
	private String exp;
	private String iss;
	private String sub;
	private String profile_org;
	private String jti;
	private String ver;
	
	public String getIat() {
		return iat;
	}
	public void setIat(String iat) {
		this.iat = iat;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getProfile_org() {
		return profile_org;
	}
	public void setProfile_org(String profile_org) {
		this.profile_org = profile_org;
	}
	public String getJti() {
		return jti;
	}
	public void setJti(String jti) {
		this.jti = jti;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	
	public String toString() {
	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      return gson.toJson(this);
	}
	
}
