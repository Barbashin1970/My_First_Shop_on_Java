package ru.yandex.praktikum.myfirstshop.model;

public abstract class Food implements Discountable {    //   Класс Food — абстрактный класс с полями:

    //   Поля должны быть доступны только из классов-потомков.
    private int amountFood;         //  amount — количество продукта в килограммах (целое число);
    private double priceFood;      //  price — цена за единицу (вещественное число);
    private boolean isVegetarian;  //   isVegetarian — флаг, который показывает, вегетарианский ли продукт.

    protected Food(int amountFood, double priceFood, boolean isVegetarian) {
    this.amountFood = amountFood;
    this.priceFood = priceFood;
    this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {         // геттер подсчета стоимости корзины продуктов

        return amountFood * priceFood;              // количество * цена
    }
    public double getTotalPriceWithDiscount() {    // геттер подсчета цены со скидкой

        if (getDiscount() == 0) {                  // если скидка = 0
           return getTotalPrice();                 //  считаем по методу который без скидки
        }
        return getTotalPrice() * (100 - getDiscount())/ 100;   // иначе умножаем на коэффициент < 1
    }
    public double getTotalPriceVegetarian() {
        if (isVegetarian) {                                // если вегетарианский флаг = true, то
            return amountFood * priceFood;                 //  этот товар считаем в сумму
        }
        return 0;   // если вегетарианский флаг = false, то общую сумму не пополняем - тут ноль
    }

    @Override
    public double getDiscount() {
        return 0;     // классы, реализующие интерфейс Discountable, возвращают значение 0 в методе getDiscount,
    }


}






