package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.fish.Fish;
import com.marvin.constants.ActionEnum;

public class Solution_QuestionB1 {

	public static void main(String args[]) {
		
		// Question B1
		{
			Animal animal = new Fish();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}
