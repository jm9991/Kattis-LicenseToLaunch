import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        int index = 0;
        int min = Integer.MAX_VALUE;
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int num = Integer.parseInt(br.readLine()); //Length of Array
        String s= br.readLine(); //Input the number seperated by space
        int[] arr= new int[num];
        String[] s1 = s.split(" ");
        for( i=0;i<num;i++)
        {  
            
            arr[i]=Integer.parseInt(s1[i]);
            
            if (arr[i] < min) {
                   min = arr[i];
                   index = i;
                  // System.out.println(index);
               }
            
        }
        
        
            
        System.out.println(index);

    }
}

