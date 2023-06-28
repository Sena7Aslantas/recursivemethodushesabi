import java.util.Scanner;
public class Main {

    static void us(){
        System.out.print("Taban degerini giriniz:");
        Scanner input=new Scanner(System.in);
        int t= input.nextInt();
        System.out.print("Us degerini girin:");
        int u= input.nextInt();
        int result=1;
        for(int i=1;i<=u;i++){
            result*=t;
        }
        System.out.print("Sonuc"+result);
    }
    public static void main(String[] args) {

         us();
    }
}