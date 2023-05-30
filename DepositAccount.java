package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
   private LocalDate lastIncome;
    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        if(amountToPut > 0) {
            totalAmount += amountToPut;
        }
    }
    @Override
    public void take(double amountToTake) {
        LocalDate now = LocalDate.now().minusMonths(1);
        if(amountToTake <= totalAmount && amountToTake > 0 && now.isAfter(lastIncome)) {
            totalAmount -= amountToTake;
        }
    }
}

