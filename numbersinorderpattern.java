package workstation;

import java.util.Scanner;

public class numbersinorderpattern {
    public static void main(String[]args){
    Scanner mo =new Scanner(System.in);
    int c=mo.nextInt();
    int x=1;
    for(int i =1;i<=c;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(x++);

        }
        System.out.println();
        

    }
    mo.close();
}
}
/*
package workstation;

import java.util.Scanner;

public class numbersinorderpattern{
    public static void main(System[]args){
        Scanner mo = new Scanner(System.in);
        int sc = mo.nextInt();
        for (int i=1;i<=sc;i++){
            for (int j =i;j<=sc){
                for()

            }

        }
    }
}*/