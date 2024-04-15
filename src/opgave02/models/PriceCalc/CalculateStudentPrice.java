package opgave02.models.PriceCalc;

import opgave02.models.Order;
import opgave02.models.products.Beer;

public class CalculateStudentPrice extends CalculatePrice {

    public int calculateOrder(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }

        return order.getTotalPrice();

    }
}
