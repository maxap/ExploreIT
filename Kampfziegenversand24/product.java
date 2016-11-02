    // instance variables - replace the example below with your own
    private String name;
    private double price;
    private String type;
    private boolean isMale;
    private boolean reinrassig;
    private int id;
    private static int index;




    public product(String name, String type, double price, boolean gender)
    {
        this.name = name;
        this.type = type;
        this.price = price;
        this.isMale = gender;
        id = index;
        index++;
    }

    public void display()   {
        System.out.println("Diese ausgezeichnete "+( reinrassig ? "reinrassigen" : "mischrassigen")+(isMale ? " m\u00e4nnliche" : " weibliche und brutfähige" )+" Ziegen der Art " +type+ " sind von überragender Qualität, \nwerden sie garantiert* zufriedenstellen und sind für fast alle Alltagssituationen geeignet");
        System.out.println(" \n \n *nicht garantiert \n \n");
        System.out.println("G\u00fcnstige " +price+" Euro, Produkt-ID: "+id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isReinrassig() {
        return reinrassig;
    }

    public void setReinrassig(boolean reinrassig) {
        this.reinrassig = reinrassig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
