import java.util.Scanner;

/**
 * Bank06
 */
public class Bank06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_initial_saving, length_of_saving;
        double prosentase_flower =0.02, flower, jml_final_saving;
        System.out.println("Enter your initial savings amount");
        jml_initial_saving = input.nextInt();
        System.out.println("Enter the length of your savings");
        length_of_saving = input.nextInt();
        flower= length_of_saving*prosentase_flower*jml_initial_saving;
        jml_final_saving=flower+jml_initial_saving;
        System.out.println("Flower is"+ flower);

        System.out.println("The final savings amount is" +jml_final_saving);
    }
}