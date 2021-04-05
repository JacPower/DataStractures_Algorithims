/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author jac
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //new InsertionSort().insertionSort();
        //new MergeSort().mergeSort(0,6);
        //int  arr[]={10,20,15,30,5,75,40};
        new QuickSort().processByRightMostElement();
        //new QuickSort().processByMiddleElement();
    }
   
    
    
}
