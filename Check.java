public class Check extends Payment {
    private String name;
    private String bankID;
    private boolean authorized;

    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
