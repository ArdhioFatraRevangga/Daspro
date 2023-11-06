import java.util.Scanner;

/**
 * Triangle06
 */
public class Triangle06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,high;
        float area;
        System.out.print("Insert base: ");
        base = sc.nextInt();
        System.out.print("Insert high: "); 
        high = sc.nextInt();
        area = base * high / 2;
        System.out.print("Triangle area: " + area);
    }
}