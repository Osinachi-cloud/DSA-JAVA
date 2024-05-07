package com.stitch.arrayStrucures;

import java.util.Arrays;

// basic crud operations with primitive data

public class ArrayStructure {
    int [] theArray = new int[50];
    int arrSize = 10;
    public void generateRandomArr(){
        int j = 0;
        for(int i = 0; i < arrSize; i++){
            theArray[i] = (int)(Math.random()* 10 )+ 10;
            j = i;
            System.out.println("| " + j + " | " + theArray[i] + " |");
            System.out.println("_________");
        }
    }

    public int getArrayIndex(int index){
        if(index < arrSize) {
            return theArray[index];
        } return 0;
    }

    public boolean doesArrContainVal(int val){
        boolean res = false;
        for(int i = 0; i < arrSize; i++){
            if(theArray[i] == val){
                res =  true;
            }
        }
        return res;
    }

    public void deleteIndex(int index){
        System.out.println( index + " + " + arrSize);
        if(index < arrSize){
            for(int i = index; i < arrSize  ; i++){
                    theArray[i] = theArray[i + 1];
            }
            arrSize--;
        }else {
            System.out.println(index + " does not exist");
        }
    }

    public void insertValue(int val){
            theArray[arrSize] = val;
        arrSize++;
    }

    public void linearSearch(int val){
        boolean isValExisting = false;
        String allIndexes = "";

        for(int i = 0; i < arrSize ; i++){
            if(theArray[i] == val){
                isValExisting = true;
                allIndexes = allIndexes + " " + i;
            }
        }

        System.out.println(allIndexes);

        if(!isValExisting){
            System.out.println("Does not exist");
        }

    }

    public static void main(String[] args) {
        ArrayStructure arrayStructure = new ArrayStructure();
        arrayStructure.generateRandomArr();
        System.out.println(arrayStructure.getArrayIndex(3));
        System.out.println(arrayStructure.doesArrContainVal(50));

        arrayStructure.deleteIndex(8);
        arrayStructure.generateRandomArr();
        System.out.println("new =================");
        arrayStructure.insertValue(50);
        arrayStructure.generateRandomArr();

        arrayStructure.linearSearch(19);
    }

}
