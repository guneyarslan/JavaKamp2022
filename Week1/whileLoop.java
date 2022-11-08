
public class whileLoop {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			/*
			 * Burada bir algoritma hatası yaşadım. Alt satır ile üst satırın yerleri
			 * değiştiği zaman bambaşka bir sonuç çıkıyor. Çünkü önce üstüne ekleyip sonra
			 * yazdırıyor.
			 */
			i += 2;
		}
		System.out.println("Çift rakamlar yazıldı.");
	}

}
