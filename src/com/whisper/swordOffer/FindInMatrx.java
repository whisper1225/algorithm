package com.whisper.swordOffer;

/**
 * Created by phoenix on 2016/3/25.
 * 剑指offer 第二章 第三题
 */
public class FindInMatrx {

    //从指定二维数组中查找一个给定的数，该二维数组满足行递增，列递增
    public boolean findNumInMatrix(int [][] array, int num) throws Exception {
        if (array == null) {
            throw new Exception("array is null and input correct array again");
        }
        int columnMark = array[0].length - 1;
        int rowMark = 0;
        while (columnMark >= 0 && rowMark < array.length){
            if (array[rowMark][columnMark] == num){
                System.out.println("rowMark:" + rowMark +"\ncolumnMark:" + columnMark);
                return true;
            }else if (array[rowMark][columnMark] < num){
                rowMark++;
            }else {
                columnMark--;
            }
        }
        return false;

    }

    //测试用例
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3,4},
                {2,4,6,8},
                {4,5,9,12}};
        FindInMatrx findInMatrx = new FindInMatrx();
        try {
            boolean isExist =  findInMatrx.findNumInMatrix(array,2);
            if (!isExist) {
                System.out.println("所找的元素不在其二维数组中");
            }else {
                System.out.println("该元素在二维数组中");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/**
 * 正如剑指offer所言这题最为关键的地方就是对行列均递增数列的理解。
 * 这类题目大致的思路都是从某个值开始，用该值结合递增的特点，最大程度的缩减查找范围。
 * 针对本题，从右上角和左下角都能达到这一目的。
 **/