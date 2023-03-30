package bai1;

import java.io.Serializable;
import java.util.StringJoiner;

public class Product implements Serializable {
    private int id;
    private String name;
    private String producer;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, String producer, int price, String describe) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.describe = describe;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("producer='" + producer + "'")
                .add("price=" + price)
                .add("describe='" + describe + "'")
                .toString();
    }
}
