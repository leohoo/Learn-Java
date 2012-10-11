package inheritanceAndComposition;

public class ChargingStation {
	void charge(IElectric e){
		e.recharge();
	}
}
