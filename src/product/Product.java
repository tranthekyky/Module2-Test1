package product;

public class Product {
    private String name;
    private int price;
    private String code ;
    private int id;

    private static int count = 1;
    public Product(String name, int price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product | " +
                 "id : " + id +  " | " +
                " name : " + name + " | " +
                ", price : " + price + " | " +
                ", code : " + code +
                '.';
    }
}
