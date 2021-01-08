package practice;

import java.util.ArrayList;

public class FindIndexKNode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(makeLinkedByArray(arr).element);
        System.out.println(makeLinkedByArray(arr).nextNode.element);
    }
    // 返回以数组创建一条链表的尾节点
    public static LinkedNode makeLinkedByArray(int[] arr) {
        LinkedNode first = new LinkedNode(-1);
        LinkedNode last = first;

        for (int i: arr) {
            LinkedNode now = new LinkedNode(i);
            last.nextNode = now;
            last = now;

        }

        return  first;
    }


}
