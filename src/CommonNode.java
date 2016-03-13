/**
 * Created by toryang on 16/3/13.
 */

import java.util.HashMap;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class CommonNode {

    public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){
        ListNode list1 = pHead1;
        ListNode list2 = pHead2;

        HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>();
        while (list1 != null){
            map.put(list1,null);
            list1 = list1.next;
        }

        while (list2 != null){
            if (map.containsKey(list2)){
                return list2;
            }
            list2 = list2.next;
        }

        return null;

    }
}
