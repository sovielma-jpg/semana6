package modelo;

public class Pedido {
    private String id;
    private String direccion;
    private String tipo;

    public Pedido(String id, String direccion, String tipo) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
