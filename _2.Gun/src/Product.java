public class Product {
    Integer id;
    String name;

    public Product() {

        System.out.println("Ben calisiyorum");


    }

    public Product(Integer id, String name, Double unitPrice, String detail) {
//        this(); ifadesi parametresiz constructeri calistirir.
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }

    Double unitPrice;
    String detail;

}
