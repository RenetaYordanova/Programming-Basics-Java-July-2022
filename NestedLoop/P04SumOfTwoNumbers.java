package NestedLoop;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int first =Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int magic =Integer.parseInt(scanner.nextLine());

        int count=0;
        boolean isFound=false;
        for (int i = first; i <=second ; i++) {
            for (int j = first; j <=second ; j++) {
                count++;
                int sum=i+j;
                if(sum==magic){
                    isFound=true;

                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magic);
                    break;

                }
                
            }
            if(isFound){
                break;
            }
            
        }
        if(!isFound){
            System.out.printf("%d combinations - neither equals %d%n",count,magic);
        }
    }
}
