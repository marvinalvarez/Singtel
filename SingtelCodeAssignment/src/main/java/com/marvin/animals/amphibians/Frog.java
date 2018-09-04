package com.marvin.animals.amphibians;

import com.marvin.actions.Fly;
import com.marvin.actions.Walk;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;

public class Frog extends Animal {

	public Frog() {
		System.out.println("[A new frog instance has been created]");
		super.addAction(ActionEnum.SWIM, new Fly());
		super.addAction(ActionEnum.WALK, new Walk());
	}
}
