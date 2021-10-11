public class Basket {

    private static int count = 0;
    private static int totalPriceBaskets = 0;
    private static int totalItemsBaskets = 0;
    private String items = "";
    private int totalPrice = 0;
    private int totalItems = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }


    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalPrice() {
        return totalPriceBaskets;
    }
    public static int getTotalItems () {return totalItemsBaskets; }

    public static int getAverageItemsPrice() {return totalPriceBaskets/totalItemsBaskets;}

    public static int getAverageBasketsPrice() {return totalPriceBaskets/count;}

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseTotalPriceBaskets(int totalPriceBaskets) {
        Basket.totalPriceBaskets = Basket.totalPriceBaskets + totalPriceBaskets;
    }

    public static void increaseTotalItemsBaskets(int totalItemsBaskets) {
        Basket.totalItemsBaskets = Basket.totalItemsBaskets + totalItemsBaskets;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        totalItems = totalItems + count;
        increaseTotalPriceBaskets(count*price);
        increaseTotalItemsBaskets(count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalItems = 0;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
