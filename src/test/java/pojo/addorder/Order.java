package pojo.addorder;

public class Order {
    private int id;
    private String user_id;
    private String product_id;
    private String product_name;
    private int product_amount;
    private int qty;
    private int tax_amt;
    private int total_amt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTax_amt() {
        return tax_amt;
    }

    public void setTax_amt(int tax_amt) {
        this.tax_amt = tax_amt;
    }

    public int getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(int total_amt) {
        this.total_amt = total_amt;
    }
}
