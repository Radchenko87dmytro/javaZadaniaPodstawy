package javaZadaniaPodstawy;

public class Task6 {
    public static void main(String[] args) {
//        int a = 5;
//        int result;

//        for(int i = 1; i<5; i++) {
//            int result = a*i;
//            System.out.println(result);
//        }


        printMultiplicationTable();
        System.out.println("");
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }

    }
}