import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int digit = 0;
     
     
     int temp = n;
     while(temp!= 0){
         temp = temp/10;
         digit++;
         
     }
     
     
     k = k% digit;
     if(k <0 ){
         k = k+ digit;
     }
     
     
     int pow = (int)Math.pow(10,k);
     
     int left = n/pow;
     int right = n%pow;
     
     int mult = (int)Math.pow(10,digit - k);
     
     int ans = right * mult + left;
     System.out.println(ans);
     
     
    }
   }