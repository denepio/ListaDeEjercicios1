import java.util.Date;

public class Customer {
    private String DNI;
    private String name;
    private String surname;
    private String address;
    private int age;
    private Order[] orders = {};

    public Customer() {}

    public Customer(String DNI, String name, String surname) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
    }

    public void getOrder(int idOrder) {

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}