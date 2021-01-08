package practice;

public class LinkedNode {
    int element;
    LinkedNode nextNode;
    public LinkedNode(int i) {
        element = i;
    }

    public LinkedNode(int i, LinkedNode node) {
        element = i;
        nextNode = node;
    }
}
