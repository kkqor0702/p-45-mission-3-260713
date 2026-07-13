public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.name = "사과";
        p1.price = 1000;
        p1.stock = 5;

        Product p2 = new Product();

        p2.name = "바나나";
        p2.price = 500;
        p2.stock = 3;

        p1.sell(3);
        p1.sell(3);
        p1.restock(10);

        p2.sell(1);

        System.out.println(p1.name + " 재고 총 가치: " + p1.stockValue() + "원");
        System.out.println(p2.name + " 재고 총 가치: " + p2.stockValue() + "원");
    }
}
