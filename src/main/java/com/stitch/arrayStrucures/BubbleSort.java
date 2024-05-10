package com.stitch.arrayStrucures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    int [] theArray = new int[50];

    int arraySize = 10;


    public void generateRandomValueArray(){

        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int) (Math.random() * 10 ) + 10;

//            System.out.print( " | " + i + " " + theArray[i]);
//            System.out.print( " | " + theArray[i] + " " );

        }
//        System.out.println(Arrays.toString(theArray));
    }

    public void sortArrayLinearSort(){
        for(int i = 0; i < arraySize; i++){
            for(int j = i + 1 ; j < arraySize; j++){
                if(theArray[i] > theArray[j]){
                    swapIndex(i, j);
                }
            }
        }
        System.out.println(Arrays.toString(theArray));
    }

    public void sortArrayBubbleSortAsc(){
        for(int i = arraySize - 1; i > 0; i--){
            for(int j = 0; j < arraySize - 1; j++){
                if(theArray[j] > theArray[j + 1]){
                    swapIndex(j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(theArray));
    }

    public void sortArrayBubbleSortDesc(){
        for(int i = arraySize - 1; i > 0; i--){
            for(int j = 0; j < arraySize - 1; j++){
                if(theArray[j] < theArray[j + 1]){
                    swapIndex(j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(theArray));
    }

    public void swapIndex(int indexA, int indexB){
        int temp = theArray[indexA];
        theArray[indexA] = theArray[indexB];
        theArray[indexB] = temp;
    }

    public void binarySearch(int val){
        int startIndex = 0;
        int endIndex = arraySize - 1;

        while(startIndex <= endIndex){
            int middleIndex = (int) (startIndex + endIndex) / 2;

            if(theArray[middleIndex] > val){
                endIndex = middleIndex - 1;
            }else if(theArray[middleIndex] < val){
                startIndex = middleIndex + 1;
            }else {
                System.out.println(" the value is : " + theArray[middleIndex] + " with index of " + middleIndex);
                return;
            }
        }
        System.out.println("value not found");
    }

    public void selectionSort(){
        for (int i = 0; i < arraySize; i++){
            int minimumIndex = i;

            for(int j = i; j < arraySize; j++){
                if(theArray[minimumIndex] < theArray[j]){
                    minimumIndex = j;
                }
            }
            swapIndex(i, minimumIndex);
        }
        System.out.println(Arrays.toString(theArray));

    }

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.generateRandomValueArray();
        bubbleSort.sortArrayLinearSort();
        bubbleSort.sortArrayBubbleSortAsc();
        bubbleSort.sortArrayBubbleSortDesc();
        bubbleSort.binarySearch(14);
        bubbleSort.selectionSort();

    }
}
