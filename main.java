import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int r;
        double alfa;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r= inp.nextInt();
        System.out.print("Merkez açısını giriniz:");
        alfa= inp.nextInt();

        double alan = ((pi*(r*r)*alfa)/360) ;
        System.out.println("Dairenin alanı : " + alan);

    }

}
