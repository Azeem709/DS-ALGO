package ds.tree.imp;


import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
}


public class BinaryTree {
    private Node root;
    private int size;


    public BinaryTree( int size) {
        this.size = size;
        this.root = constructTree(new Scanner(System.in), null, true);
    }

    private Node constructTree(Scanner scanner, Node parent, boolean isLeftchild) {
        if (parent == null)
            System.out.println("Root node ? ");
        else {
            if (isLeftchild)
                System.out.println("enter value left child of " + parent.data);
            else
                System.out.println("enter value right child of " + parent.data);
        }
        System.out.println("Enter the data");
        int data = scanner.nextInt();
        this.size++;

        Node node = new Node();
        node.data = data;

        System.out.println(" does the node has the left child "  );
        boolean hlc = scanner.nextBoolean();

        if(hlc)
        node.left = constructTree(scanner,node,true);

        System.out.println(" does the node has the left child "  );
        boolean hrc = scanner.nextBoolean();

        if(hrc)
            node.right = constructTree(scanner,node,false);

        return node;
    }


    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if(root == null)
           return;

        System.out.println("left =>");
        if (node.left == null)
            System.out.print(". ");
        else
            System.out.print(node.left.data);

        System.out.println("Node "+node.data);

        if (node.right == null)
            System.out.print(". ");
        else
            System.out.print(node.right.data);
        System.out.print("<=right ");

        System.out.println();
        display(node.left);
        display(node.right);


    }
}
