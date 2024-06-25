package _06_02.before;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        int yob = 2024 - age;
        System.out.print(name + " were you born in " + yob + "? Type 1 for yes or 0 for no: ");
        int answer = scan.nextInt();
        if (answer == 0){
             yob = 2023 - age;
            System.out.print(name + " were you born in " + yob + "? Type 1 for yes or 0 for no: ");
            answer = scan.nextInt();
        }else{
            System.out.println("I knew it!");
        }

        



    }

}
