package com.Banking_Cash_Counter_Using_Stack1;

import java.util.Scanner;

public class ProgramMain
{
    public static void main(String[] args)
    {
        //creating object
        StackUsingLinkedlist list = new StackUsingLinkedlist();
        int count = 0;
        //user input for no of people in queue
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of peoples in queue ");
        int  PeopleInQue= sc.nextInt();
        Banking bank = new Banking();
        do {
            int userMoney = 5000;
            int userbalance = userMoney;
            int totalBalanceOfUser = 0;
            //user input for the cash
            System.out.println("enter cash :");
            int cash = sc.nextInt();
            //user input for depoisite cash and withdraw cash
            System.out.println("please enter 1 for deposit 2 for withdraw");
            int userchoice=sc.nextInt();
            //switch case for user choise
            switch (userchoice)
            {
                case 1:
                    totalBalanceOfUser = bank.depositCash(cash, userbalance);
                    //push methode
                    list.push(totalBalanceOfUser);
                    //displaying total balance of user
                    System.out.println("balance is : " +totalBalanceOfUser);
                    //pop methode
                    list.pop();
                    cash = 0;
                    break;

                case 2:
                    if (userbalance < cash)
                    {
                        System.out.println("not ifficient cash");
                    }
                    else
                    {

                        totalBalanceOfUser = bank.withdrawCash(cash, userbalance);
                        //push methode
                        list.push(totalBalanceOfUser);
                        //displaying total balance of user
                        System.out.println("total balance of user is : " +totalBalanceOfUser);
                        //pop methode
                        list.pop();
                        cash = 0;
                    }
                    break;

            }
            count++;
        }
        while (count < PeopleInQue);


    }
}
