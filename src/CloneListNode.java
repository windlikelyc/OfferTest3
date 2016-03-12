/**
 * Created by toryang on 16/3/12.
 */

/**
 * 题目描述:
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。
 */
public class CloneListNode {
    /**
     * 解题思路:
     * 我们发现,这里所谓的复杂链表即比以前的普通链表多了一个random
     *
     * @param pHead
     * @return
     */
    public RandomListNode clone(RandomListNode pHead){

        if (pHead == null)
            return pHead;

        RandomListNode pNode = pHead;
        while (pNode != null) {
            int val = pNode.label;
            RandomListNode randomListNode = new RandomListNode(val);
            randomListNode.next = pNode.next;
            pNode.next = randomListNode;
            pNode = randomListNode.next;
        }
        pNode = pHead;
        while (pNode != null) {
            RandomListNode next = pNode.next;
            RandomListNode random = pNode.random;
            if (random != null)
                next.random = random.next;
            pNode = next.next;
        }
        pNode = pHead;
        RandomListNode second = pHead.next;
        while (pNode != null) {
            RandomListNode next = pNode.next;
            pNode.next = next.next;
            pNode = next.next;
            if (pNode != null)
                next.next = pNode.next;
        }
        return second;


    }

}
