package FirstStepsIn;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double allSqM=Double.parseDouble(scanner.nextLine());
        double amount= allSqM * 7.61;
        double discount= amount*0.18;

        double sumWithoutdiscount=amount-discount;

        System.out.printf( "The final price is: %.2f lv.%n" , sumWithoutdiscount );
        System.out.printf( "The discount is: %.2f lv." , discount);

    }
}
