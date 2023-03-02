import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        double isSenior = 0.15;
        double isDog;
        isDog = 0.20;
        double isStudent;
        isStudent = 0.10;
        double other;
        other = 3.20;
        System.out.println();



        // In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.

        int Fiction = 1;
        int nonFiction = 0;



    public static void checkIfDiscount(double isSenior, double isStudent, double isDog) {

        if (isSenior) {
            System.out.println("Discount of 15%");
        } else if (isDog) {
            System.out.println("Discount of 20%");
        } else if (isStudent) {
            System.out.println("Discount of 20%");
        } else {
            System.out.println("Pay full prize of 3.20 €");
        }


    }
    public static String checkIfBookDiscount (int Fiction, int nonFiction) {
        String discount = "Discount of 10%!";
        String noDiscount = "no discount";

        if (Fiction > 0 && nonFiction >= 2) {
            return discount;
        } else {
            return noDiscount;
        }

    }
}

    }

