class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val=val;
        this.next=null;
    }

}
class MyLinkedList {
    ListNode head;
    public int nodes=0;
    public MyLinkedList() {
        head=null;
    }

    public int get(int index) {
        if(head==null){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;cur!=null;i++){
            if(i==index)
                return cur.val;
            cur=cur.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode newnode = new ListNode(val);
        nodes++;
        if(head==null){
            head=newnode;
            return ;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addAtTail(int val) {
        nodes++;
        ListNode newnode= new ListNode(val);
        ListNode cur=head;
        if(head==null){
            head=newnode;
            return ;
        }
        while(cur!=null && cur.next!=null){
            cur=cur.next;
        }
        cur.next = newnode;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode newnode = new ListNode(val);
        
        nodes++;
        if(index==0){
            newnode.next=head;
            head=newnode;
            return ;
        }
        if(head==null){
            return ;
        }
        ListNode cur = head;
        for(int i=1;cur.next!=null && i<index;i++){
            cur=cur.next;
        }
        newnode.next=cur.next;
        cur.next=newnode;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return ;
        }
        if(index>=nodes){
            return ;
        }
        if(index==0){
            ListNode cur = head;
            head = head.next;
            cur.next=null;
            nodes--;
            return ;
        }
        ListNode cur = head;
        if(index==(nodes-1)){
            while(cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
            nodes--;
            return ;
        }
        ListNode nextnode=cur.next;
        for(int i=1;i<index;i++){
            cur=cur.next;
            nextnode=cur.next;
        }
        if(nextnode==null){
            cur.next=null;
            nodes--;
            return ;
        }
        cur.next=nextnode.next;
        nodes--;
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
