import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by toryang on 16/3/12.
 */

/**
 * 题目描述:
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 结果请按字母顺序输出。
 *
 */
public class Permutation {

    public static ArrayList<String> permutation(String str){
        if (str == null){
            return null;
        }

        ArrayList<String> list = new ArrayList<String>();
        list = permutation(list,str.toCharArray(),0,str.length()-1);
        return list;
    }

    public static ArrayList<String> permutation(ArrayList<String> list, char[] str, int from,int to){
        if (from == to){
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<=to;i++){
                sb.append(str[i]);
            }
            list.add(sb.toString());
        }else {
            for (int j = from;j<=to;j++){
                swap(str,j,from);
                permutation(list,str,from+1,to);
                swap(str,j,from);
            }
        }
        return list;
    }
    public static void swap(char[] str,int i,int j){
        char temp = 0;
        temp  = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        for (String str : permutation("abc"))
        System.out.println(str);
    }
}
