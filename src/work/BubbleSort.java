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
public class BubbleSort {
    
    public void BubbleSort()
    {
        
    }
    
    public void bubbleSort()//traversal goes from rigt to left
    {
        int [] array={20,35,7,55,1,-22,12};
        System.out.println("len==="+(array.length-1));
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            for(int i=0;i<lastUnsortedIndex;i++)
            {
                if(array[i] > array[i+1])
                {
                    sortArrays(array,i,i+1);
                }
            }
        }
        System.out.println("Sorted>>>"+Arrays.toString(array)); 
        /*
        - loop inside a loop inside a loop uses quadratic time complexity[ O(n*n) ]
        - One of the least efficient algorithms
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
