package configuracja;

import rabaty.IObliczCenePoRabacie;
import rabaty.RabatKwotowy;
import rabaty.RabatLosowy;
import rabaty.RabatProcentowy;


public class Singleton {
	
	private static Singleton instance = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	public IObliczCenePoRabacie getLiczarkaRabatu(){
	return new RabatLosowy();
	
}
	
	public double getKwotaRabatu(){
		return 10;
	}
	
	public double getProcentRabatu(){
		return 0.1;
	}
}
