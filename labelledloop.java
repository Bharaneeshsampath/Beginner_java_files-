//package workstation;

public class labelledloop {
    public static void main (String[]args){
        int v =4;
        l1:
        for (int i=1;i<v;i++){
            for (int j=1;j<v;j++){
                if (i==2&&j==2){
                    break l1;

                }
                System.out.println(i+""+j);
            }

        }
    }
    
}
