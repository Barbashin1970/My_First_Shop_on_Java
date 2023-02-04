package ru.yandex.praktikum.myfirstshop.model;

import static ru.yandex.praktikum.myfirstshop.model.constants.Colour.COLOUR_APPLE_RED;

import static ru.yandex.praktikum.myfirstshop.model.constants.Discount.RED_APPLE_DISCOUNT;


public class Apple extends Food {       //      Наследник класса Food: Apple
                      // Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
    protected String colour;     // проверим - минимальная видимость поля
    public Apple(int amountFood, double priceFood, String colour) {   // Конструктор принимает три параметра: количество, цену и цвет яблок
        super(amountFood, priceFood, true);                //  — и устанавливает флаг isVegetarian.
        this.colour = colour;
    }
        @Override
        public double getDiscount () {
        if (COLOUR_APPLE_RED.equals(colour)) {     // Для красных яблок (colour равно "red") скидка должна быть равна 60%: .
        return RED_APPLE_DISCOUNT;                      // соответствующий метод возвращает значение 60
        }
        return 0;           // классы, реализующие интерфейс Discountable, возвращают значение 0 в методе getDiscount,
    }                       // если в задании не указано иное.

}
