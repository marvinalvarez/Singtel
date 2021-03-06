package com.marvin.animals.insects;

import com.marvin.actions.Transform_Metamorphosis;
import com.marvin.actions.Walk;
import com.marvin.constants.ActionEnum;

public class Caterpillar extends Insect {
	public Caterpillar() {
		System.out.println("[A new caterpillar instance has been created]");
		super.addAction(ActionEnum.WALK, new Walk());
		super.addAction(ActionEnum.TRANSFORM, new Transform_Metamorphosis(super.getActionsMap()));
	}
}
