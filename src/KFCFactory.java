
public class KFCFactory implements IFoodFactory{

	@Override
	public Burger MakeBurger() {
		// TODO Auto-generated method stub
		return new KFCBurger();
	}

	@Override
	public Chicken MakeChicken() {
		// TODO Auto-generated method stub
		return new KFCChicken();
	}

	@Override
	public Drink MakeDrink() {
		// TODO Auto-generated method stub
		return new KFCDrink();
	}
}
