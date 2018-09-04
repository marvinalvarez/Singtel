package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.birds.Bird;
import com.marvin.constants.ActionEnum;

public class Solution_Question1 {

	public static void main(String args[]) {
		
		// Question 1
		{
			Animal animal = new Bird();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}
