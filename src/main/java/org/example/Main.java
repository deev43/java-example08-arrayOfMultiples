package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    arrayOfMultiples(7,5);

    }

    private static void arrayOfMultiples(int num, int length) {

        int[] createArray = new int[length];

        for (int i=0;i<createArray.length;i++){
            createArray[i]=num*(i+1);
        }
        for (int arrays: createArray){
        System.out.print(arrays+" ");
        }
    }
}