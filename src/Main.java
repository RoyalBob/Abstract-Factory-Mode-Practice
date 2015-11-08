
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFoodFactory kfcfactory=new KFCFactory();
		kfcfactory.MakeBurger().Make();
		kfcfactory.MakeChicken().Make();
		kfcfactory.MakeDrink().Make();
		
		IFoodFactory mcdonaldfactory=new McDonaldFactory();
		mcdonaldfactory.MakeBurger().Make();
		mcdonaldfactory.MakeChicken().Make();
		mcdonaldfactory.MakeDrink().Make();
	}

}
