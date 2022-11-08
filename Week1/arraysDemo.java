
public class arraysDemo {

	public static void main(String[] args) {
		// Her gün 5 adet yemek, yemek şirketi tarafından sisteme giriliyor.
		// Çalışanlar hangi yemek, içecek ve tatlı var bakabiliyor.
		String[] yemekler = new String[5];
		yemekler[0] = "Kebap";
		yemekler[1] = "Pide";
		yemekler[2] = "Makarna";
		yemekler[3] = "Kabak";
		yemekler[4] = "Pilav";

		System.out.println("Yemekler:");
		for (String yemek : yemekler) {
			System.out.println(yemek);

		}
		System.out.println("--------------------");
		String[] tatlilar = new String[3];
		tatlilar[0] = "Sütlaç";
		tatlilar[1] = "Puding";
		tatlilar[2] = "Pasta";

		System.out.println("Tatlılar:");
		for (String tatli : tatlilar) {
			System.out.println(tatli);

		}

	} //Basit gözüküyor ama algoritma hatalarıyla can çekiştim.
}