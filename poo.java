// Definición de una clase
class Persona {
    String nombre; // Atributo

    // Método
    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

// Uso de la clase
Persona p = new Persona();
p.nombre = "Juan";
p.saludar(); // Imprime: Hola, mi nombre es Juan
