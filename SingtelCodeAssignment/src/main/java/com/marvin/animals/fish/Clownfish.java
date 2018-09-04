package com.marvin.animals.fish;

import com.marvin.actions.Talk_MakeJokes;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;
import com.marvin.constants.attributes.ColorEnum;
import com.marvin.constants.attributes.SizeEnum;

public class Clownfish extends Fish {
	public Clownfish() {
		System.out.println("[A new clownfish instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_MakeJokes());
		super.addAttribute(AttributeEnum.COLOR, ColorEnum.ORANGE.getColor());
		super.addAttribute(AttributeEnum.SIZE, SizeEnum.SMALL.getSize());
	}
}
