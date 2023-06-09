package DataStructure;

//public class BinaryTree {
//    Node root;
//    BinaryTree(int key){
//        root = new Node(key);
//    }
//
//    BinaryTree(){
//        root = null;
//    }
//
//    public void traverseInOrder(Node node){
//        if(node != null){
//            traverseInOrder(node.left);
//            System.out.println(" "+ node.key);
//            traverseInOrder(node.right);
//        }
//    }
//
//    public void traversePostOrder(Node node){
//        if(node != null){
//            traversePostOrder(node.left);
//            traversePostOrder(node.right);
//            System.out.println(" "+ node.key);
//        }
//    }
//
//    public void traversePreOrder(Node node){
//        if(node != null){
//            System.out.println(" "+ node.key);
//            traversePreOrder(node.left);
//            traversePreOrder(node.right);
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//
//        System.out.println("pre order");
//        tree.traversePreOrder(tree.root);
//
//        System.out.println("in order");
//        tree.traverseInOrder(tree.root);
//
//        System.out.println("post order");
//        tree.traversePostOrder(tree.root);
//    }
//}
//
//
//class Node{
//    int key;
//    Node left, right;
//
//    public Node(int item){
//        key = item;
//        left = right = null;
//    }
//}