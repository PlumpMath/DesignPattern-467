package strategy.strategies;

/**
 * 发声行为的策略接口
 * @author hywang
 */
public interface MakeSoundBehavior {
  
	/**
	 * 实现类通过实现此方法进行具体的发声行为 
	 */
	public void makeSound();
}
