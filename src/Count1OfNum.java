/**
 * Created by toryang on 16/3/12.
 */

/**
 * 题目描述:
 * '求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
public class Count1OfNum {

    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (long m = 1; m <= n; m *= 10)
            count += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(10));
    }
}
