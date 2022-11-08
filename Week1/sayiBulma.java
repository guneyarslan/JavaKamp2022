
public class sayiBulma {

	public static void main(String[] args) {
		int[] rakamlar = new int[] { 1, 3, 5, 7, 9, 0 }; // integerdan oluşan bir dizi yarat bu dizinin elemanları bunlar.
															
		int inputNum = 5; // kullanıcıdan alınan sayı

		boolean isNumber = false; // bu sayıyı doğrudan yok kabul ediyoruz.

		for (int rakam : rakamlar) { // rakamlar dizininde "rakam" olarak her bir diziyi gez.
			if (rakam == inputNum) { // eğer gezdiğin rakam alınan sayıya eşitse
				isNumber = true; // boolean değerini true ile değiştir. bu rakam vardır.
				break; // bitir.
			}
		}
		if (isNumber) { // boolean değeri true ise eğer,
			System.out.println("Sayı var."); // yazdır.
		} else { // yok değilse
			System.out.println("Sayı yok"); // bunu yazdır.
		}
	}

}
