package inheritanceAndComposition;

public class ElectricTruck extends Truck implements IElectric {

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		System.out.print(this + " Charging.");
	}

}
