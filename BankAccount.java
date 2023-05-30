package practice;

public class BankAccount {
  protected double totalAmount;
  public double getAmount() {
    return totalAmount;
  }

  public void put(double amountToPut) {
    if(amountToPut > 0) {
      totalAmount += amountToPut;
    }
  }

  public void take(double amountToTake) {
    if(amountToTake <= totalAmount && amountToTake > 0) {
      totalAmount -= amountToTake;
    }
  }
}
