//package workstation;
import java.util.Scanner;
    public class triangle {public static void main(String[]args){
        //int in1=5;
        Scanner mo=new Scanner(System.in);
        int in1=mo.nextInt();
        int c=0;
        while(in1>0){
            c+=1;
            int b=c;
            while (b>0) {
                System.out.print("*");
                b-=1;
                }
            System.out.println("");
            in1=in1-1;
            }
        mo.close();
    }
}
