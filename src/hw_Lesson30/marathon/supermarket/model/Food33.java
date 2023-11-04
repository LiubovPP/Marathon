package hw_Lesson30.marathon.supermarket.model;

public class Food33 extends Product33 {
    private String expDate;

    public Food33(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Food33{" +
                "expDate='" + expDate + '\'' +
                '}';
    }
}
