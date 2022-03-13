import java.util.Scanner;
public class cal {
     public  static  void  main (String[]args){
         Scanner brt =new Scanner(System.in);
         System.out.print("birinci sayıyı giriniz =");
         int a =brt.nextInt();
         System.out.print("ikincisayiyi giriniz =");
         int b = brt.nextInt();
         System.out.print("1- toplam \n"+"2-cıkarma\n"+"3-carpma\n"+"4-bolme ");

         System.out.print("bir islem seciniz ");
         int islem = brt.nextInt();
          switch (islem){
              case 1:
                  System.out.print(a+b);
                  break;
              case 2:
                  System.out.print(a-b);
                  break;
              case 3:
                  System.out.print(a*b);
                  break;
              case 4:
                  System.out.print(a/b);
                  break;

         }
     }
}
