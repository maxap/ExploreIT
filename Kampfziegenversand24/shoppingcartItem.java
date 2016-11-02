package modules;

public class shoppingcartItem
{
    private int id;
    private int product;
    private int amount;
    private double subtotal;
    private static int index;
    private static int gesamtproduktmenge;

    public shoppingcartItem(int product, int amount)
    {
        id = index;
        index++;
        gesamtproduktmenge += amount;
        double subtotal = Shop.products.get(product).getPrice()*amount;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
