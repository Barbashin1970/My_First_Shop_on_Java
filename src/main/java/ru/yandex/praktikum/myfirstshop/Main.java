package ru.yandex.praktikum.myfirstshop;

import ru.yandex.praktikum.myfirstshop.model.Apple;
import ru.yandex.praktikum.myfirstshop.model.Food;
import ru.yandex.praktikum.myfirstshop.model.Meat;
import ru.yandex.praktikum.myfirstshop.service.ShoppingCart;

public class Main {        // В методе main реализуй следующую логику:

    public static void main(String[] args) {

        Food[] foods = {                                                // Инициализируем данные. Для этого создаём объекты:
                new Meat(5, 100),                   //  Мясо в количестве 5 кг по цене 100 рублей за кг;
                new Apple(10, 50, "red"),    //  Яблоки красные в количестве 10 кг по цене 50 рублей;
                new Apple(8, 60, "green")    //  Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        };
        // Создали массив продуктов из этих элементов

        ShoppingCart shoppingCart = new ShoppingCart(foods);                // проинициализировали корзину с помощью созданного массива.

        System.out.println("Рады видеть вас в нашем магазине First Shop");
                                                                             // Посчитали и вывели на экран значения для созданной корзины:
        System.out.println("Общая сумма продуктов в корзине без скидки, в рублях: " + shoppingCart.getTotalPrice());

        System.out.println("Общая сумма продуктов в корзине со скидкой, в рублях: " + shoppingCart.getTotalPriceWithDiscount());

        System.out.println("Общая сумма вегетарианских продуктов в корзине, в рублях: " + shoppingCart.getTotalPriceVegetarian());
    }

    //    Все переменные класса должны быть недоступны извне, если не указано иное.
    //    Доступ к ним реализуй через известные тебе методы:
    //    создавай только те, которые действительно нужны для реализации описанной функциональности.
}

