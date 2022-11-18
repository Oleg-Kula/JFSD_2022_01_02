package com.gmail.kulacholeg.task_01;

/**
  Contains three methods witch are different ways to complete the task:
  - {@link #arrayCalculate(int[])} - uses the "classic" way with arrays. No Collections. No Streams.
  - {@link #collectionsMethodCalculate(int[])}  - uses Collections
  - {@link #streamMethodCalculate(int[])} - uses Stream API
 */

import java.util.*;
import java.util.stream.Collectors;

public class IntegerArrayCalculate {

    public int[] arrayCalculate(int[] array){
        //check array is null
        //if 'true' - return new empty array
        if (array == null){
            System.out.println("Array is null");
            return new int[0];
        }
        //calculate the capacity of new array
        int resultArrayCapacity = 0;
        for (int value : array){
            if (value >= 0) resultArrayCapacity++;
        }
        //create new array and fill it with numbers
        int resultIndex = 0;
        int[] result = new int[resultArrayCapacity];
        for (int value : array) {
            if (value >= 0) {
                result[resultIndex] = value;
                resultIndex++;
            }
        }
        //sort new array
        for(int i = 0; i < result.length; i++){
            for(int j = i + 1; j <result.length; j++){
                int temp = 0;
                if (result[i] < result[j]){
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public List<Integer> collectionsMethodCalculate(int[] array){
        List<Integer> result = new ArrayList<>();
        //check array is null. If "true" - return empty List
        if(array == null){
            System.out.println("Array is null");
            return result;
        };
        //add numbers to List
        for (int value : array) {
            if (value >= 0) result.add(value);
        };
        //sort List
        result.sort(Collections.reverseOrder());

        return result;
    }

    public List<Integer> streamMethodCalculate(int[] array){
        //check array is null. If "false" - return sorted List
        if(array != null)
            return Arrays.stream(array)
                    .filter(x -> x >= 0)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        //if array is null return empty List
        System.out.println("Array is null");
        return new ArrayList<>();
    }
}
