package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.fish.Clownfish;
import com.marvin.animals.fish.Shark;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;

public class Solution_QuestionB2 {

	public static void main(String args[]) {
		
		// Question B2
		{
			Animal animal = new Shark();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
			
			animal.getAttribute(AttributeEnum.SIZE);
			animal.getAttribute(AttributeEnum.COLOR);
		}
		
		{
			Animal animal = new Clownfish();
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
