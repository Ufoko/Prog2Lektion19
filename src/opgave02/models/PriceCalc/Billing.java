package opgave02.models.PriceCalc;

import opgave02.models.Order;

public interface Billing {

    int CalculateStudent(Order order);

    int CalculateAnsat(Order order);

    int CalculateNormal(Order order);


}
