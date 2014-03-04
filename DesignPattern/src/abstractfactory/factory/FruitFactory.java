/**
 * 
 */
package abstractfactory.factory;

import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.Orange;

/**
 * 抽象工场模式和工场方法模式的最主要区别在于前者提供了生产一系列产品族产品的创建方法，
 * 而后者将如何生产产品的逻辑放到其工场方法中
 * 
 * 本工场可以创建三个产品族的产品，分别是苹果(Apple),香蕉(Banana)和橙子(Orange)
 * 通常来讲抽象工厂的实现可以用单例，但在本工程的Practice里都不进行设计模式的组合
 */
public interface FruitFactory {
	
	public Apple createApple();
	
	public Banana createBanana();
	
	public Orange createOrange();
}
