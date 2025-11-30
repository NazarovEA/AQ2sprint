package model;
import model.Apple;
import model.Meat;
import static model.constants.Discount.DISCOUNT_RED;
import static model.constants.Colour.COLOUR_RED;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    } //если ред, то скидка 60% с возвратом

    public double getDiscount() {
        if (colour.equals(COLOUR_RED)) {
            return DISCOUNT_RED;
        } else {
            return 0;
        }
    }
}
