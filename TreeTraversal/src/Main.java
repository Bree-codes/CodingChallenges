public class Main {
    public static void main(String[] args) {
        Node node7 = new Node('G',null,null);
        Node node6 = new Node('F', null, null);
        Node node5 = new Node('E', null, null);
        Node node4 = new Node('D', null, null);
        Node node3 = new Node('C', node6, node7);
        Node node2 = new Node('B', node4, node5);
        Node node1 = new Node('A', node2, node3);

        System.out.println("pre-order : ");
        node1.preorderTraversal(node1);
        System.out.println("\npost-order : ");
        node1.postorderTraversal(node1);
        System.out.println("\nin-order :");
        node1.traverseTree(node1);

    }
}