/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.util.Arrays;

/**
 *
 * @author jac
 */
public class InsertionSort {
    
    public void InsertionSort()
    {
        
    }
    
    public void insertionSort()//traversal goes from left to right
    {
        int [] array={20,35,7,55,1,-22,12};
        for(int firstUnsortedIndex=1;firstUnsortedIndex<array.length;firstUnsortedIndex++)
        {
            int  newElement=array[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex; i>0 && array[i-1]  > newElement; i--)
            {
                array[i] = array[i-1];
                //System.out.println(i+"<<<inner loop>>>"+array[i]);
            }
            array[i] = newElement;
            System.out.println(firstUnsortedIndex+"<<<outer loop>>>"+array[i]);
        }
        System.out.println("Sorted>>>"+Arrays.toString(array)); 
        /*
        (array[i-1]  > newElement; i--)
        - this means that he loop will continue as long as the array[i-1] is greater than newElement (the correct insertion position) .The (--i) means we are traversing the sorted array from right to left               
        - Array is divided into sorted and unsorted partition
        - by default index 0 is on the sorted part and the rest is unsorted part
        - in-place algorith
        - O(n*n) time complexity - quadratic
        - stable algorith
        */
    }
    
    
    
    
    
    public void sortArrays(int []array,int i,int j )//traversal goes from rigt to left
    {
        if(i==j)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;        
    }
    
}
