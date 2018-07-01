package DataStructure.binaryTree;


public class BinaryTree {
    Index index = new Index();


    Node constructTree(int[] pre, int size){
        return constructTreeUtil(pre,index,0,size -1,size);
    }

    private Node constructTreeUtil(int[] pre, Index preIndex, int low, int high, int size) {
        if(preIndex.index >= size || low > high){
            return null;
        }
        Node root = new Node(pre[preIndex.index]);
        preIndex.index = preIndex.index + 1;

        if (low == high){
            return root;
        }
        int i ;
        for (i = low ; i <= high ; i++){
            if (pre[i] > root.data){
                break;
            }
        }

        root.left = constructTreeUtil(pre,preIndex,preIndex.index,i-1,size);
        root.right = constructTreeUtil(pre,preIndex,i,high,size);

        return root;
    }

    void inOrderTreversal(Node root){
        if (root == null){
            return;
        }
        inOrderTreversal(root.left);
        System.out.print(root.data+" ");
        inOrderTreversal(root.right);
    }

    public static void main(String []args){
        BinaryTree binaryTree = new BinaryTree();
        int pre[] = new int[]{10,5,1,7,40,50};
        int size = pre.length;
        Node root = binaryTree.constructTree(pre,size);
        binaryTree.inOrderTreversal(root);
    }

    class Index{
        int index = 0;
    }
}
