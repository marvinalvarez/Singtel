package com.marvin.animals.birds;

import com.marvin.actions.Fly;
import com.marvin.actions.Sing;
import com.marvin.actions.Walk;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;

public class Bird extends Animal {

	public Bird() {
		System.out.println("[A new bird instance has been created]");
		super.addAction(ActionEnum.FLY, new Fly());
		super.addAction(ActionEnum.SING, new Sing());
		super.addAction(ActionEnum.WALK, new Walk());
	}
}
