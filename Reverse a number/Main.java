import java.util.Scanner;

public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     while(n != 0){
         
         int lastdigit = n%10;
         System.out.println(lastdigit);
         
         n = n/10;
     }
    
    }
   }