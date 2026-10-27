package p3;
    import java.util.Scanner;
public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.print("Massa (m) kg          : ");
        double m = in.nextDouble();
        System.out.print("Kecepatan (v) m/s     : ");
        double v = in.nextDouble();
        System.out.print("Jari-jari (r) m       : ");
        double r = in.nextDouble();
 
        double fc = (m * v * v) / r;
 
        System.out.println("Gaya sentripetal (Fc) = " + fc + " N");
    }
}
