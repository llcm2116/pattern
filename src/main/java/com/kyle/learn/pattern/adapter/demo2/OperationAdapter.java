package com.kyle.learn.pattern.adapter.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:14:56
 */
public class OperationAdapter extends BinarySearch implements ScopeOperation{

    @Override
    public int[] sort(int[] array) {
        return quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch(array,key);
    }
}
