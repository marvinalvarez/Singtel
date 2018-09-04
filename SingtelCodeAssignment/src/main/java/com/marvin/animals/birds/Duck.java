package com.marvin.animals.birds;

import com.marvin.actions.Swim;
import com.marvin.actions.Talk_Duck;
import com.marvin.constants.ActionEnum;

public class Duck extends Bird {

	public Duck() {
		System.out.println("[A new duck instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Duck());
		super.addAction(ActionEnum.SWIM, new Swim());
	}
}
