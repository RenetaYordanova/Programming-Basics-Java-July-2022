package ConditionalStatements;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumb= Integer.parseInt(scanner.nextLine());
        int secondNumb= Integer.parseInt(scanner.nextLine());

        if(firstNumb>secondNumb){
            System.out.println(firstNumb);
        } else{
            System.out.println(secondNumb);
        }

    }
}
