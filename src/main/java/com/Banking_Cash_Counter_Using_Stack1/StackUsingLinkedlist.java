package com.Banking_Cash_Counter_Using_Stack1;

public class StackUsingLinkedlist
{
    //create global top level refrence
    node head;
    //constructor
    StackUsingLinkedlist()
    {
        this.head=null;
    }

    //node class create
    class node
    {
        //data
        int data;
        //address of next node
        node next;

        //constructor for initialization
        public node(int value)
        {
            data = value;
            next = null;
        }
    }
    // Utility function to add an element x in the stack
    public void push(int value) // insert at the beginning
    {
        // create new node temp and allocate memory
        node temp = new node(value);

        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null)
        {
            System.out.print("\nHeap Overflow");
            return;
        }
        // initialize data into temp data field
        temp.data = value;
        // put top reference into temp link
        temp.next = head;
        // update top reference
        head = temp;
    }
    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return head == null;
    }

    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty())
        {
            return head.data;
        }
        else
        {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // remove at the beginning
    public void pop()
    {
        // check for stack underflow
        if (head == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        head= (head).next;
    }
    void printList() //print the data
    {
        // check for stack underflow
        if (head == null)
        {
            System.out.printf("\nStack Underflow");
            return;
        }
        else
        {
            node currentNode = head;
            while (currentNode.next != null)
            {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

}
