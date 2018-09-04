package com.marvin.constants.attributes;

public enum SizeEnum {

	LARGE("large"), 
	SMALL("small");

	private String size;

	private SizeEnum(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}
}