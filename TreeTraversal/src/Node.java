public class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //inorder traversal left root right
    public void traverseTree(Node node){

        if(node == null)
            return;
        
        traverseTree(node.left);
        System.out.print(node.data+"\t");
        traverseTree(node.right);
    }

    //postorder traversal left right root
    public void postorderTraversal(Node node){
        if(node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data+"\t");
    }

    //preorder traversal root left right
    public void preorderTraversal(Node node){
        if(node == null)
            return;
        System.out.print(node.data+"\t");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}

