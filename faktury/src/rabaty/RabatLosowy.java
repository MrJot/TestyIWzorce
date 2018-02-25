package rabaty;

import rabatlosowy.LosowyRabat;

public class RabatLosowy implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		LosowyRabat losuj = new LosowyRabat();
		return cena - losuj.losujRabat()*cena;
	}
}
