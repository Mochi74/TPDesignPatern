package binaryTree;
import static binaryTree.NodeType.*;

public class BinTree {

    private String label;
    private BinTree rightSon;
    private BinTree leftSon;
    private BinTree father;
    private NodeType nodeType;


    public BinTree() {
        this.label = "";
        this.leftSon = null;
        this.rightSon = null;
        this.father = null;
        this.nodeType = null;
    }

    public BinTree(String label) {
        this.nodeType = ROOT;
        this.father = null;
        this.label = label;
        this.leftSon=null;
        this.rightSon=null;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BinTree getRightSon() {
        return rightSon;
    }

    public void setRightSon(String label) {
        this.rightSon = new BinTree(label);
        this.rightSon.setFather(this);
        this.rightSon.setNodeType(NodeType.RIGHT);
        return;
    }

    public BinTree getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(String label ) {
        this.leftSon = new BinTree(label);
        this.leftSon.setFather(this);
        this.leftSon.setNodeType(NodeType.LEFT);
        return;
    }

    public BinTree getFather() {
        return father;
    }

    public void setFather(BinTree father) {
        this.father = father;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

}

