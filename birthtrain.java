//package workstation;
import java.util.Scanner;

public class birthtrain {
    public static void main(String[]args){
        Scanner mo = new Scanner(System.in);
        System.out.println("Enter your seat number");
        int so = mo.nextInt();
        if (0<so&&so<73){
            if (so%8==1 || so%8==4){
                System.out.println("you have selected lower birth");
    
            }
            else if(so%8==2 || so%8==5){
                System.out.println("you have slected middle birth");
                
    
            }
            else if (so%8==3 || so%8==6){
                System.out.println("you have selected Upper birth");
    
            }
            else if (so%8==7){
                System.out.println("you have selected side lower birth");
    
            }
            else if (so%8==0){
                System.out.println("you have selected side upper birth");

        }

        }
        else {
            System.out.println("You have entered invaid seat");
        }
        mo.close();
        
    }
    
}
