package rabaty;

public class RabatKwotowy implements IObliczCenePoRabacie {
	
	double kwotaRabatu = configuracja.Singleton.getInstance().getKwotaRabatu();

	@Override
	public double obliczCenePoRabacie(double cena) {
		return cena -10;
	}

}
