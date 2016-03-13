import java.util.HashMap;

/**
 * Created by toryang on 16/3/13.
 */

/**
 * 题目描述:
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符的位置。
 * 若为空串，返回-1。位置索引从0开始
 */
public class FirstNoRepeatingNum {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.equals("")){
            return -1;
        }
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (char i : chars){
            if (map.get(i) == null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }

        for (int i=0;i<chars.length;i++){
            if (map.get(chars[i])==1)
                return i;
        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(FirstNotRepeatingChar("abaccdeff"));
    }
}
