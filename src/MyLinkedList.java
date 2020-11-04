class MyLinkedList {

    /** Initialize your data structure here. */
    int size;
    ListNode head;
    public MyLinkedList() {

        size = 0;
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if( index < 0 || index >= size){
            return -1;
        }
        ListNode current = null;
        for(int i = 0;i<index+1;++i){
            current = current.next;
            return current.value;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        addAtIndex(0,val);

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     * @return*/
    public int addAtIndex(int index, int val) {

        if (index > size){
            return index;
        }

        if (index < 0) {
            ++size;
            return index = 0;
        }


        ListNode pred = head;
        for(int i = 0; i < index; ++i){
            pred = pred.next;
            ListNode toAdd = new ListNode(val);

            toAdd.next = pred.next;
            pred.next = toAdd;

        }

        return index;
    }



    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index <= 0 || index >= size) {
            size--;
            return;

        }

        ListNode pred = head;
        for(int i = 0; i< index; ++i){
            pred = pred.next;
            pred.next = pred.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */