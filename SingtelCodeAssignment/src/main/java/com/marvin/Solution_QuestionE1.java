package com.marvin;

import com.marvin.animals.Animal;
import com.marvin.animals.amphibians.Frog;
import com.marvin.animals.birds.Bird;
import com.marvin.animals.birds.Chicken;
import com.marvin.animals.birds.Duck;
import com.marvin.animals.birds.Parrot;
import com.marvin.animals.birds.Rooster;
import com.marvin.animals.fish.Clownfish;
import com.marvin.animals.fish.Fish;
import com.marvin.animals.fish.Shark;
import com.marvin.animals.insects.Caterpillar;
import com.marvin.animals.mammals.Cat;
import com.marvin.animals.mammals.Dog;
import com.marvin.animals.mammals.Dolphin;
import com.marvin.constants.ActionEnum;

public class Solution_QuestionE1 {

	public static void main(String args[]) {

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.doAction(ActionEnum.TRANSFORM);
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				caterpillar,
				new Cat()
				};

		int canFly = 0;
		int canWalk = 0;
		int canSwim = 0;
		int canSing = 0;

		for (Animal animal : animals) {
			if (animal.hasAction(ActionEnum.FLY)) {
				canFly++;
			}

			if (animal.hasAction(ActionEnum.WALK)) {
				canWalk++;
			}

			if (animal.hasAction(ActionEnum.SWIM)) {
				canSwim++;
			}
			if (animal.hasAction(ActionEnum.SING)) {
				canSing++;
			}
		}

		System.out.println("canFly=" + canFly);
		System.out.println("canWalk=" + canWalk);
		System.out.println("canSwim=" + canSwim);
		System.out.println("canSing=" + canSing);
	}
}