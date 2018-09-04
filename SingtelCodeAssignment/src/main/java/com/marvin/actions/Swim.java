package com.marvin.actions;

public class Swim implements ActionsInterf {

	public String doAction() {
		String action = "I am swimming";
		System.out.println(action);
		return action;
	}
}