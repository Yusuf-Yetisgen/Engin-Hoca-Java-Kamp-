public class encapsulation {

    public static void main(String[] args) {

        Product product = new Product(1, "Bilgisayar", "Monster", 5000, 3, "yeşil");


        /*
        Product product = new Product();
        product.set_name("Bilgisayar");
        product.setId(1);
        product.set_description ("Monster");
        product.set_price  (5000);
        product.setStockAmount (3);


         */

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());


    }
}
