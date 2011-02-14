package org.orman.mapper;

public class PhysicalNamingPolicy {
	
	private boolean uppercase= false;
	private boolean underscore = true;
	private boolean pluralize = false;
	public boolean isUppercase() {
		return uppercase;
	}
	
	public PhysicalNamingPolicy uppercase(boolean uppercase) {
		this.uppercase = uppercase;
		return this;
	}
	
	public boolean isUnderscore() {
		return underscore;
	}
	
	public PhysicalNamingPolicy underscore(boolean underscore) {
		this.underscore = underscore;
		return this;
	}
	
	public boolean isPluralize() {
		return pluralize;
	}
	
	public PhysicalNamingPolicy pluralize(boolean pluralize) {
		this.pluralize = pluralize;
		return this;
	}
	
	
}