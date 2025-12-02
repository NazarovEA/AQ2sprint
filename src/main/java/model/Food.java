package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    public boolean isVegetarian;
    protected double discount;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //добавил , так как ругался на ошибку в ShoppingCart, что нет в этом классе
    public double getDiscount() {
        return discount;
    }

    //кол-во продуктов
    public int getAmount() {
        // геттер помогает получить значение переменной объекта из другого класса
        return amount;
    }

    //стоимсоть продукта
    public double getPrice() {
        // геттер помогает получить значение переменной объекта из другого класса
        return price;
    }

    //веган или нет
    public boolean isVegetarian() {
        // геттер помогает получить значение переменной объекта из другого класса
        return isVegetarian;
    }
}
