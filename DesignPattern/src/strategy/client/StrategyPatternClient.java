package strategy.client;

import strategy.customer.Animal;
import strategy.customer.Cat;
import strategy.customer.Dog;
import strategy.strategies.CatMakeSoundBehavior;
import strategy.strategies.CatPlayBehavior;
import strategy.strategies.DogMakeSoundBehavior;
import strategy.strategies.DogPlayBehavior;
import strategy.strategies.MakeSoundBehavior;
import strategy.strategies.PlayBehavior;

public class StrategyPatternClient {

	public static void main(String[] args) {
		// 初始化所有出声策略
		MakeSoundBehavior dogSoundBehavior = new DogMakeSoundBehavior();
		MakeSoundBehavior catSoundBehavior = new CatMakeSoundBehavior();
		// 初始化所有玩耍策略
		PlayBehavior dogPlayBehavior = new DogPlayBehavior();
		PlayBehavior catplaybeBehavior = new CatPlayBehavior();
		// 狗用狗的出声策略和玩耍策略，猫用猫的
		System.out.println("狗用狗的出声策略和玩耍策略，猫用猫的:");
		Animal dog = new Dog(dogSoundBehavior, dogPlayBehavior);
		Animal cat = new Cat(catSoundBehavior, catplaybeBehavior);
		System.out.println("Dog makeSound:");
		dog.performMakeSound();
		System.out.println("Dog playing:");
		dog.performPlay();
		System.out.println("Cat makeSound:");
		cat.performMakeSound();
		System.out.println("Cat playing:");
		cat.performPlay();
		System.out.println("=======================================");
		// 狗在出声动作上采用猫的出声策略，猫在玩耍动作上采用狗的玩耍策略，这是策略模式的重点，即策略之间可以互相替换
		System.out.println("狗在出声动作上采用猫的出声策略，猫在玩耍动作上采用狗的玩耍策略:");
		dog.setSoundBehavior(catSoundBehavior);
		cat.setPlayBehavior(dogPlayBehavior);
		System.out.println("Dog makeSound:");
		dog.performMakeSound();
		System.out.println("Dog playing:");
		dog.performPlay();
		System.out.println("Cat makeSound:");
		cat.performMakeSound();
		System.out.println("Cat playing:");
		cat.performPlay();
	}
}
