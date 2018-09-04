package com.marvin.actions;

import java.util.HashMap;
import java.util.Map;

import com.marvin.constants.LanguageEnum;

public class Talk_Rooster implements ActionsInterf {

	private Map<LanguageEnum, String> map = new HashMap<LanguageEnum, String>();

	private String message;

	{
		map.put(LanguageEnum.ENGLISH, "Cock-a-doodle-doo");
		map.put(LanguageEnum.DANISH, "kykyliky");
		map.put(LanguageEnum.DUTCH, "kukeleku");
		map.put(LanguageEnum.FINNISH, "kukko kiekuu");
		map.put(LanguageEnum.FRENCH, "cocorico");
		map.put(LanguageEnum.GERMAN, "kikeriki");
		map.put(LanguageEnum.GREEK, "kikiriki");
		map.put(LanguageEnum.HEBREW, "coo-koo-ri-koo");
		map.put(LanguageEnum.HUNGARIAN, "kukuriku");
		map.put(LanguageEnum.ITALIAN, "chicchirichi");
		map.put(LanguageEnum.JAPANESE, "ko-ke-kok-ko-o");
		map.put(LanguageEnum.PORTUGUESE, "cucurucu");
		map.put(LanguageEnum.RUSSIAN, "kukareku");
		map.put(LanguageEnum.SWEDISH, "kuckeliku");
		map.put(LanguageEnum.TURKISH, "kuk-kurri-kuuu");
		map.put(LanguageEnum.URDU, "kuklooku");
	}

	public Talk_Rooster() {
		this.message = map.get(LanguageEnum.ENGLISH);
	}

	public Talk_Rooster(LanguageEnum languageEnum) {
		this.message = map.get(languageEnum);
	}

	public String doAction() {
		String action = this.message;
		System.out.println(action);
		return action;
	}
}