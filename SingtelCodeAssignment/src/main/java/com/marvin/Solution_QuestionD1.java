package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.insects.Caterpillar;
import com.marvin.constants.ActionEnum;

public class Solution_QuestionD1 {

	public static void main(String args[]) {

		// Question D1
		{
			Animal animal = new Caterpillar();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}