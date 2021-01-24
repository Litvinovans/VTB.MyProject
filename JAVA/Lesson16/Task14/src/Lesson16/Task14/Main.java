package Lesson16.Task14;

public class Main {

    public static void main(String[] args) {

        MyBasket mb = new MyBasket();
        mb.addProduct("Юбка",1);
        mb.addProduct("Носки",2);
        mb.addProduct("Футболка",3);
        mb.addProduct("Шарф",2);
        mb.addProduct("Резинка для волос",50);
        System.out.println("~~~~~ Первоначальная корзина ~~~~~");
        mb.print();

        System.out.println("~~~~~ Корзина после удаления продукта *Шарф* ~~~~~");
        mb.removeProduct("Шарф");
        mb.print();

        System.out.println("~~~~~ Корзина после изменения количества продукта *Носки* ~~~~~");
        mb.updateProductQuantity("Носки",10);
        mb.print();
        System.out.println("~~~~~ Печать текущего количества продукта *Носки* ~~~~~");
        System.out.println(mb.getProductQuantity("Носки"));

        System.out.println("~~~~~ Корзина после изменения количества продукта *Резинка для волос* ~~~~~");
        mb.updateProductQuantity("Резинка для волос",33);
        mb.print();
        System.out.println("~~~~~ Печать текущего количества продукта *Резинка для волос* ~~~~~");
        System.out.println(mb.getProductQuantity("Резинка для волос"));

        System.out.println("~~~~~ Печать текущего перечня продуктов корзины* ~~~~~");
        System.out.println(mb.getProducts());

        System.out.println("~~~~~ Очищение корзины ~~~~~");
        mb.clear();
        mb.print();
    }
}
