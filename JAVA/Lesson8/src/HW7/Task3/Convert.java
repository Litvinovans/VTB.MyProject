package HW7.Task3;

public class Convert {
    public Act a2;

    static Act Convert_from_Agreement_to_Act(Agreement a1){
        Act a2 = new Act();
        a2.number = a1.number;
        a2.date = a1.date;
        a2.productlist = a1.productlist;
        return a2;
    }
}
