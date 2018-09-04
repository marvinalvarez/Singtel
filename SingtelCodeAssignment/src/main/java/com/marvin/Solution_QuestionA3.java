package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.birds.Rooster;
import com.marvin.constants.ActionEnum;

public class Solution_QuestionA3 {

	public static void main(String args[]) {
		
		{
			Animal animal = new Rooster();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}
