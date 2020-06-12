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
	    
	    for(int k=0;k<testCases;k++){
	        String str = sc.next();
	        int pair =0;
	        for(int i=0;i<str.length()-1;i++){
	            if(str.charAt(i)=='x'){
	                if(str.charAt(i+1)=='y'){
	                    pair++;
	                    i++;
	                }
	            }
	            else if(str.charAt(i)=='y'){
	                if(str.charAt(i+1)=='x'){
	                    pair++;
	                    i++;
	                }
	            }
	            else{
	                //nothing i will automatically increment
	            }
	        }
	        
	        // now for last Index
	        if((str.length()-3=='x' && str.length()-2=='y') || (str.length()-3=='y' && str.length()-2=='x')){
	            // nothing to do because 2nd last is allreafy in pair
	        }
	        else if((str.length()-2=='x' && str.length()-1=='y') || (str.length()-2=='y' && str.length()-1=='x')){
	            pair++;
	        }
	        else{
	            // nothing
	        }
	        System.out.println(pair);
	    }
		// your code goes here
	}
}
