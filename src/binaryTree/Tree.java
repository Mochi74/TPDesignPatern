package binaryTree;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Tree implements Iterable<BinTree> {

    private BinTree binTrees;

    public BinTree getBinTrees() {
        return binTrees;
    }

    public Tree( String name ){

        binTrees= new BinTree(name);

    };


    @Override
    public Iterator<BinTree> iterator() {
        return new TreeIterator(this);
    }

}
