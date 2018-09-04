package com.marvin.actions;

public class NoAction implements ActionsInterf {

	public String doAction() {
		String action = "\t\t- Cannot perform action";
		System.out.println(action);
		return action;
	}
}
