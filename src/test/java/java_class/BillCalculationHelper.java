package java_class;

import java.text.DecimalFormat;

public class BillCalculationHelper {
    public static double CalculateBillForCustomer(double BillAmount,double TaxRate){
    double FinalBillAmount = BillAmount*(1+TaxRate/100);
        DecimalFormat df = new DecimalFormat("0.00");
        String result = df.format(FinalBillAmount);
        return Double.parseDouble(result);
    }
}
