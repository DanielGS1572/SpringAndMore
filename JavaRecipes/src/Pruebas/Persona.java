package Pruebas;

public class Persona {
    private String nombre;
    private Integer edad;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        return getNombre();
    }

}
