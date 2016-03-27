package com.whisper.dataStructAndAlgo;

import com.whisper.dataStructAndAlgo.exception.StackEmptyException;
import com.whisper.dataStructAndAlgo.interf.Stack;

/**
 * Created by phoenix on 2016/3/26.
 * 栈的java模型  基于数组的实现 从栈的操作来看 基于数组的实现操作效率非常高
 * 但是需要类似arraylist那种扩容和缩容机制，来保证空间的利用率
 */
public class stackArray implements Stack {
    public static final int  CAPACITY = 1024;
    protected int capacity;//数组的实际容量
    protected Object [] os;  //对象数组
    protected int top = -1; //栈顶元素的位置

    public stackArray() {
        this(CAPACITY);
    }

    public stackArray(int capacity) {
        this.capacity = capacity;
        os = new Object[capacity];
    }

    @Override
    public int getSize() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return (capacity == 0)?true:false;
    }

    @Override
    public Object top() throws StackEmptyException {
        if(top == -1){
            throw new StackEmptyException("空栈");
        }
        return os[top];
    }

    @Override
    public void push(Object ele) throws StackEmptyException {
        if(top == (capacity - 1)){
            throw  new StackEmptyException("栈溢出");
        }
        os[++top] = ele;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if(top == -1){
            throw new StackEmptyException("空栈");
        }
        return os[top--];
    }


    public static void main(String[] args) {
        stackArray sa = new stackArray(200);
        System.out.println("init size" + sa.getSize());
        //将0-99压入栈
        for (int i = 0; i < 100; i++) {
            try {
                sa.push(i);
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
        //将
        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("栈顶元素是" + sa.top() + "\t");
                System.out.print("弹出元素是" + sa.pop() + "\t");;
                System.out.println("弹出后栈顶元素是" +sa.top());
            } catch (StackEmptyException stackEmptyException) {
                System.out.println(stackEmptyException.getMessage());
            }

        }
    }
}
