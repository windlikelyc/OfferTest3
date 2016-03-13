/**
 * Created by toryang on 16/3/13.
 */

/**
 * 题目描述:
 * 统计一个数字在排序数组中出现的次数。
 */
public class GetKCount {

    public int GetNumberOfK(int [] array , int k) {
        if (array.length == 0){
            return 0;
        }
        int j = 0;
        for (int i : array){
            if (i == k ){
                j++;
            }
        }

        return j;
    }

    /**
     * 解题思路:使用二分法;
     * @param array
     * @param k
     * @return
     */
    public int getCountOfK(int[] array, int k){
        if (array.length == 0){
            return 0;
        }
        int first = getFirstK(array,k,0,array.length-1);
        int last = getLastK(array,k,0,array.length-1);
        return last - first + 1;
    }

    public int getFirstK (int[] array,int k,int start, int end){
        if (start > end) {
            return -1;
        }

        int middIndex = (start + end) / 2;
        int middData = array[middIndex];

        if (middData == k) {
            if ((middIndex > 0 && array[middIndex - 1] != k) || middIndex == 0) {
                return middIndex;
            } else {
                end = middIndex - 1;
            }
        } else if (middData > k) {
            end = middIndex - 1;
        } else {
            start = middIndex + 1;
        }

        return getFirstK(array, k, start, end);
    }

    public int getLastK (int[] array,int k,int start, int end){
        if (start > end) {
            return -1;
        }

        int middIndex = (start + end) / 2;
        int middData = array[middIndex];

        if (middData == k) {
            if ((middIndex < array.length - 1 && array[middIndex + 1] != k) || middIndex == end) {
                return middIndex;
            } else {
                start = middIndex + 1;
            }
        } else if (middData > k) {
            end = middIndex - 1;
        } else {
            start = middIndex + 1;
        }

        return getLastK(array, k, start, end);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4,5};
        System.out.println(new GetKCount().GetNumberOfK(array,3));
    }
}
