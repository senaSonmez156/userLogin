package userLogin;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String uN="senaSonmez", p="979695";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kullanýcý adý: ");
		String userName=scan.nextLine();
		System.out.print("ÞÝfre: ");
		String password=scan.nextLine();
		/*giriþ baþarýlýysa*/
		if(userName.equals(uN)&& password.equals(p)) {
			System.out.print("Giriþ baþarýlý, siteye yönlendiriliyorsunuz.");
		}
		/*username yanlýþsa*/
		else if(!userName.equals(uN)&& password.equals(p)) {
			System.out.print("Kullanýcý ismi hatalý");
		}
		/*þifre yanlýþsa*/
		else if(userName.equals(uN)&& !password.equals(p)) {
			System.out.print("Þifre hatalý \n1.Tekrar deneyiniz \n2.Þifreyi deðiþtir");
			String reply=scan.nextLine();
			if(reply.equals("1")) {
				System.out.print("Þifre: ");
				password=scan.nextLine();
				
			}
			//þifre deðiþtirmek için
			else if(reply.equals("2")) {
				System.out.print("Yeni þifre giriniz: ");
				String newPassword=scan.nextLine();
				if(newPassword.equals(p)) {
					System.out.print("Yeni þifre öncekilerle ayný olamaz.");
					newPassword=scan.nextLine();
					
					
				}else {
					System.out.print("Þifre oluþturuldu.");
					System.out.print("Kullanýcý adý: ");
					userName=scan.nextLine();
					System.out.print("ÞÝfre: ");
					password=scan.nextLine();
					
				}
			}
		}
		
		
		
		
		
		
		
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		

	}

}
