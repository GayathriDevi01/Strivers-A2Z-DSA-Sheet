//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
       for(int i=1;i<=2*n;i++){
            
            int space=n-i,stars=i;
            if(i>n){
                space=i-n-1;
                stars=2*n+1-i;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
