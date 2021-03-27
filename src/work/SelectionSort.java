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
public class SelectionSort {
    
    public void SelectionSort()
    {
        
    }
    
    public void selectionSort()//traversal goes from rigt to left
    {
        int [] array={20,35,7,55,1,-22,12};
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex>0;lastUnsortedIndex--)
        {            
            int largest=0;
            for(int i=1;i<=lastUnsortedIndex;i++)
            {
                if(array[i] > array[largest])
                {
                    largest=i;
                }
            }
            sortArrays(array,largest,lastUnsortedIndex);
        }
        System.out.println("Sorted>>>"+Arrays.toString(array)); 
        /*
        - in-place algorith
        - O(n*n) time complexity-quadratic
        - does not require much swapping as bubble sort
        - unstable algorith
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
