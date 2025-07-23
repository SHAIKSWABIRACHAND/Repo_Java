package telusuko.Enum;

public enum Laptop {
    Macbook(2000), XPS(2200),surface(1500),Thinkpad(1800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }
    

    private Laptop() {
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    

}
