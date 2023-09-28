public class AVLTrees {
    static class Node{
        int data,height;
        Node left,right;

        Node(int data){
            this.data = data;
            height =1;

        }
    }

    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }
}
