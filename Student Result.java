import java.util.Scanner;
public class Studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks of subject1: ");
        int S1 = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        int S2 = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        int S3 = sc.nextInt();
        int totalmarks = S1 + S2 + S3;
        System.out.println("Total marks is: " + totalmarks);

        double avg=(S1 + S2 + S3) / 3.0;
        System.out.println("Average marks is: " + avg);

        if(avg>=40 && avg<=100)
        System.out.println("You are pass...");
        else
        System.out.println("You are Failed..");

        if(avg>=85 && avg<=100)
        System.out.println("You got Distinction.");
     }
}