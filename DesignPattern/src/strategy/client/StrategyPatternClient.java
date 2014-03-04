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
		// ��ʼ�����г�������
		MakeSoundBehavior dogSoundBehavior = new DogMakeSoundBehavior();
		MakeSoundBehavior catSoundBehavior = new CatMakeSoundBehavior();
		// ��ʼ��������ˣ����
		PlayBehavior dogPlayBehavior = new DogPlayBehavior();
		PlayBehavior catplaybeBehavior = new CatPlayBehavior();
		// ���ù��ĳ������Ժ���ˣ���ԣ�è��è��
		System.out.println("���ù��ĳ������Ժ���ˣ���ԣ�è��è��:");
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
		// ���ڳ��������ϲ���è�ĳ������ԣ�è����ˣ�����ϲ��ù�����ˣ���ԣ����ǲ���ģʽ���ص㣬������֮����Ի����滻
		System.out.println("���ڳ��������ϲ���è�ĳ������ԣ�è����ˣ�����ϲ��ù�����ˣ����:");
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
