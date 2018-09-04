package com.marvin.animals.mammals;

import com.marvin.actions.Talk_Cat;
import com.marvin.actions.Walk;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;

public class Cat extends Animal {
	public Cat() {
		System.out.println("[A new cat instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Cat());
		super.addAction(ActionEnum.WALK, new Walk());
	}
}