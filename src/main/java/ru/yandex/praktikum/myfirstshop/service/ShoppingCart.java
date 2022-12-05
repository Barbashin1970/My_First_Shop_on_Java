package ru.yandex.praktikum.myfirstshop.service;

import ru.yandex.praktikum.myfirstshop.model.Food;

public class ShoppingCart {       // класс для корзины — ShoppingCart.

    private Food[] foods;         // Добавь в него поле — массив элементов из объектов типа Food.

    public ShoppingCart(Food[] foods) {      // конструктор с одним параметром — массивом элементов Food.

        this.foods = foods;                  // С его помощью создадим объект корзины.
    }

    // В классе ShoppingCart реализуй методы для работы с корзиной:

     public double getTotalPrice() {         // - получить общую сумму товаров в корзине без скидки,
         double totalPrice = 0;

         for (int i = 0; i < foods.length; i++) {
             totalPrice += foods[i].getTotalPrice();
         }
         return totalPrice;
     }

    public double getTotalPriceWithDiscount() {    // -- получить общую сумму товаров в корзине со скидкой,
        double totalPrice = 0;

        for (int i = 0; i < foods.length; i++) {
            totalPrice += foods[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }
    public double getTotalPriceVegetarian() {    // --- получить общую сумму всех вегетарианских продуктов в корзине без скидки.
        double totalPrice = 0;

        for (int i = 0; i < foods.length; i++) {
            totalPrice += foods[i].getTotalPriceVegetarian();
        }
        return totalPrice;
    }

}


//  public void setFoods(Food[] foods) {     // сеттер - не используется
//    this.foods = foods;
// }
//
//  public Food[] getFoods() {               // геттер - не используется
//    return foods;
// }

