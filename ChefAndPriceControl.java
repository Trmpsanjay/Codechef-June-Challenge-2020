/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    
	    for(int i=0;i<testCases;i++){
	        int totalIncome =0;
	        int totalIncomeCap = 0;
	        int n = sc.nextInt(); // taking n
	        // creating array
	        int arr[] = new int[n];
	        // taking k
	        int k = sc.nextInt();
	        // getting prices
	        for(int j=0;j<n;j++){
	            arr[j] = sc.nextInt();
	        }
	        // calculating total prices without capping
	         for(int j=0;j<n;j++){
	                totalIncome = totalIncome + arr[j];
	                
	            }
	        for(int j=0;j<n;j++){
	            if(arr[j]>k){
	                totalIncomeCap = totalIncomeCap + k;
	                
	            }
	            else
	                totalIncomeCap = totalIncomeCap + arr[j];
	        }
	         int loss = totalIncome - totalIncomeCap;
	        System.out.println(loss);
	    }
	    
	   
		// your code goes here
	}
}
