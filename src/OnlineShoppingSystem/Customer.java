package OnlineShoppingSystem;

public class Customer {

    String custName;
    String custAddress;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }


    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void login(){
        System.out.println("Login successfully");
    }

    public void logout(){
        System.out.println("Logout successfully");
    }

    public void selectProduct(String product){

    }


}
