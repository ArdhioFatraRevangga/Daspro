import java.util.Scanner;
public class selection106 {
    public static void main(String[]args){

Scanner input06 = new Scanner(System.in);
int number;
System.out.print("Input a number = ");
number = input06.nextInt();
if(number%2==0){
    System.out.println(number+ " is an even number!");
}else{
    System.out.println(number+ " is an odd number!");
}
    }
}