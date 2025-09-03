import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) throws Exception {
        //finishing the code
        System.out.println("How old are you? ");
        Scanner sc = new Scanner(System.in);
        String age = sc.next();
        System.out.println("You are " + age + " years old");
        int num1 = 10;
        int num2 = 37;
        int sum = num1 + num2;
        System.out.println("The sum of the two integers is " +sum);
        //This is all content that I am a bit familiar with. I took SD1 last semester but needed to drop the class due to struggle.
        //One question I have is the reasoning behind making age a string variable and not an integer.
        sc.close();

    }//main
}//Assignment1
