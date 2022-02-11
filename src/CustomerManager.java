import java.util.Scanner;

public class CustomerManager
{
   BasePhoneManager basePhoneManager ;
   Scanner scanner = new Scanner(System.in);
   int phonePrice ;
   double phoneOTV ;
   void infoMessage()
   {
       System.out.println("-----Telefonun Ücret Bilgileri-------");
       System.out.println("Telefon giriş ücreti :");
       phonePrice = scanner.nextInt();
       if (phonePrice>=3000)
       {
           phoneOTV=0.4;
       }
       else  if (phonePrice <=3000 && phonePrice>1500)
       {
           phoneOTV=0.25;
       }
       else
       {
           phoneOTV=0.15;
       }
       System.out.println("Hükümlü olduğunuz OTV oranı : "+ phoneOTV);


     }
    void doTheShopping(){
        System.out.println("-----------------\n< Telefon Bilgileri >\n-----------------");
        System.out.println("-> Telefon Markası: "+basePhoneManager.getPhoneBrand());
        System.out.println("-> Telefon Modeli: "+basePhoneManager.phoneModel);
        System.out.println("-----------------\n< Telefon Hesaplaması >\n-----------------");
        System.out.println("-> Telefon Fiyatı: "+ basePhoneManager.buyTelephone(phonePrice,phoneOTV));
        System.out.println("-----------------");
    }
}
