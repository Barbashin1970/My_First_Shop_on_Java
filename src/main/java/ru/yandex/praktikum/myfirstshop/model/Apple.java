package ru.yandex.praktikum.myfirstshop.model;

import ru.yandex.praktikum.myfirstshop.model.constants.Discount;

import static ru.yandex.praktikum.myfirstshop.model.constants.Colour.colourAppleRed;
import static ru.yandex.praktikum.myfirstshop.model.constants.Discount.redAppleDiscount;

public class Apple extends Food {       //      Наследник класса Food: Apple
                      // Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
    protected String colour;     // проверим - минимальная видимость поля
    public Apple(int amountFood, double priceFood, String colour) {   // Конструктор принимает три параметра: количество, цену и цвет яблок
        super(amountFood, priceFood, true);                //  — и устанавливает флаг isVegetarian.
        this.colour = colour;
    }
        @Override
        public double getDiscount () {
        if (colour.equals(colourAppleRed)) {     // Для красных яблок (colour равно "red") скидка должна быть равна 60%: .
        return redAppleDiscount;                      // соответствующий метод возвращает значение 60
        }
        return 0;           // классы, реализующие интерфейс Discountable, возвращают значение 0 в методе getDiscount,
    }                       // если в задании не указано иное.

}
