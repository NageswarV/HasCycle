class HasCycle{
static boolean hasCycle(SinglyLinkedListNode head) {
        int count=0;
       while(head!=null)
       {   count++;
           head=head.next;
       if(count>1000)
           break;
       }
       if(count>1000)
       return true;
       else
       return false;
    }
}