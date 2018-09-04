package com.marvin.animals.mammals;

import com.marvin.actions.Eat_OtherFish;
import com.marvin.actions.Swim;
import com.marvin.animals.Animal;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;
import com.marvin.constants.attributes.ColorEnum;
import com.marvin.constants.attributes.SizeEnum;

public class Dolphin extends Animal {
	public Dolphin() {
		System.out.println("[A new dolphin instance has been created]");
		super.addAction(ActionEnum.SWIM, new Swim());
		super.addAction(ActionEnum.EAT, new Eat_OtherFish());
		super.addAttribute(AttributeEnum.COLOR, ColorEnum.GREY.getColor());
		super.addAttribute(AttributeEnum.SIZE, SizeEnum.LARGE.getSize());
	}
}