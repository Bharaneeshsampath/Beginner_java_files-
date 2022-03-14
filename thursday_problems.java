//package workstation;

import java.util.Scanner;

public class thursday_problems {
    public static void main(String[]args){
        Scanner mo = new Scanner(System.in);
        int n = mo.nextInt();
        for (int i=1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int j = i; j<=n;j++){
                System.out.print("* ");

            }
            System.out.println();
            mo.close();

        }
    }
    
}
