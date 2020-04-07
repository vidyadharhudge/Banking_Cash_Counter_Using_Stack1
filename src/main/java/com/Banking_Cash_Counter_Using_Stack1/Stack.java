package com.Banking_Cash_Counter_Using_Stack1;

public class Stack
{
        int capacity;
        int[] Stack;
        int top;
        public Stack(int capacity)
        {
            this.capacity = capacity;
            Stack = new int[this.capacity];
            top = 0;

        }
        /// check stack is empty or not
        //it return true when stack is empty
        public Boolean isEmpty()
        {
            return (top < 1);
        }
        /// if top is greter then capacity then print stack overflow
        //else
        //data will be store in stack at then end
        //param name=data store data in stack
        public void push(int data)
        {
            if(top>capacity)
            {
                System.out.println("stack overflow");

            }
            else
            {
                Stack[top++] = data;
            }
        }
        /// if top is zero then return 0
        // else
        // top will be reduce by 1 and
        // element on this possition is removed by garbeg collector
        //data will be return
        public int pop()
        {
            if(top<0)
            {
                return 0;
            }
            else
            {
                top = top - 1;
                int data = Stack[top];

                return data;
            }
        }
        //it shows topmost element from stack
        public void peek()
        {
            System.out.println("top most element is : "+Stack[top-1]);
        }
        public void display()
        {
            if(top<1)
            {
                System.out.println("stack is empty");
            }
            else
            {
                for(int i=top-1;i>=0;i--)
                {
                    System.out.println(Stack[i]);
                }
            }
        }
    }

