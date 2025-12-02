package service;

import model.Discountable;
import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    public final Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    //В классе ShoppingCart реализуй методы для работы с корзиной:
//получить общую сумму товаров в корзине без скидки,
    public double getNotDiscount() {
        double sumPrice = 0;
        for (Food product : products) {
            sumPrice += product.getAmount() * product.getPrice();
        }
        return sumPrice;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double getWithDiscount() {
        double sumPrice = 0;
        for (Food product : products) {
            sumPrice += (product.getAmount() * product.getPrice()) - (product.getAmount() * product.getPrice() * product.getDiscount());
        }
        return sumPrice;
    }


    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double getVeganNotDiscount() {
        double sumPrice = 0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                sumPrice += product.getAmount() * product.getPrice();
            }
        }
        return sumPrice;
    }
}