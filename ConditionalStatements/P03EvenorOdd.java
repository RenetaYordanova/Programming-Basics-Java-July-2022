package ConditionalStatements;

import java.util.Scanner;

public class P03EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isEven =num%2==0;
        if(isEven){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
