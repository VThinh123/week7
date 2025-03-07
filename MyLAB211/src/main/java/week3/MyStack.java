/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author LENOVO LEGION
 */
public class MyStack {
    private Node top;
    
    public MyStack() {
        this.top = null;
    }

     class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack.");
    }

     int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int popNode = top.data;
        top = top.next;
        System.out.println(popNode + " popped from stack.");
        return popNode;
    }

     int get() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }
}
