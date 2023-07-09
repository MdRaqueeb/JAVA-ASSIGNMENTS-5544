class Account 
{
    int accountNo;
    int balance;
    String holdername;
    public Account() {}
    public Account(int accountNo, int balance, String holdername) 
    {
        this.accountNo = accountNo;
        this.balance = balance;
        this.holdername = holdername;
    }
    public int getAccountNo() 
    {
        return accountNo;
    }
    public void setAccountNo(int accountNo) 
    {
        this.accountNo = accountNo;
    }
    public int getBalance() 
    {
        return balance;
    }
    public void setBalance(int balance) 
    {
        this.balance = balance;
    }
    public String getHoldername() 
    {
        return holdername;
    }
    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }
}

class SavingsAccount extends Account 
{
    int ROI;
    int transactionlimit;
    int withdrawlimit;
    public SavingsAccount() {}
    public SavingsAccount(int accountNo, int balance, String holdername, int rOI, int transactionlimit, int withdrawlimit) 
    {
        super(accountNo, balance, holdername);
        this.ROI = rOI;
        this.transactionlimit = transactionlimit;
        this.withdrawlimit = withdrawlimit;
    }
    public int getROI() 
    {
        return ROI;
    }
    public void setROI(int rOI) 
    {
        this.ROI = rOI;
    }
    public int getTransactionlimit() 
    {
        return transactionlimit;
    }
    public void setTransactionlimit(int transactionlimit) 
    {
        this.transactionlimit = transactionlimit;
    }
    public int getWithdrawlimit() 
    {
        return withdrawlimit;
    }
    public void setWithdrawlimit(int withdrawlimit) 
    {
        this.withdrawlimit = withdrawlimit;
    }
}

class CurrentAccount extends Account 
{
    int overdraft;
    int minbalance;
    public CurrentAccount() {}
    public CurrentAccount(int accountNo, int balance, String holdername, int overdraft, int minbalance) 
    {
        super(accountNo, balance, holdername);
        this.overdraft = overdraft;
        this.minbalance = minbalance;
    }
    public int getOverdraft() 
    {
        return overdraft;
    }
    public void setOverdraft(int overdraft)
    {
        this.overdraft = overdraft;
    }
    public int getMinbalance() 
    {
        return minbalance;
    }
    public void setMinbalance(int minbalance) 
    {
        this.minbalance = minbalance;
    }
}

public class Test2 
{
    public static void main(String[] args) 
    {
        SavingsAccount s = new SavingsAccount(123456789, 50000, "Ajay", 9, 100000, 20000);
        CurrentAccount c = new CurrentAccount(123456789, 50000, "Ajay", 10000, 5000);

        // Account Properties
        System.out.println("Account No. :          " + s.getAccountNo());
        System.out.println("Balance     :          " + s.getBalance());
        System.out.println("Holder Name :          " + s.getHoldername());

        // SavingsAccount Properties
        System.out.println("Rate of Interest :     " + s.getROI());
        System.out.println("Transaction Limit :    " + s.getTransactionlimit());
        System.out.println("With Draw Limit :      " + s.getWithdrawlimit());

        // CurrentAccount Properties
        System.out.println("Over Draft Amount :    " + c.getOverdraft());
        System.out.println("Minimum Balance :      " + c.getMinbalance());
    }
}
