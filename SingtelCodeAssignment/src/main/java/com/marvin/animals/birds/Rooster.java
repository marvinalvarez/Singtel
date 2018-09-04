package com.marvin.animals.birds;

import com.marvin.actions.Talk_Rooster;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.LanguageEnum;

public class Rooster extends Chicken {

	public Rooster() {
		System.out.println("[A new rooster instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Rooster());
		super.removeAction(ActionEnum.FLY);
	}

	public Rooster(LanguageEnum languageEnum) {
		System.out.println("[A new rooster instance has been created]");
		super.addAction(ActionEnum.TALK, new Talk_Rooster(languageEnum));
		super.removeAction(ActionEnum.FLY);
	}
}
