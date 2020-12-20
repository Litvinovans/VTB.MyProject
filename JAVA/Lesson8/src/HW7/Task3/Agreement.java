package HW7.Task3;
// класс договор
public class Agreement {
    protected int number;
    protected String date;
    protected String[] productlist;

    public Agreement (int number, String date, String[] productlist){
        this.number=number;
        this.date=date;
        this.productlist=productlist;
    }
    public void display() {
        int amountList = productlist.length;
        System.out.printf("Договор:\nНомер: %s от: %s \n",number, date);
        System.out.println("Список товаров:");
        for (int i = 0; i < amountList; i++) {
            System.out.printf("%s. %s \n",i,productlist[i]);
        }
    }

}
