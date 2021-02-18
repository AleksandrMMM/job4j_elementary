package ru.job4j.array;

/* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] <= min){
                min = array[index];
            }
        }
        return min;
    }
}
