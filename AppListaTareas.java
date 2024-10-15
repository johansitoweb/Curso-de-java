import java.util.ArrayList;  
import java.util.Scanner;  

class Tarea {  
    private String nombre;  
    private boolean completada;  

    public Tarea(String nombre) {  
        this.nombre = nombre;  
        this.completada = false;  
    }  

    public String getNombre() {  
        return nombre;  
    }  

    public boolean isCompletada() {  
        return completada;  
    }  

    public void marcarComoCompletada() {  
        this.completada = true;  
    }  

    @Override  
    public String toString() {  
        return nombre + (completada ? " [Completada]" : " [Pendiente]");  
    }  
}  

public class AppListaTareas {  
    private static ArrayList<Tarea> tareas = new ArrayList<>();  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int opcion;  

        do {  
            System.out.println("Seleccione una opción:");  
            System.out.println("1. Agregar tarea");  
            System.out.println("2. Listar tareas");  
            System.out.println("3. Marcar tarea como completada");  
            System.out.println("0. Salir");  
            opcion = scanner.nextInt();  
            scanner.nextLine(); // Limpiar el búfer  

            switch (opcion) {  
                case 1:  
                    System.out.print("Ingrese el nombre de la tarea: ");  
                    String nombreTarea = scanner.nextLine();  
                    tareas.add(new Tarea(nombreTarea));  
                    System.out.println("Tarea agregada.");  
                    break;  
                case 2:  
                    listarTareas();  
                    break;  
                case 3:  
                    System.out.print("Ingrese el número de la tarea para marcar como completada: ");  
                    int numeroTarea = scanner.nextInt();  
                    if (numeroTarea > 0 && numeroTarea <= tareas.size()) {  
                        tareas.get(numeroTarea - 1).marcarComoCompletada();  
                        System.out.println("Tarea marcada como completada.");  
                    } else {  
                        System.out.println("Número de tarea inválido.");  
                    }  
                    break;  
                case 0:  
                    System.out.println("Saliendo de la aplicación.");  
                    break;  
                default:  
                    System.out.println("Opción no válida. Inténtalo de nuevo.");  
            }  
        } while (opcion != 0);  

        scanner.close();  
    }  

    private static void listarTareas() {  
        if (tareas.isEmpty()) {  
            System.out.println("No hay tareas en la lista.");  
        } else {  
            System.out.println("Lista de tareas:");  
            for (int i = 0; i < tareas.size(); i++) {  
                System.out.println((i + 1) + ". " + tareas.get(i));  
            }  
        }  
    }  
}