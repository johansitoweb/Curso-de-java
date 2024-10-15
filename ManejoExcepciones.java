// Manejo de excepciones
try {
    int division = 10 / 0; // Esto generará una excepción
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Este bloque se ejecuta siempre");
}
