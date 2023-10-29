public class Node {
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data=data;
    }

    public void insert(int num){
        if(num<=data){
            if(left==null){
                left=new Node(num);
            }else{
                left.insert(num);
            }
        }else{
            if(right==null){
                right=new Node(num);
            }else{
                right.insert(num);
            }
        }
    }
    public void preOrderTraversing(){
        System.out.println(data);
        if(left!=null){
            left.preOrderTraversing();
        }
        if(right!=null){
            right.preOrderTraversing();
        }
    }

    public void inOrderTraversing(){
        if(left!=null){
            left.inOrderTraversing();
        }
        System.out.println(data);
        if(right!=null){
            right.inOrderTraversing();
        }
    }

    public void postOrderTraversing(){
        if(left!=null){
            left.postOrderTraversing();
        }
        if(right!=null){
            right.postOrderTraversing();
        }
        System.out.println(data);
    }
}
