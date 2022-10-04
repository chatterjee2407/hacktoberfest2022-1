package victhupy;

import javax.xml.bind.PrintConversionEvent;

class InsertionSort{

    public static void sort(int [] arrayToSort){
        for(int i = 0; i < arrayToSort.length; i++){
            int k = i;
            
            while(k>0 && arrayToSort[k-1] > arrayToSort[k]){
                int key = arrayToSort[k];
                arrayToSort[k] = arrayToSort[k-1];
                arrayToSort[k-1] = key;
                k = k-1;
            }
        }
    }


    public static void main(String[] args) {
        int array [] = {20, 30, 5, 10, 1, 4};

        sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

}