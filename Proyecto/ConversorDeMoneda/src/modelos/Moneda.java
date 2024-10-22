package modelos;

public class Moneda {


    public record Moneda(String base_code, String target_code, double conversion_rate) {

    }

}
