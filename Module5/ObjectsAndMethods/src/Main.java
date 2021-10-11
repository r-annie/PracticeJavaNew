public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 5);
        basket.add("Olivie", 150, 3);

        Basket anotherb = new Basket();
        anotherb.add("Milk", 40, 1);
        anotherb.add("Olivie", 150, 2);

        System.out.println("Общая стоимость всех товаров всех корзин: " + Basket.getTotalPrice() + "\n" +
                "Общее количество всех товаров всех корзин: " + Basket.getTotalItems() + "\n" +
                "Средняя цена товаров во всех корзинах: " + Basket.getAverageItemsPrice() + "\n" +
                "Средняя стоимость одной корзины: "+ Basket.getAverageBasketsPrice());
    }
}
