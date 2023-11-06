import java.util.Scanner;
public class selection206 {
    public static void main(String[]args){

Scanner input06 = new Scanner(System.in);
System.out.print("Nilai uas     : "); 
float finalExam = input06.nextFloat();
System.out.print("Nilai uts     : ");
float midExam = input06.nextFloat();

System.out.print("Nilai quiz    : ");
float quiz = input06.nextFloat();
System.out.print("Nilai tugas   : ");
float assigment = input06.nextFloat();

float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assigment * 0.2F);
String messege = total < 65 ? "Retake" : "Pass";
System.out.println("Final grade = " + total + "and the decission is " + messege); 
    }
}
