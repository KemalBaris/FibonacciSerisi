import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, n1=0, n2=1,n3;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir sayı giriniz: ");
        n = input.nextInt();

        for (int counter = 1;counter <= n; counter++ ){
            n3=n1+n2;
            System.out.print(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }

    }
}