/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoremanager;

public class CashPayment implements Payment{
    @Override
    public double processPayment(double amount) {
        System.out.println("Payed with cash: ");
                return amount;

    }
}
  