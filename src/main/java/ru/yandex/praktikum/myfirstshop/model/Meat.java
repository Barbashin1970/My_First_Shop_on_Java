package ru.yandex.praktikum.myfirstshop.model;

public class Meat extends Food {        // Наследник класса Food: Meat
                                        // Класс Meat — для мяса. Это класс с конструктором.
    public Meat(int amountFood, double priceFood) {       // Конструктор принимает два входных параметра — количество и цену.
        super(amountFood, priceFood, false);   // И устанавливает для флага isVegetarian правильное значение.
    }
    @Override
    public double getDiscount() {
        return 0;            // классы, реализующие интерфейс Discountable, возвращают значение 0 в методе getDiscount,
    }
}
