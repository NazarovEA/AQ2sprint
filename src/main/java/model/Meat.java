package model;

public class Meat extends Food {
    // конструктор принимает два параметра кол-во и цену и не веган
    public Meat(int amount, double price) {
        super(amount, price, false);
    }
}
