// Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.

// This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.

// Sample Input and Output:

// Enter the number of elements in the array 3

// Enter the elements in the array

// 20 90 4

// Enter the index of the array element you want to access 2

// The array element at index 2 = 4

// The array element successfully accessed

import java.util.*;
class assignment2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int input;
        for(int i=0;i<n;i++){
            input=sc.nextInt();
            arr[i]=input;
        }
        System.out.print("Enter the index of the array element you want to access: ");
        input=sc.nextInt();
        try{
            System.out.println(arr[input]);
            System.out.println("The array element successfully accessed");
    }
        catch(IndexOutOfBoundsException obj){
            System.out.println(obj);
        }


    }
}