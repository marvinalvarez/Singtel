package com.marvin.actions;

import java.util.Map;

import com.marvin.constants.ActionEnum;

public class Transform_Metamorphosis implements ActionsInterf {

	private Map<ActionEnum, ActionsInterf> mapActions;

	public Transform_Metamorphosis(Map<ActionEnum, ActionsInterf> mapActions) {
		this.mapActions = mapActions;
	}

	public String doAction() {
		mapActions.remove(ActionEnum.WALK);
		mapActions.put(ActionEnum.FLY, new Fly());
		
		String action = "The caterpillar metamorphosized into a butterfly.";
		System.out.println(action);
		return action;
	}
}
