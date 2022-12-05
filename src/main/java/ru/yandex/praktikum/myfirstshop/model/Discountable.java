package ru.yandex.praktikum.myfirstshop.model;

public interface Discountable {

    // Интерфейс Discountable c единственным методом getDiscount.
    // Все классы, реализующие этот интерфейс,
    // возвращают значение 0 в методе getDiscount, если в задании не указано иное.

    double getDiscount();  // Он возвращает размер скидки — вещественное число.


}
