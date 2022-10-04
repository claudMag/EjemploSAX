public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private float cilindrada;

    public Coche() {
    }

    public Coche(int id, String nombre, String creador, float cilindrada) {
        this.id = id;
        this.marca = nombre;
        this.modelo = creador;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                '}';
    }
}
