import java.util.Date;

public class CreditCard extends Payment {
    private String name;
    private String type;
    private Date expDate;
    private boolean authorized;

    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de credito");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
