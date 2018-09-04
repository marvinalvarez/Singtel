package com.marvin.animals.birds;

import com.marvin.actions.Talk_Chicken;
import com.marvin.constants.ActionEnum;

public class Chicken extends Bird {
	public Chicken() {
		System.out.println("[A new chicken instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Chicken());
		super.removeAction(ActionEnum.FLY);
	}
}