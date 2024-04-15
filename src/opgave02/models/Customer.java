package opgave02.models;

import opgave02.models.PriceCalc.Billing;

public class Customer {
    private BarTab tab;
    private Billing billing;


    public Customer(Billing billing) {
        this.billing = billing;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        int EmployeeDiscount = 10; //in %
        int ajustedPrice = 0;


        tab.addItem(new BarTabItem(order, ajustedPrice));
    }



    public BarTab getBarTab() {
        return tab;
    }
}
