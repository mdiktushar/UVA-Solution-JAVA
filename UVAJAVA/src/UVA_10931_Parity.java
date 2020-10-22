
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDTus
 */

//Change the Class name in to "Main" before submiting the code
public class UVA_10931_Parity {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            long n = input.nextLong();
            if(n==0)
                break;
            String s = Long.toBinaryString(n);
            //System.out.println(s);
            
            int num = 0;
        
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1')
                    num++;
            }
            System.out.println("The parity of "+s+" is "+num+" (mod 2).");
        }
        
        
    }
}
