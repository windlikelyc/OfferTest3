/**
 * Created by toryang on 16/3/12.
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * 题目描述:
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMin {
    public static String PrintMinNum(int[] number){
        String[] num = new String[number.length];
        for (int i=0;i<number.length;i++){
            num[i] = String.valueOf(number[i]);
        }

        Arrays.sort(num, 0, num.length, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : num)
            sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] num = {3,32,321};
        System.out.println(PrintMinNum(num));
    }
}
