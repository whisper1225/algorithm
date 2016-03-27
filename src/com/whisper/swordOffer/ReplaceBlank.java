package com.whisper.swordOffer;

/**
 * Created by phoenix on 2016/3/27.
 * 剑指offer 02-题4
 * 书上以c的题目是字符串，在java里如果是String，处理时还是需要将其转换为char []
 * 这个题目第一想法是循环 碰到空格 空格位置后面的所有元素向后移动两格，从后往前也是这个效果。这种时间复杂度是n^2.
 * 很明显这种有大量的元素在重复移动，但是对于这种情况来说，我们可以以扫描一遍的代价，来得知所有元素的最终位置。
 * 这种思路下，如果从左往右 还是有大量元素重复移动，如果从后往前，就可以省略重复移动，直接一次到位将元素移动到最终位置
 * ## 在写算法的时候犯了一个错误，在纸上画了一个图，
 * ![字符替换算法示意图](http://7xqbxa.com1.z0.glb.clouddn.com/16-3-27/73176518.jpg)
 * 给了六个字符串，在概念中将这个有效数组的length写成chars.length
 * 这个值其实是100，所以后来为算法添加了一个参数 realLength。标志我们的有效字符串长度。
 */
public class ReplaceBlank {

    /**************   算法开始      ******************/
    //以指定字符串替换所有空字符
    public void replace(char[] chars,int realLength) {
        int newLength = realLength + countBlankChar(chars)*2;
        int endIndex = newLength -1;
        for (int i = (realLength -1); i >= 0 ; i--) {
            if(chars[i] == ' '){
                chars[endIndex] = '0';
                chars[endIndex-1] = '2';
                chars[endIndex -2] = '%';
                endIndex  = endIndex -3;
            }else {
                chars[endIndex] = chars[i];
                endIndex--;
            }
        }
    }
    //统计字符数组中空字符串的长度
    private int countBlankChar(char[] chars){
        int blankCharCount = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
             blankCharCount++;
            }
        }
        return blankCharCount;
    }
    /**************   算法结束      ******************/

    //测试主程序
    public static void main(String[] args) {
        //构造测试数组
        char[] chars = new char[100];
        chars[0] = ' ';
        chars[1] = 'a';
        chars[2] = ' ';
        chars[3] = 'c';
        chars[4] = 'b';
        chars[5] = ' ';
        int realLengh = 6;

        ReplaceBlank replaceBlank = new ReplaceBlank();
        replaceBlank.replace(chars,6);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
