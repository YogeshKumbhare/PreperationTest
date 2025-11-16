package company;
/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */


import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {



// def main(str1, str2):
//     m = len(str1)
//     n = len(str2)

//     j = 0 # Index of str1
//     i = 0 # Index of str2

//     while j < m and i < n:
//         if str1[j] == str2[i]:
//             j = j+1
//         i = i + 1

//     return j == m

// # Driver Program
// str2 = str(input())
// N = int(input())

// for i in range(N):
//     str1 = str(input())
//     if main(str1, str2):
//         print("POSITIVE")
//     else:

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        String[] array = new String[10];

        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=sc.nextLine();

        }
        validate(n,array);

    }

    private static void validate(int n, String[] array) {
        System.out.println( array.length);
        System.out.println("print validate method");
    }
}



