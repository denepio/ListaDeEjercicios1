public class Cash extends Payment {
    private double cashAmount;
    private double deduction;

    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivop");
    }


    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
}

