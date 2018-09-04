package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.mammals.Dolphin;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;

public class Solution_QuestionB3 {

	public static void main(String args[]) {

		// Question B3
		{
			Animal animal = new Dolphin();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);

			animal.getAttribute(AttributeEnum.SIZE);
			animal.getAttribute(AttributeEnum.COLOR);
		}
	}
}
