package userLogin;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String uN="senaSonmez", p="979695";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kullan�c� ad�: ");
		String userName=scan.nextLine();
		System.out.print("��fre: ");
		String password=scan.nextLine();
		/*giri� ba�ar�l�ysa*/
		if(userName.equals(uN)&& password.equals(p)) {
			System.out.print("Giri� ba�ar�l�, siteye y�nlendiriliyorsunuz.");
		}
		/*username yanl��sa*/
		else if(!userName.equals(uN)&& password.equals(p)) {
			System.out.print("Kullan�c� ismi hatal�");
		}
		/*�ifre yanl��sa*/
		else if(userName.equals(uN)&& !password.equals(p)) {
			System.out.print("�ifre hatal� \n1.Tekrar deneyiniz \n2.�ifreyi de�i�tir");
			String reply=scan.nextLine();
			if(reply.equals("1")) {
				System.out.print("�ifre: ");
				password=scan.nextLine();
				
			}
			//�ifre de�i�tirmek i�in
			else if(reply.equals("2")) {
				System.out.print("Yeni �ifre giriniz: ");
				String newPassword=scan.nextLine();
				if(newPassword.equals(p)) {
					System.out.print("Yeni �ifre �ncekilerle ayn� olamaz.");
					newPassword=scan.nextLine();
					
					
				}else {
					System.out.print("�ifre olu�turuldu.");
					System.out.print("Kullan�c� ad�: ");
					userName=scan.nextLine();
					System.out.print("��fre: ");
					password=scan.nextLine();
					
				}
			}
		}
		
		
		
		
		
		
		
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		

	}

}
