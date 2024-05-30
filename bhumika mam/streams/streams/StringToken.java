 import java.util.StringTokenizer;  
 
 public class StringToken{  
     public static void main(String args[]){  
       StringTokenizer st = new StringTokenizer("Hello All in MCAII", " ");  
         while (st.hasMoreTokens()) {  
             System.out.println(st.nextToken());  
         }  
       }  
    }  