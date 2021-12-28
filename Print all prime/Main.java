import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int times = low; times <= high; times++){
            
             int factor= 0;
            for( int i = 2; i*i <= times; i++ ){
                
                if(times%i ==0){
                    factor++;
            
                }
            }
             if (factor ==  0  ){
                 System.out.println(times);
             }
        }
    }
}