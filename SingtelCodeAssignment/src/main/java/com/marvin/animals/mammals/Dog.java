package com.marvin.animals.mammals;

import com.marvin.actions.Talk_Dog;
import com.marvin.actions.Walk;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;

public class Dog extends Animal {
	public Dog() {
		System.out.println("[A new dog instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Dog());
		super.addAction(ActionEnum.WALK, new Walk());
	}
}