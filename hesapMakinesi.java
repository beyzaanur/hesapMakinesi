import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma \n4-bölme");
        System.out.println("seçiniz: ");
        select = input.nextInt();

        switch(select){
            case 1 :
                System.out.println("sonuc = "+ (n1 + n2));
                break;
            case 2 :
                System.out.println("sonuc = " + (n1-n2));
                break;
            case 3 :
                System.out.println("sonuc = " + (n1*n2));
                break;
            case 4 :
                if (n2 == 0) {
                    System.out.println("bir sayı 0'a bölünemez");
            }
                else
                    System.out.println("sonuc = " + (n1/n2));
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz..");

        }
    }
}
