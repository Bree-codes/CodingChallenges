public class Main {
    public static void main(String[] args) {
        Node node7 = new Node(70, null, null);
        Node node6 = new Node(60, null, null);
        Node node5 = new Node(50, null, null);
        Node node4 = new Node(40, null, null);
        Node node3 = new Node(30, node6, node7);
        Node node2 = new Node(20, node4, node5);
        Node node1 = new Node(10, node2, node3);

        System.out.println("pre-order : ");
        node1.preorderTraversal(node1);
        System.out.println("\npost-order : ");
        node1.postorderTraversal(node1);
        System.out.println("\nin-order :");
        node1.traverseTree(node1);

    }
}