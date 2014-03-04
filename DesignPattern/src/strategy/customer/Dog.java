package strategy.customer;

import strategy.strategies.MakeSoundBehavior;
import strategy.strategies.PlayBehavior;

public class Dog extends Animal {

	public Dog(MakeSoundBehavior soundBehavior, PlayBehavior playBehavior) {
		super(soundBehavior, playBehavior);
	}

}
