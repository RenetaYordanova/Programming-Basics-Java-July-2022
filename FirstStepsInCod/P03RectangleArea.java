package FirstStepsIn;

import java.util.Scanner;

public class P03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int firstnum = Integer.parseInt(scanner.nextLine());
        int secondnum = Integer.parseInt(scanner.nextLine());

        int area = firstnum * secondnum;

        System.out.println(area);


    }
}
