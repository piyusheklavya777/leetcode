// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int a[])
    {
       int[] lis = new int[n];
       
       Arrays.fill(lis, 1);
       
       int maxLength = 0;
       
       for (int i = 1; i < n; i++) {
           
           for (int j = 0; j < i; j++) {
               
               if (a[j] >= a[i]) continue;
               
               lis[i] = Math.max(lis[i], lis[j] + 1);
               
           }
           
           maxLength = Math.max(maxLength, lis[i]);
           
       }
       
    //   System.out.println(Arrays.toString(lis));
       
       return maxLength;
    }
} 