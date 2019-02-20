package binaryTree;

import java.util.Iterator;
import java.util.function.Consumer;

public class TreeIterator implements Iterator<BinTree> {

    private Tree tree;
    private BinTree current_node;
    private BinTree next_node;

    public TreeIterator(Tree tree) {
        this.tree = tree;
        // start on first node, ie root
        this.current_node = null;
        this.next_node = tree.getBinTrees();
     }

    @Override
    public boolean hasNext() {

        if (current_node==null && next_node!=null) {
            // that's first iteration no current node but next is root
            return true;
        }

        if (current_node.getLeftSon()==null) {
            //node is a leaf
            if (current_node.getNodeType().equals(NodeType.LEFT)) {
                //leaf is left, next is right brother
                next_node = current_node.getFather().getRightSon();
                return true;
            } else {
                //leaf is Right, need to climb tree
                System.out.println("need to climb");
                next_node = climb(current_node);
                if (next_node == null) {
                    System.out.println("has no next_node");
                    return false;
                }
                return true;
            }
        }

        //node is not a leaf, next is left son
        next_node = current_node.getLeftSon();
        return true;
    }



    @Override
    public BinTree next() {
        current_node = next_node;
        return current_node;
    }

    private BinTree climb(BinTree node) {
        if (node.getNodeType().equals(NodeType.ROOT)) {
            // we are on top of tree
            // that's means there is no follower
            return null;
        }

        if (node.getNodeType().equals(NodeType.LEFT)) {
            // next of a left node is its right brother
            return node.getFather().getRightSon();
        }

        // it's a right node need to climb Tree
        System.out.println("more to climb");
        return climb(node.getFather());
    };

}
