/**
 * Created by toryang on 16/3/13.
 */

/**
 * 题目描述:
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。
 */
public class InversePairsTest {
    /**
     * 冒泡排序思想;
     * @param array
     * @return
     */
    public static int InversePairs(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int count = 0;
        for (int i = 0;i<array.length-1 ; i++){
            for(int j= i+1;j<array.length;j++){
                if (array[i] > array[j]){
                    count ++ ;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,7,6,5};
        System.out.println(InversePairs(array));
    }
}
