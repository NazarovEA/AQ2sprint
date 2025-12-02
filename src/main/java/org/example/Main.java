package org.example;
import model.Apple;
import model.Meat;
import model.Food;
import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;
import java.util.Arrays;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //Инициализируй данные. Для этого создай объекты:
        //Мясо в количестве 5 кг по цене 100 рублей за кг;
        Meat meat = new Meat(5, 100);
        //Яблоки красные в количестве 10 кг по цене 50 рублей;
        Apple appleRed = new Apple(10, 50, COLOUR_RED);
        //Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Apple appleGreen = new Apple(8, 60, COLOUR_GREEN);

        // Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        Food[] products = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(products);

//Посчитай и выведи на экран значения для созданной корзины:
//общую сумму товаров без скидки,
//общую сумму товаров со скидкой,
//сумму всех вегетарианских продуктов без скидки.
        System.out.println("Общая сумма товаров без скидки: " + cart.getNotDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVeganNotDiscount());
    }
}