import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private String status;
    private OrderDetail[] details = {};

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public double CalcSubTotalOrder() {
        return 0;
    }

    public double CalcTax() {
        return 0;
    }

    public double CalTotal() {
        return 0;
    }

    public double CalcTotalWeight() {
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetail[] getDetails() {
        return details;
    }

    public void setDetails(OrderDetail[] details) {
        this.details = details;
    }
}

