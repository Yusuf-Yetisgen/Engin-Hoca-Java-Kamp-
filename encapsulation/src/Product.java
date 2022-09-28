public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }


    private int id;
    String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String _kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        id = id;

    }

    public String get_name() {
        return name;
    }

    public void set_name(String _name) {
        this.name = _name;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String _description) {
        this.description = _description;
    }

    public double get_price() {
        return price;
    }

    public void set_price(double _price) {
        this.price = _price;
    }

    public int getStoclAmount() {
        return stockAmount;
    }

    public void setStoclAmount(int stoclAmount) {
        this.stockAmount = stoclAmount;
    }

    public String get_renk() {
        return renk;
    }

    public void set_renk(String renk) {
        this.renk = renk;
    }

    public String get_kod() {
        return this.name.substring(0, 1) + id;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }
}





