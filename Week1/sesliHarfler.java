
public class sesliHarfler {

	public static void main(String[] args) {
		String harf = "a"; //kullanıcıdan aldığımız harf.
		
		/*String[] kalinSesli = new String [4];
		*kalinSesli[0] = "a";
		*kalinSesli[1] = "ı";
		*kalinSesli[2] = "o";
		*kalinSesli[3] = "u";
		*
		*String[] inceSesli = new String [4];
		*inceSesli[0] = "e";
		*inceSesli[1] = "i";
		*inceSesli[2] = "ö";
		*inceSesli[3] = "ü";
		*/
		
		//Harfleri gruplayıp ona göre yapmaya çalıştım ama başaramadım.
		//Hepsini bir seferde yapacaktım fakat şimdi case ile tek tek yapmam gerekiyor.
		
		switch (harf) {
		case "a":
		case "ı":
		case "o":
		case "u":
			System.out.println("Kalın sesli bir harftir.");
			break;
			
		case "e":
		case "i":
		case "ö":
		case "ü":
			System.out.println("İnce sesli bir harftir.");
			
			default:
				System.out.println("Lütfen bir sesli harf giriniz.");
				//Şimdi izledim Engin Hocanın kodunda e,i,ö,ü için ayrı case'ler yok
				//Bu durumda kullanıcı oraya 1 yazarsa "İnce sesli harf" uyarısı gelmeyecek mi?
		}
		//Büyük küçük harf duyarlılığından dolayı kullanıcıdan input aldıktan sonra
		//girilen veriyi toLowerCase işlemi ile düzeltebiliriz. 
		//Ayrıca boşluk bırakması durumunda "trim" kullanabiliriz.

	}

}
