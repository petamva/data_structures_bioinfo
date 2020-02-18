//package com.company;

public class Pair {
    int startNode,endNode;

    public Pair(int startNode, int endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public int getStartNode() {
        return startNode;
    }

    public int getEndNode() {
        return endNode;
    }

    public void setStartNode(int startNode) {
        this.startNode = startNode;
    }

    public void setEndNode(int endNode) {
        this.endNode = endNode;
    }

    public void swapPairs(Pair pair1){
        int tempStart=0;
        int tempEnd=0;
        Pair temp = new Pair(tempStart,tempEnd);
        temp.setStartNode(pair1.getStartNode());
        temp.setEndNode(pair1.getEndNode());
        pair1.setStartNode(getStartNode());
        pair1.setEndNode(getEndNode());
        setStartNode(temp.getStartNode());
        setEndNode(temp.getEndNode());
    }
//
//    public void printPair(){ // this function is for testing purposes only
//        System.out.println(getStartNode()+"-->"+getEndNode());
//    }
}
