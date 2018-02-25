package rabaty;

public class RabatProcentowy implements IObliczCenePoRabacie {
	
	double rabatProcentowy = configuracja.Singleton.getInstance().getProcentRabatu();

	@Override
	public double obliczCenePoRabacie(double cena) {
		return cena-0.1*cena;
	}

}
