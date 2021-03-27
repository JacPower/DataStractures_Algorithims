/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author jac
 */
public class BinarySearch {
    
public void BinarySearch()
{

}

public void binarySearch(int arr[], int first, int last, int key)
{  
    int mid = (first + last)/2;  
    System.out.println("mid==="+mid);
    while( first <= last )
    {  
        System.out.println("first==="+first+"===last==="+last);
        if( arr[mid] < key )
        {  
          first = mid + 1;     
        }
        else if ( arr[mid] == key )
        {  
          System.out.println("Element is found at index: " + mid);  
          break;  
        }
        else
        {  
           last = mid - 1;  
        }  
        System.out.println("<<<<<first==="+first+"===last==="+last);
        mid = (first + last)/2;  
        System.out.println(mid+">>>>>first==="+first+"===last==="+last);
    }  
    if ( first > last ){  
       System.out.println("Element is not found!");  
    }  
}  


 public static void main(String args[])
 {  
    
    int arr[] = {10,20,30,40,50,60,70,80};  
    int key = 30;  
    int last=arr.length-1;  
     System.out.println("last==="+last);
    new BinarySearch().binarySearch(arr,0,last,key);     
 }  
    
}
