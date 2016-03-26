package com.whisper.swordOffer;

import com.whisper.dataStructAndAlgo.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by phoenix on 2016/3/26.
 * 逆序打印链表
 */
public class PrintListReversing {


    public void printListReversing_Recursively(Node node) throws Exception {
        if (node == null) {
            throw new Exception("该节点是个空节点");
        } else if (node.getNext() != null) {
            printListReversing_Recursively(node.getNext());
        }
        System.out.print(((Integer) node.getElement()).intValue() + "\t");
    }

    //测试用例
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            nodes.add(new Node(i,null));
        }
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).setNext(nodes.get(i+1));
        }
       /* Node node = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);
        node.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);*/
        PrintListReversing printListReversing = new PrintListReversing();
        try {
            printListReversing.printListReversing_Recursively(nodes.get(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


// 注：递归这种方法对于链表长度特别长的时候，会导致栈溢出的问题。这里实际测了一下
// 在长度为10000时可以，20000不可以。大概是这个数量级的吧。具体临界值在一台机器测出来也没什么意义。
