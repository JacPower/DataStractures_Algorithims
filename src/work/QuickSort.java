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
public class QuickSort {
    
    public QuickSort()
    {
        
    }
    
    public void processByMiddleElement()
    {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
    
    
    public void processByRightMostElement()
    {
        int[] arr = {7,8,9,4, 5, 1, 2, 6, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    
    //int[] arr = {7,8,9,4, 5, 1, 2, 6, 3};
    public static void quickSort(int[] arr, int start, int end){
 
        int pivot = partition(arr, start, end);
 
        if(pivot-1>start) {
            quickSort(arr, start, pivot - 1);
        }
        if(pivot+1<end) {
            quickSort(arr, pivot + 1, end);
        }
    }
    //int[] arr = {7,8,9,4, 5, 1, 2, 6, 3};
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        System.out.println("Init start==="+start+"===pivot==="+pivot);
        for(int i=start; i<end; i++)
        {
            int index=i;int val=arr[i];
            //System.out.println(index+"<<<index i arr[i]>>"+val+"<<<pivot>>>"+pivot);
            
            if(arr[i]<pivot)
            {
                //System.out.println(val+"<<<arr[i] less than pivot>>>"+pivot);
                //System.out.println(start+"<<<get hold of start value>>"+arr[start]);
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
            System.out.println("==start==="+start);
        }
 
        System.out.println("fin arr[start]=="+arr[start]+"===Pivot==="+pivot+"===start==="+start);
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        System.out.println("==return start==="+start);
        return start;
    }
    
    
    
    
    
    
    
   public static void quickSort(Integer[] arr, int start, int end) 
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (start >= end){
            return;
        }
 
        //System.out.println("start===="+start+"===end==="+end);
        //Get the pivot element from the middle of the list
        int middle = start + (end - start) / 2;
        int pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = start, j = end;
        while (i <= j) 
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot) 
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) 
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping 
            //After swapping move the iterator on both lists
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        System.out.println("start==="+start+"===j==="+j);
        if (start < j){
            quickSort(arr, start, j);
        }
        System.out.println("end==="+end+"===i==="+i);
        if (end > i){
            quickSort(arr, i, end);
        }
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
