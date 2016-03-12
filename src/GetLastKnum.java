import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by toryang on 16/3/12.
 */
public class GetLastKnum {

    /**
     * 先使用快排，排序完成后，取前k个数；
     * @param input
     * @param k
     * @return
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length == 0){
            return list;
        }
        Arrays.sort(input);
        for (int i=0 ;i<k ;i++){
            list.add(input[i]);
        }

        return list;
    }

    /**
     *
     * 第二种方法：
     * 1、将数组前k个数放到一个copy到一个数组int[] temp中；
     * 2、将temp数组快排；
     * 3、取从原数组第k个元素开始，逐个与temp数组中最大的元素temp[k－1]进行比较；
     * 4、如果temp[k-1]比原数组小，则原数组取下一个，如果temp[k-1],大于原数组中元素，则两个数进行交换，temp数组快排；
     * 5、最后输出temp数组；
     * @param input
     * @param k
     * @return
     */
    public static ArrayList<Integer> getLastKnum(int[] input,int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] temp = new int[k];
        temp = Arrays.copyOfRange(input,0,k);
        Arrays.sort(temp);
        for (int i = k ;i<input.length;i++){
            if (temp[k-1] > input[i]){
                int a = temp[k-1];
                temp[k-1] = input[i];
                input[i] = a;
                Arrays.sort(temp);
            }
        }
        for (int i : temp){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int [] array= {4,5,1,6,2,7,3,8};
//        for (int i : GetLeastNumbers_Solution(array,4)){
//            System.out.println(i);
//        }
        for (int i : getLastKnum(array,4)){
            System.out.println(i);
        }
    }
}
