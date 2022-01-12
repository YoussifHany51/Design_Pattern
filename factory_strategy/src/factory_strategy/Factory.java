package factory_strategy;

public class Factory {

	public static final int cheese_burger=1;
	public static final int chicken_burger=2;
	public static FactorySandwich createSandwich(int sandwichID) {
		
		switch(sandwichID) {
		case cheese_burger:
			return new CheeseBurger();
		case chicken_burger:
			return new ChickenBurger();	
			default:
			return null;
		}
	}
}
