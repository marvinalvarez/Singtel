package com.marvin;

import com.marvin.actions.Talk_Cat;
import com.marvin.actions.Talk_Dog;
import com.marvin.actions.Talk_Rooster;
import com.marvin.animals.Animal;
import com.marvin.animals.birds.Parrot;
import com.marvin.constants.ActionEnum;

public class Solution_QuestionA4 {

	public static void main(String args[]) {
		
		{
			Animal animal = new Parrot();
			animal.addAction(ActionEnum.TALK, new Talk_Dog());
			
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
		
		{
			Animal animal = new Parrot();
			animal.addAction(ActionEnum.TALK, new Talk_Cat());
			
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
		
		{
			Animal animal = new Parrot();
			
			// NOTE: the Talk_Rooster action object was re-used for the parrot
			animal.addAction(ActionEnum.TALK, new Talk_Rooster());
			
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}
