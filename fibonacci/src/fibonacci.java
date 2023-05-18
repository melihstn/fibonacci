import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("bir sayı giriniz : ");
        n = input.nextInt();

        System.out.print(n + " sayısının fibonacci serisi : ");
        int s1 = 0, s2 = 1, toplam;
        for(int i =1; i<= n; i++){
            System.out.print(s1 + ",");

            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
