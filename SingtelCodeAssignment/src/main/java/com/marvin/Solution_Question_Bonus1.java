package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.birds.Rooster;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.LanguageEnum;

public class Solution_Question_Bonus1 {

	public static void main(String args[]) {

		{
			Animal animal = new Rooster();
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}

		{
			Animal animal = new Rooster(LanguageEnum.DANISH);
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}

		{
			Animal animal = new Rooster(LanguageEnum.GERMAN);
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}

		{
			Animal animal = new Rooster(LanguageEnum.GREEK);
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}

		{
			Animal animal = new Rooster(LanguageEnum.RUSSIAN);
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
		{
			Animal animal = new Rooster(LanguageEnum.URDU);
			animal.doAction(ActionEnum.WALK);
			animal.doAction(ActionEnum.FLY);
			animal.doAction(ActionEnum.SING);
			animal.doAction(ActionEnum.TALK);
			animal.doAction(ActionEnum.SWIM);
		}
	}
}