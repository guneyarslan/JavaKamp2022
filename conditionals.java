
public class conditionals {

	public static void main(String[] args) {
		int gelir = 5500;
		int gider = 2200;
		int kalanPara = (gelir-gider);
		int telFiyat = 4000;

		String mesaj1 = "Telefonu alabilirsin.";
		String mesaj2 = "Telefonu alamazsın.";
		
		if (kalanPara>telFiyat) {
			System.out.println("Telefonu Alabilirsin.");
			}
		
		else (kalanPara<=telFiyat){
			System.out.println("Telefonu alamazsın!");
		}
		
	}
	

}
