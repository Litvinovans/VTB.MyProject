package Lesson16.Task14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBasket implements Basket {

    ArrayList<String> list;
    ArrayList<Integer> q;

    public MyBasket () {
        this.list = new ArrayList<>();
        this.q = new ArrayList<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        list.add(product);
        q.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        int i = list.indexOf(product);
        list.remove(product);
        q.remove(i);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int i = list.indexOf(product);
        q.set(i,quantity);
    }

    @Override
    public void clear() {
        list.clear();
        q.clear();
    }

    @Override
    public List<String> getProducts() {
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        int i = list.indexOf(product);
        return q.get(i);
    }

    public void print() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Iterator ii = list.iterator();
        Iterator ij = q.iterator();
        while(ii.hasNext()) {
            System.out.print("Наименование *"+ii.next()+"*, ");
            System.out.print("количество - "+ij.next()+" шт.\n");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }
}
