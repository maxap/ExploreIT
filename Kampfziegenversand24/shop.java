package modules;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Shop {
    static ArrayList<product> products = new ArrayList<>();
    static ArrayList<shoppingcartItem> warenkorb = new ArrayList<>();

    static Scanner eingabe = new Scanner(System.in);
    public static void main(String[] args)  {
        newProdukt("Betsy","badische Herrenziege",120,true);
        newProdukt("Jimmidy","reinländischer Reudde",80,true);
        newProdukt("Hanna","saarländische abgenutze Zuchtziege", 40, false);
        showProducts();
        kaufen();
    }

    public static void newProdukt(String name,String art, int price, boolean male)  {
        product Produkt;
        Produkt = new product(name,art,price,male);
        products.add(Produkt);
    }

    public double getPriceFromList(int id)  {
        return products.get(id).getPrice();
    }

    public static void showProducts()  {
        for(int i = 0; i<products.size();i++)   {
            products.get(i).display();
        }
    }
    public static void kaufen()   {
        System.out.println("Welche unserer Ziegen möchten Sie erwerben? Bitte geben sie die ID an");
        int id = eingabe.nextInt();
        System.out.println("Bitte geben sie die Ziegenmenge an");
        int amount = eingabe.nextInt();
        shoppingcartItem warenkorbitem = new shoppingcartItem(id, amount);
        warenkorb.add(warenkorbitem);
        int total=0;
        for(int i = 0; i<warenkorb.size(); i++)    {
            total += warenkorb.get(i).getSubtotal();
            System.out.println(total);
        }
        System.out.println("Aktueller Gesamtpreis: "+total+" €");
    }
}
