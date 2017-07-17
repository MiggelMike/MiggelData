import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Ampelfarben {

	public static void main(String[] args) {
		char farbe = 'r';
		switch(farbe){
			case 'r':
				System.out.println("Rot. Bitte warten");
				break;
			case 'y':
				System.out.println("Gelb. Gleich get es los");
				break;
			case 'g':
				System.out.println("Gruen. Weg frei");
				break;
			default:
				System.out.println("Fehler! Diese Farbe gibt es nicht.");
				break;
		}
		
		if(farbe == 'r'){
			System.out.println("Rot. Bitte warten");
		}else if(farbe == 'y'){
			System.out.println("Gelb. Gleich get es los");
		}else if(farbe == 'g'){
			System.out.println("Gruen. Weg frei");
		}else {
			System.out.println("Fehler! Diese Farbe gibt es nicht.");
		} 
	}

}
