public class LinkedStack {
    private Node top = new Node();
    private int count = 0;

    public boolean isEmpty(){
        return top.link == null;
    }

    public void clear(){
        count = 0;
        top.link = null;
    }

    public void push(String data){
        Node node = new Node(data);
        node.link = top.link;
        top.link = node;
        count++;
    }

    public String pop(){
        if(!this.isEmpty()){
            Node node = top.link;
            top.link = top.link.link;
            count--;
            return node.data;
        }
        else
            return "비어있습니다.";
    }

    public String peek(){
        if(!this.isEmpty())
            return top.link.data;
        else
            return "비어있습니다.";
    }

    public int size(){
        return count;
    }

    public void display(){
        Node node = top.link;
        if(node == null){
            System.out.println("비어있습니다.");
            return;
        }
        while (node != null){
            System.out.printf("%s ",node.data);
            node = node.link;
        }
        System.out.println();
        
    }
}
