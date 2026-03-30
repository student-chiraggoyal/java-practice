public class stack_implementation {

    static class node{
        int data;
        node next;
        node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static node head = null;
        public boolean isEmpty(){
            return head == null;
        }
        //push
        public void push(int data){
            node newNode = new node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        System.out.println("stack implementation");
    }
}
