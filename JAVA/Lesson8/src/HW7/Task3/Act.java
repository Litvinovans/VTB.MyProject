package HW7.Task3;
//класс акт
public class Act {
    protected int number;
    protected String date;
    protected String[] productlist;

    public Act (){}

    public Act (int number, String date, String[] productlist){
        this.number=number;
        this.date=date;
        this.productlist=productlist;
    }
    public void display() {
        int amountList = productlist.length;
        System.out.printf("Акт:\nНомер: %s от: %s \n",number, date);
        System.out.println("Список товаров:");
        for (int i = 0; i < amountList; i++) {
            System.out.printf("%s. %s \n",i,productlist[i]);
        }
    }
}
