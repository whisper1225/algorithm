package com.whisper.dataStructAndAlgo.interf;

import com.whisper.dataStructAndAlgo.exception.StackEmptyException;

/*
* 栈接口
* */
public interface Stack {
    public int getSize();
    public boolean isEmpty();
    public Object top() throws StackEmptyException; //取栈顶元素但不删除

    //update 操作
    public void push(Object ele) throws StackEmptyException;
    public Object pop() throws StackEmptyException;
}