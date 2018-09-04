package com.marvin.animals.fish;

import com.marvin.actions.Swim;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;

public class Fish extends Animal {
	public Fish() {
		System.out.println("[A new fish instance has been created]");
		super.addAction(ActionEnum.SWIM, new Swim());
	}
}
