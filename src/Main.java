import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String kullanici_adi,sifre,yenisifre;
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        kullanici_adi=input.nextLine();
        System.out.print("Şifre: ");
        sifre=input.nextLine();
        if(kullanici_adi.equals("enes") && sifre.equals("enes1234"))
        {
            System.out.println("Giriş Başarılı.");

        }
        else {
            System.out.println("Bilgileriniz Yanlış!!");
            System.out.println("Şifrenizi Sıfırlamak İstermisiniz?");
            System.out.println("evet/hayır");
            String kontrol = input.nextLine();
            if (kontrol.equals("evet"))
            {
                    System.out.print("Yeni Şifreniz: ");
                    yenisifre = input.nextLine();
                    if (yenisifre.equals("enes1234"))
                    {
                        System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz.");
                    }
                    else
                    {
                        System.out.println("Şifre Oluşturuldu");
                        System.out.print("Yeni şifreniz:" + yenisifre);
                    }

            }
        }

    }

}