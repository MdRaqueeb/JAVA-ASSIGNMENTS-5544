class Loan {
    int interestrate;
    int loanid;
    int tenure;
    
    public Loan() {}
    
    public Loan(int interestrate, int loanid, int tenure) {
        this.interestrate = interestrate;
        this.loanid = loanid;
        this.tenure = tenure;
    }
    
    public int getInterestrate() {
        return interestrate;
    }
    
    public void setInterestrate(int interestrate) {
        this.interestrate = interestrate;
    }
    
    public int getLoanid() {
        return loanid;
    }
    
    public void setLoanid(int loanid) {
        this.loanid = loanid;
    }
    
    public int getTenure() {
        return tenure;
    }
    
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}

class HomeLoan extends Loan {
    int houseid;
    int areaid;
    
    public HomeLoan() {}
    
    public HomeLoan(int interestrate, int loanid, int tenure, int houseid, int areaid) {
        super(interestrate, loanid, tenure);
        this.houseid = houseid;
        this.areaid = areaid;
    }
    
    public int getHouseid() {
        return houseid;
    }
    
    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }
    
    public int getAreaid() {
        return areaid;
    }
    
    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }
}

class VehicleLoan extends Loan {
    int typeofvehicle;
    int price;
    
    public VehicleLoan() {}
    
    public VehicleLoan(int interestrate, int loanid, int tenure, int typeofvehicle, int price) {
        super(interestrate, loanid, tenure);
        this.typeofvehicle = typeofvehicle;
        this.price = price;
    }
    
    public int getTypeofvehicle() {
        return typeofvehicle;
    }
    
    public void setTypeofvehicle(int typeofvehicle) {
        this.typeofvehicle = typeofvehicle;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Test {
    public static void main(String[] args) {
        VehicleLoan v = new VehicleLoan(12, 1234, 5, 4, 700000);
        HomeLoan h = new HomeLoan(12, 1234, 5, 5544, 531163);
        
        // LOAN properties
        System.out.println("Rate of intereat:     " + v.getInterestrate());
        System.out.println("Loanid:               " + v.getLoanid());
        System.out.println("Tenure:               " + v.getTenure());
        
        // VehicleLoan properties
        System.out.println("Type of Vehicle:      " + v.getTypeofvehicle());
        System.out.println("Price of the Vehicle: " + v.getPrice());
        
        // HomeLoan properties
        System.out.println("Houae ID:             " + h.getHouseid());
        System.out.println("Area ID:              " + h.getAreaid());
    }
}
