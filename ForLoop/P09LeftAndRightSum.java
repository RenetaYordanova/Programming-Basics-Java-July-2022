package ForLoop;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rightsum=0;
        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightsum= rightsum+currentNum;
        }

        int leftsum=0;
        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftsum= leftsum+currentNum;
        }

        if(leftsum==rightsum){
            System.out.printf(" Yes, sum = %d", leftsum);
        } else {
            int diff = Math.abs(leftsum-rightsum);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
