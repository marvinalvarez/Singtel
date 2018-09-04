package com.marvin.actions;

public class Fly implements ActionsInterf {

	public String doAction() {
		String action = "I am flying";
		System.out.println(action);
		return action;
	}
}