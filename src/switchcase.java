import java.util.Scanner;

public class switchcase {
	public static void main (String [] args) {
		int day = 7;
		System.out.println("Masukan Angka 1-7");
		
		Scanner masukan =new Scanner(System.in);
		day = masukan.nextInt();
		
		switch (day) {
		case 1 :
			System.out.println("senin");
			break;
		case 2 :
			System.out.println("selasa");
			break;
		case 3 :
			System.out.println("rabu");
			break;
		case 4 :
			System.out.println("kamis");
			break;
		case 5 :
			System.out.println("jumat");
			break;
		case 6 :
			System.out.println("sabtu");
			break;
		case 7 :
			System.out.println("minggu");
			break;
		}
	}
	
}
