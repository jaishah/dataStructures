package com.java.ds;

public class Node {
private int num;
private Node nxt=null;
public Node(){
	
}
public Node(int val){
	this.num=val;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public Node getNxt() {
	return nxt;
}
public void setNxt(Node nxt) {
	this.nxt = nxt;
}
}
