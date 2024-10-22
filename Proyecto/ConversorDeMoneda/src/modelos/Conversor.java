package modelos;

public class Conversor {


    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.text.DecimalFormat;

    private double resultado;

    public Conversor() {
    }

    public double convertir(double conversion_rate, double valorAConvertir) {
        this.resultado = conversion_rate * valorAConvertir;
        return Math.floor(resultado * 100) / 100;
    }

}