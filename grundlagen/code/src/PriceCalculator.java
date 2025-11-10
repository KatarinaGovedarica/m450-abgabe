public class PriceCalculator {

    public static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount = 0.0;

        if (extras >= 5) {
        addon_discount = 15.0;
        } else if (extras >= 3) {
        addon_discount = 10.0;
        } else {
        addon_discount = 0.0;
        }


        double basePart   = baseprice * (1.0 - discount / 100.0);
        double extrasPart = extraprice * (1.0 - addon_discount / 100.0);

        return basePart + specialprice + extrasPart;
    }
}
