/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import static work.MergeSort.arr;

/**
 *
 * @author jac
 */
public class Test {
    
    int  arr[]={100,20,15,30,5,75,40};
    
    public void mergeSort(int start,int end)
    {
        if(end-start <2)
        {
            return;
        }
         
        int mid=((end+start)/2)+1;
        
        mergeSort(start,mid);
        mergeSort(start,mid);
        merge(start,mid,end);
    }
    
    public void merge(int start,int mid,int end)
    {
        int []tempArr=new int[arr.length];
        int tempIndex=start;
        int startIndex=start;
        int midIndex=mid+1;
        
        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                tempArr[tempIndex++]=arr[startIndex++];
            }
            else
            {
                tempArr[tempIndex++]=arr[midIndex++];
            }
        }
        
        // Copy remaining elements
        while(startIndex<=mid)
        {
            tempArr[tempIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            tempArr[tempIndex++]=arr[midIndex++];
        }
 
        // Copy tempArray to actual array after sorting 
        for (int i = start; i <=end; i++) {
            arr[i]=tempArr[i];
        }
    }
    
}
