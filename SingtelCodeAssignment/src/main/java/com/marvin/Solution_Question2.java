package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.birds.Chicken;
import com.marvin.animals.birds.Duck;
import com.marvin.constants.ActionEnum;

public class Solution_Question2 {

	public static void main(String args[]) {
		// Question 2
		{
			Animal animal = new Duck();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
		
		{
			Animal animal = new Chicken();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}
