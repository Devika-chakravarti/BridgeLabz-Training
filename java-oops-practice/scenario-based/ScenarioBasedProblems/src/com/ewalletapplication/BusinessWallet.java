package com.ewalletapplication;
import java.time.LocalDate;

public class BusinessWallet extends Wallet{

    public BusinessWallet(double balance){
        super(balance);
    }

    // transfer with extra charge
    public void transferTo(User receiver,double amount){
        double charge=amount*0.02;
        double total=amount+charge;

        if(deductMoney(total)){
            receiver.getWallet().addMoney(amount);

            // sender transaction
            Transaction senderTxn=new Transaction(
                "Business Transfer",
                amount,
                receiver.getName(),
                LocalDate.now().toString()
            );

            // receiver transaction
            Transaction receiverTxn=new Transaction(
                "Received Money",
                amount,
                "Amit",
                LocalDate.now().toString()
            );

            // display both
            senderTxn.displayTransaction();
            receiverTxn.displayTransaction();
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
