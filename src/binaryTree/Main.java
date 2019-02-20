package binaryTree;

import java.util.Iterator;

public class Main {

    public static void main(String args[]){

        Tree myTree = new Tree("General Sherman");
        myTree.getBinTrees().setLeftSon(" level 1L");
        myTree.getBinTrees().setRightSon(" level 1R");

        myTree.getBinTrees().getLeftSon().setLeftSon(" level 2LL");
        myTree.getBinTrees().getLeftSon().setRightSon(" level 2LR");
        myTree.getBinTrees().getRightSon().setLeftSon(" level 2RL");
        myTree.getBinTrees().getRightSon().setRightSon(" level 2RR");

        myTree.getBinTrees().getLeftSon().getLeftSon().setLeftSon(" level 3LLL");
        myTree.getBinTrees().getLeftSon().getLeftSon().setRightSon(" level 3LLR");
        myTree.getBinTrees().getLeftSon().getRightSon().setLeftSon(" level 3LRL");
        myTree.getBinTrees().getLeftSon().getRightSon().setRightSon(" level 3LRR");
        myTree.getBinTrees().getRightSon().getLeftSon().setLeftSon(" level 3RLL");
        myTree.getBinTrees().getRightSon().getLeftSon().setRightSon(" level 3RLR");
        myTree.getBinTrees().getRightSon().getRightSon().setLeftSon(" level 3RRL");
        myTree.getBinTrees().getRightSon().getRightSon().setRightSon(" level 3RRR");

        Tree secondTree = new Tree("Sapin Président");
        secondTree.getBinTrees().setLeftSon(" level 1L");
        secondTree.getBinTrees().setRightSon(" level 1R");

        secondTree.getBinTrees().getLeftSon().setLeftSon(" level 2LL");
        secondTree.getBinTrees().getLeftSon().setRightSon(" level 2LR");
        secondTree.getBinTrees().getRightSon().setLeftSon(" level 2RL");
        secondTree.getBinTrees().getRightSon().setRightSon(" level 2RR");


        // form 1
        for (Iterator<BinTree> iterator = myTree.iterator();iterator.hasNext();) {
            BinTree node=iterator.next();
            System.out.println(node.getLabel());
            if (node.getLabel().contains("level 3LLL")){
                // test of a second iteration to same tree
                // use form 2
                for (BinTree autrenode : myTree)
                {
                    System.out.println("second interation:" + autrenode.getLabel());
                }
            };

        }
        // test with a second tree
        for (BinTree node:secondTree){
            System.out.println(node.getLabel());
        }

    }
}

