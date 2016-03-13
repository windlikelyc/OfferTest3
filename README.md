# 剑指Offer笔试题3

*题目来源：*[牛客网](http://www.nowcoder.com/ta/coding-interviews?page=1)

### 题目一 复杂链表的复制

**描述:**  
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/CloneListNode.java)  

### 题目二 字符串的排列

**描述:**  
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 结果请按字母顺序输出。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/Permutation.java)  
以abc为例

 * 固定a,将后面的bc进行排列,有两种排列方法:bc,cb;
 * 固定b,将后面的ac进行排列,有两种排列方法:ac,ca;
 * 股东c,将后面的ab进行排列,有两种排列方法:ab,ba;
 * 输出,abc,acb,bac,bca,cab,cba;

### 题目三 数组中出现次数超过一半的数字

**描述:**  
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/MoreThanHalfNum.java)  
 
 * 如果数组中某数字出现的次数超过数组长度的一半,那么在排序后,该数一定在数组的中间;
 * 先进行快排,然后取数组最中间的数;
 * 遍历该数组,如果最中间的数出现的次数超过数组长度的一半,则输出这个数;

### 题目四 最小的K个数

**描述:**  
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/GetLastKnum.java)  
解法一:
 
 * 将数组进行快排;
 * 取快排后前K个数;
 
解法二:

 * 将数组前k个数放到一个copy到一个数组int[] temp中；
 * 将temp数组快排；
 * 取从原数组第k个元素开始，逐个与temp数组中最大的元素temp[k－1]进行比较；
 * 如果temp[k-1]比原数组小，则原数组取下一个，如果temp[k-1],大于原数组中元素，则两个数进行交换，temp数组快排；
 * 最后输出temp数组；

### 题目五 连续子数组的最大和

**描述:**  
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/FindGreatestSum.java)  
使用动态规划的思想:

* 令currSum是以当前元素结尾的最大连续子数组的和;
* maxSum是全局的最大子数组的和;
* 当往后扫描时:对第j个元素有两种选择,要么放入前面找到的子数组,要么最为新的子数组的第一个元素;
* 如果currSum > 0,则令currSum加上a[j];
* 如果currSum < 0,则currSum被置为当前元素;即currSum = a[j];

举例:{1,-2,3,10,-4,7,2,-5};  
currSum: 0 -> 1 -> -1 -> 3 -> 13 -> 9 -> 16 ->18 -> 13;  
maxSum: 0 -> 1 -> 1 -> 3 -> 13 -> 13 -> 16 -> 18 -> 18;

### 题目六 整数中1出现的次数（从1到n整数中1出现的次数）

**描述:**  
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/Count1OfNum.java)    
*这是一个数学问题的算法,代码很容易,但是不懂这个数学问题为什么会是这样?

### 题目七 把数组排成最小的数

**描述:**  
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/PrintMin.java)    
该题目考察的就是对给出的数组进行排序;  
以数组{3，32，321}为例:"3"与"32"不能直接进行"3".compareTo("32")的运算;而是将两个字符串拼接后进行再进行比较,如:"332".compareTo("323");否则使用该函数的时候首先要对字符串的长度进行比较;得到排序后的数组{"321","32","3"},将三个字符串按照顺序进行拼接后即可得到最小字符串;

### 题目八 第一个只出现一次的字符位置

**描述:**  
在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符的位置。若为空串，返回-1。位置索引从0开始

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/PrintMin.java)    

 * 使用HashMap<Character,Integer>将字符串中的字符存起来,有重复字符则在hashmap的value加1;
 * 存进hashmap后,依次遍历String字符串中的每一个字符,找到第一个value为1的char的索引值;

### 题目九 数组中的逆序对

**描述:**  
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/InversePairsTest.java)    
使用冒泡排序的思想,使用两个for循环;(这个不是最优的解法,希望可以找到更好的算法)

### 题目十 两个链表的第一个公共结点

**描述:**  
输入两个链表，找出它们的第一个公共结点。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/CommonNode.java)    
将第一个链表的节点存到hashmap中,然后第二个节点依次取出节点在hashmap中查找公共节点;

### 题目十一 数字在排序数组中出现的次数

**描述:**  
统计一个数字在排序数组中出现的次数。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/GetKCount.java)    
解法一:直接遍历数组查找;
解法二:使用二分法的思想,找出这个数第一次出现的位置和最后一次出现的位置,然后计算出次数;

### 题目十二 二叉树的深度

**描述:**  
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/DepthOfTree.java)    
使用递归的思想:取左子树与右子树深度较大的;

### 题目十三 平衡二叉树

**描述:**  
输入一棵二叉树，判断该二叉树是否是平衡二叉树。

**解题思路:** [代码](https://github.com/ToryangChen/OfferTest2/blob/master/src/BalencedTree.java)    
该题目的实质就是递归求二叉树左右子树的深度;

