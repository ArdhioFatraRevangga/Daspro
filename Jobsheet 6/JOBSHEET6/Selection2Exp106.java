import java.util.Scanner;
public class Selection2Exp106 {
    public static void main(String[] args) {
        Scanner inputan06 = new Scanner(System.in); 
        int year; System.out.println("What Year ?"); 
        year = inputan06.nextInt(); 
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not A Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not A Leap Year");
        }
        
         if (year%4==0) {
             if (year%100!=0) {
                 System.out.println("Leap Year"); 
         }   else {
                 System.out.println("Not A leap Year");
         }
         }   else { 
             System.out.println("Not A leap Yea"); }
    }
}