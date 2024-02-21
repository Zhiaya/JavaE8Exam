package exercise2;

interface DiscountRate {
    double getServiceMemberDiscount();
    double getProductMemberDiscount();
}
class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium": return   0.20;
            case "Gold": return   0.15;
            case "Silver": return   0.10;
            default: return   0.00;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        return   0.10;
    }
}


class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("Service Expense: " + serviceExpense);
        System.out.println("Product Expense: " + productExpense);
        System.out.println("Total Expense: " + getTotalExpense());
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Lyzhia", "Premium");
        Customer customer2 = new Customer("Panha", "Gold");
        Customer customer3 = new Customer("Kimsun", "Silver");

        Sale sale1 = new Sale(customer1, "2023-04-01");
        sale1.setServiceExpense(100.00);
        sale1.setProductExpense(200.00);

        Sale sale2 = new Sale(customer2, "2023-04-02");
        sale2.setServiceExpense(300.00);
        sale2.setProductExpense(400.00);

        Sale sale3 = new Sale(customer3, "2023-04-03");
        sale3.setServiceExpense(500.00);
        sale3.setProductExpense(600.00);

        System.out.println("Sale Information for Premium Customer:");
        sale1.displayInfo();

        System.out.println("===============================================");
        System.out.println("\nSale Information for Gold Customer:");
        sale2.displayInfo();

        System.out.println("===============================================");
        System.out.println("\nSale Information for Silver Customer:");
        sale3.displayInfo();
    }
}

