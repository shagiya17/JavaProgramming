//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an adjective (description): ");
        String adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        String noun1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective2 = sc.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        String verb1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective3 = sc.nextLine();
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
    }
}
