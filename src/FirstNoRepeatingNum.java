import java.util.HashMap;

/**
 * Created by toryang on 16/3/13.
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
