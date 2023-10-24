public class Villano extends SuperHeroe {

    private String tipo;

    public Villano(String nombre, String poder, int fuerza, int velocidad, int resistencia, int energia) {
        super(nombre, poder, fuerza, velocidad, resistencia, energia);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
