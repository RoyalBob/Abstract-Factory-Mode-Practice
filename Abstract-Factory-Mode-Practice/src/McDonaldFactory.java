
public class McDonaldFactory implements IFoodFactory{

	@Override
	public McDonaldBurger MakeBurger() {
		// TODO Auto-generated method stub
		return new McDonaldBurger();
	}

	@Override
	public McDonaldChicken MakeChicken() {
		// TODO Auto-generated method stub
		return new McDonaldChicken();
	}

	@Override
	public McDonaldDrink MakeDrink() {
		// TODO Auto-generated method stub
		return new McDonaldDrink();
	}

}
