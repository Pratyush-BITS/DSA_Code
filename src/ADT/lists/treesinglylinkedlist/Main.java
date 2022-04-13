package ADT.lists.treesinglylinkedlist;

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer five = 5;
        Integer mOne = -1;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insert(three);
        list.printList();
        list.insert(two);
        list.printList();
        list.insert(one);
        list.printList();
        list.insert(four);
        list.printList();
        list.insert(mOne);
        list.printList();
        list.insert(five);
        list.printList();


    }
}
