package factory_strategy;

public class solution {

	public static void main(String[] args) {
		FactorySandwich sandwich=Factory.createSandwich(Factory.cheese_burger);
		sandwich.prepare();

	}

}
