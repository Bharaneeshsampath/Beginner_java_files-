//package workstation;
import java.util.Scanner;
public class chocklate_sum {
    public static void main(String[]args){
        /*int ch2=2;
        int ch3=3;
        int ch5=5;*/
        Scanner mo = new Scanner(System.in);
        System.out.println("2rs choki\n3rs choki \n5rs choki");
        System.out.println("The price range of chochlate that you need: ");
        int ch=mo.nextInt();
        if(ch==2){
            int cc = 100 / ch;int chcount = cc; cc*=2;int rem=100-cc;
            System.out.println("on price of 2rs you can get "+chcount+" chocklates on price of rs100, with remaining amout of rs"+rem+"");

        }
        else if(ch==3){
            int cc = 100 / ch;int chcount = cc; cc*=3;int rem=100-cc;
            System.out.println("on price of 3rs you can get "+chcount+" chocklates on price of rs100, with remaining amout of rs"+rem+"");
        }
        else if(ch==5){
            int cc = 100 / ch;int chcount = cc; cc*=5;int rem=100-cc;
            System.out.println("on price of 5rs you can get "+chcount+" chocklates on price of rs100, with remaining amout of rs"+rem+"");
        }
        else{
            System.out.println("Your value is incoreect");
        }
        mo.close();                
    }    
}
//problem statement we have 100 rs and we enter into a candy store 
//there are three price varities of chochlates
//2rs,3rs,5rs chochlates are there
//a comes and thinks how many 2rs can be brouht from 100 rs and same
//scenrio for 3rs and 5rs chochlates
//how would you help the boy