//Given a string S, check if it is palindrome or not.
//Code
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
            // code here
        int i = 0;
        int j = S.length()-1;
        return (ispal(S, i, j)) ? 1:0 ;
    }
    boolean ispal(String s, int i, int j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        if(i>=j){
            return true;
        }
        return ispal(s, i+1, j-1);
    }
};
