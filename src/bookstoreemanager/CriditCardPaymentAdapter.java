/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoremanager;

public class CriditCardPaymentAdapter implements Payment{
    public CreditCardPayment creditCardPayment;
    public CriditCardPaymentAdapter(CreditCardPayment newCriditCardpayment){
        creditCardPayment = newCriditCardpayment;
    }
    @Override
    public double  processPayment(double amount) {
       creditCardPayment.processCriditCardPayment(amount);
               return amount;

    }
    
}