
public class switchDemo {

	public static void main(String[] args) {
		// Kullanıcı tek zar atarak kazanabilir ya da kaybedebilir.
		// 1, 2, 3 kaybetti. 4, 5, 6 kazandı anlamına gelir.

		byte zar = 2;

		switch (zar) {
		case 1:
		case 2:
		case 3:
			System.out.println("Kaybettiniz.");
			break;

		case 4:
		case 5:
		case 6:
			System.out.println("Kazandınız");
			break;

		// Dijital zar atıldığı için bu 6 ihtimal dışında bir ihtimal olamaz.
		// Ancak yine de default kullanmak için zarı atamadığı ihtimalini yazalım.
		default:
			System.out.println("Zarı atamadınız, tekrar deneyin!");

		}

	}

}
