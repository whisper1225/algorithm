package com.whisper.swordOffer;

/**
 * Created by phoenix on 2016/3/27.
 * 二分查找乃是基础的基础，江湖传言，如果这个都不能信手拈来，面试官直接在心里会判死刑
 */
public class BinarySearch {

    /**
     * @param array
     * @param start
     * @param end
     * @param key
     * @return -1 not found, if return value >= 0 it means key's index in array
     * @throws Exception
     */
    public int searchBinary(int[] array, int start, int end, int key) throws Exception {
        int middle = (start + end) / 2;
        if (start > end) {
           return -1;
        } else if (array[middle] == key) {
            return middle;
        } else if (array[middle] > key) { //在左边
            return searchBinary(array, start, middle - 1, key);
        } else {
            return searchBinary(array, middle + 1, end, key);
        }
    }

    /*开始有点懵逼，竟然犯了这么愚蠢的错误，哎留下 反思，写算法后脑要清晰，想好步骤吗，想好边界条件，标志量的变化过程*/
/*    public int searchBinary(int[] array, int start, int end, int key) throws Exception {
        int middle = (start + end) / 2;
        if (start > end) {
            throw new Exception("查询失败，请检查");
        } else if (array[middle] == key) {
            return middle;
        } else if (array[middle] > key) { //在左边
            searchBinary(array, start, middle - 1, key);
        } else {
            searchBinary(array, middle + 1, end, key);
        }
        return -1;
    }*/


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 5, 6,7}; //在排序数组中出现相同的值的情况下，看在不断取中值的过程中，哪个位置的值会会先被分配middle，那么该值就会被筛选出来
        BinarySearch binarySearch = new BinarySearch();
        try {
            int index = binarySearch.searchBinary(array, 0, array.length - 1, 3);
            System.out.println(index);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
