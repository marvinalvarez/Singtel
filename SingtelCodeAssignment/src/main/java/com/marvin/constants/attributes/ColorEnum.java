package com.marvin.constants.attributes;

public enum ColorEnum {

	GREY("grey"), 
	ORANGE("orange");

	private String color;

	private ColorEnum(String color) {
		this.color = color;
	}
	
	public String getColor()
	{
		return this.color;
	}
}