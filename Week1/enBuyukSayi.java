
public class enBuyukSayi {

	public static void main(String[] args) {

		int sayi1 = 35;
		int sayi2 = 125;
		int sayi3 = 1;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı = " + enBuyuk);

	}
}
