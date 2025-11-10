public class TestPrice {

    static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) < 0.001;
    }

    public static void main(String[] args) {
        boolean test_ok = true;

        // base=20000, special=500, extra=4000, discount=8%
        test_ok &= approxEquals(PriceCalculator.calculatePrice(20000, 500, 4000, 5, 8), 22300.0); // 18400 + 3400 + 500
        test_ok &= approxEquals(PriceCalculator.calculatePrice(20000, 500, 4000, 3, 8), 22500.0); // 18400 + 3600 + 500  ✅
        test_ok &= approxEquals(PriceCalculator.calculatePrice(20000, 500, 4000, 2, 8), 22900.0); // 18400 + 4000 + 500
        test_ok &= approxEquals(PriceCalculator.calculatePrice(20000, 500, 4000, 10, 0), 23900.0); // 20000 + 3400 + 500

        if (test_ok) {
            System.out.println("✅ Alle Tests bestanden!");
        } else {
            System.out.println("❌ Mindestens ein Test ist fehlgeschlagen!");
        }
    }
}
