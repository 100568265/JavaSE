package demo7;
//因为超类Object类中的toString()方法无法满足要求，所以子类Book重写toString方法
//重写toString方法输出类中所有属性的值
public class Book {
    int id;
    String name;
    double price;
    String author;

    public Book() {
    }

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
