package com.kyle.learn.pattern.adapter.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:14:56
 */
public class OperationAdapter implements ScopeOperation {

    private QuickSort sort = new QuickSort();
    private BinarySearch search = new BinarySearch();

    @Override
    public int[] sort(int[] array) {
        return sort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return search.binarySearch(array,key);
    }
}
