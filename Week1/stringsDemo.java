
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel. ";

		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı : " + mesaj.length());
		 * System.out.println("5. Eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("Yaşasın!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith(" ")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj.lastIndexOf("e"));
		 */

		String yeniMesaj = mesaj.replace(" ", "-"); // yerlerini değiştiriyor.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5)); // iki değer arasını gösteriyor.

		for (String kelime : mesaj.split(" ")) { // girilen değere göre bölüyor.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // ekşi sözlükte kullanılıyor.
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // başını ve sonunu kesip temizliyor.
	}

}
