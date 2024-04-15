package opgave02.models.PriceCalc;

import opgave02.models.products.Beer;
/*
public class ThisIsBilling implements CalculatePrice {
     Billing billing;
     Order order;

    public ThisIsBilling(Order order) {
        this.billing = Billing.NORMAL;
        this.order = order;
    }

    public int calculatePriceNormal() {
        return order.getTotalPrice();
    }

    public int CalcPriceAnsat(double percent) {
        return (int) (calculatePriceNormal() - (calculatePriceNormal() / 100 * percent));
    }

    public int calculatePriceStudent() {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }


    @Override
    public  int calculateOrder(Order order) {
        int EmployeeDiscount = 10; //in %
        int ajustedPrice = 0;

        switch (billing) {
            case Billing.NORMAL:
                ajustedPrice = CalculateNormalPrice(order);
                break;
            case Billing.STUDENT:
                ajustedPrice = CalculateStudentPrice(order);
                break;
            case Billing.ANSAT:
                ajustedPrice = CalculateNormalPrice(order) - (CalculateNormalPrice(order) / 100 * EmployeeDiscount);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + billing);
        }
        return ajustedPrice;
    }



    private int CalculateNormalPrice(Order order) {
        return order.getTotalPrice();
    }


}
*/