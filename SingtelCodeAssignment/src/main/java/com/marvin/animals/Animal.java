package com.marvin.animals;

import java.util.HashMap;
import java.util.Map;

import com.marvin.actions.ActionsInterf;
import com.marvin.actions.NoAction;
import com.marvin.constants.ActionEnum;
import com.marvin.constants.attributes.AttributeEnum;

public class Animal {

	private Map<ActionEnum, ActionsInterf> mapActions = new HashMap<ActionEnum, ActionsInterf>();
	private Map<AttributeEnum, String> mapAttributes = new HashMap<AttributeEnum, String>();

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

	public void addAttribute(AttributeEnum attributeEnum, String attribute) {
		this.mapAttributes.put(attributeEnum, attribute);
	}

	public String getAttribute(AttributeEnum attributeEnum) {
		String attribute = this.mapAttributes.get(attributeEnum);
		System.out.println("Animal is " + attribute + ".");
		return attribute;
	}
}
