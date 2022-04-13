package ADT.lists.treesinglylinkedlist;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    private void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }


    /**
     * Inserts data in sorted order
     * @param val Integer data
     */
    public void insert(Integer val){

        if(head == null || head.getValue()<val){
            addToFront(val);
            return;
        }

        IntegerNode curr = head.getNext(), prev = head;
        while (curr!=null && curr.getValue()<val){
            prev =curr;
            curr = curr.getNext();
        }
        IntegerNode node = new IntegerNode(val);
        prev.setNext(node);
        node.setNext(curr);
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
