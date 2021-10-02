package baseline;


public  class PaymentCalculator {
    double balance;
    double apr;
    double monthlyPayments;
    double dailyRates;
    int months;

    public PaymentCalculator(double balance, double apr, double monthlyPayments){
        this.balance = Math.ceil(balance);
        this.apr = apr;
        this.monthlyPayments = monthlyPayments;
        findRate();
    }
    private void findRate(){
        this.dailyRates = this.apr/36500;
    }
    public int calculateMonthsUntilPaidOff(){
        double balance = this.balance;
        double daily = this.dailyRates;
        double payments = this.monthlyPayments;

        double n = (-1.0/30.0)*Math.log(1+(balance/payments)*(1-Math.pow(1+daily,30)))/Math.log(1+daily);
        this.months = (int)Math.ceil(n);
        return months;
    }
    //Months = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
}
