package com.marvin.animals.fish;

import com.marvin.actions.Eat_OtherFish;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;
import com.marvin.constants.attributes.ColorEnum;
import com.marvin.constants.attributes.SizeEnum;

public class Shark extends Fish {
	public Shark() {
		System.out.println("[A new shark instance has been created]");
		super.addAction(ActionEnum.EAT, new Eat_OtherFish());
		super.addAttribute(AttributeEnum.COLOR, ColorEnum.GREY.getColor());
		super.addAttribute(AttributeEnum.SIZE, SizeEnum.LARGE.getSize());
	}
}
