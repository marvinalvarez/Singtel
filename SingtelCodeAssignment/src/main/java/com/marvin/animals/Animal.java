package com.marvin.animals;

import java.util.HashMap;
import java.util.Map;

import com.marvin.actions.ActionsInterf;
import com.marvin.actions.NoAction;
import com.marvin.constants.ActionEnum;

public class Animal {

	private Map<ActionEnum, ActionsInterf> mapActions = new HashMap<ActionEnum, ActionsInterf>();

	public Animal() {
		System.out.println("-----");
	}

	public void addAction(ActionEnum actionEnum, ActionsInterf actionsInterf) {
		this.mapActions.put(actionEnum, actionsInterf);
	}

	public ActionsInterf getAction(ActionEnum actionEnum) {
		if (hasAction(actionEnum)) {
			return this.mapActions.get(actionEnum);
		} else {
			System.out.print("Animal cannot " + actionEnum.toString() + ". ");
			return new NoAction();
			// alternatively, throw a RuntimeException
		}
	}

	public Map<ActionEnum, ActionsInterf> getActionsMap() {
		return this.mapActions;
	}

	public void removeAction(ActionEnum actionEnum) {
		this.mapActions.remove(actionEnum);
	}

	public boolean hasAction(ActionEnum actionEnum) {
		return this.mapActions.containsKey(actionEnum);
	}

	public String doAction(ActionEnum actionEnum) {
		ActionsInterf action = this.getAction(actionEnum);
		return action.doAction();
	}
}
