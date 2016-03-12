/**
 * Created by toryang on 16/3/12.
 */

import java.util.Arrays;

/**
 * 题目描述:
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
public class MoreThanHalfNum {
    public static int moreThanHalfNum_Solution(int [] array) {
        if(array.length == 0 || array == null){
            return 0;
        }
        Arrays.sort(array);

        int mid = array[array.length/2];
        int j = 0;
        for (int i : array){

            if (i == mid){
                j++;
            }
        }
        return j > array.length/2 ? mid : 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(moreThanHalfNum_Solution(array));
    }
}
