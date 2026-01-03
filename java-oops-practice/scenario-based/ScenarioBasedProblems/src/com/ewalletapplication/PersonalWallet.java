package com.ewalletapplication;
import java.time.LocalDate;

public class PersonalWallet extends Wallet{

    public PersonalWallet(double balance){
        super(balance);
    }

    // normal transfer without charges
    public void transferTo(User receiver,double amount){
        if(deductMoney(amount)){
            receiver.getWallet().addMoney(amount);

            // sender transaction
            Transaction senderTxn=new Transaction(
                "Sent Money",
                amount,
                receiver.getName(),
                LocalDate.now().toString()
            );

            // receiver transaction
            Transaction receiverTxn=new Transaction(
                "Received Money",
                amount,
                "Devika",
                LocalDate.now().toString()
            );

            // display both transactions
            senderTxn.displayTransaction();
            receiverTxn.displayTransaction();
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
