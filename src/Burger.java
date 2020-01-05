
public abstract class Burger implements Item{
	/*
	  returns an object to access methods of Wrapper class
	  for better understanding see showItems method of 'Meal' class

	*/
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
