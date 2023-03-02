import java.util.Scanner;

public class GradingTable {

    public static void main(String[] args) {
//
//        System.out.println(grades(1));
//        System.out.println(grades(2));
//        System.out.println(grades(3));
//        System.out.println(grades(4));
//        System.out.println(grades(5));
//
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the points");
        int grade = scanner.nextInt();

        getGrade(grade);

    }
        public static void getGrade (int grade) {
            if (grade >= 90) {
                System.out.println("outstanding");
            } else if (89 > grade && grade>78) {
                System.out.println("excellent");
            } else if (77 > grade && grade > 65) {
                System.out.println("acceptable");
            } else if (64 > grade && grade > 51) {
                System.out.println("passing");
            } else if (grade<=50) {
                System.out.println("fail");
            }

        }

    }













