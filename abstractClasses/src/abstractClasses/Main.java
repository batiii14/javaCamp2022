package abstractClasses;

public class Main
{

	public static void main(String[] args)
	{
		KidGameCalculator kidGameCalculator = new KidGameCalculator();
		kidGameCalculator.hesapla();
		kidGameCalculator.gameOver();

		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
