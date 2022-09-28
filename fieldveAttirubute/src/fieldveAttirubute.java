public class fieldveAttirubute {

    public static void main (String[] args){
        Product product = new Product();
        product.name = "Bilgisayar";
        product.id=1;
        product.description="Monster";
        product.price=5000;
        product.stoclAmount=3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
