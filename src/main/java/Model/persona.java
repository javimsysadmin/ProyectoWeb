package Model;
public class persona {
    private String nombre;
    private String apellido;
    private int edad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Constructor
    public persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.apellido = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
