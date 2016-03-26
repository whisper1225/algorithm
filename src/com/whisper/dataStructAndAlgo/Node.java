package com.whisper.dataStructAndAlgo;

/**
 * Created by phoenix on 2016/3/26.
 */
public class Node {
    private Object element;//数据对象
    private Node next;  //指向后继节点

    /*
    * 构造函数
    * */

    public Node() {
        this(null,null);
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
    /*************单链表节点方法  ***************/

    //获取当前节点的后继节点
    public Node getNext() {
        return next;
    }

    /*修改当前节点的后继节点*/
    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
