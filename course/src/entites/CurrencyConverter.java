package course.src.entites;

public class CurrencyConverter {

    public static final double iof = 6.0;

    public static double convert(double cotacao, double compra) {
        
        return cotacao * compra + ((cotacao * compra) * (iof / 100));
    }
}
