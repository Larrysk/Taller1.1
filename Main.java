
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}

class Potencia {
    public static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "Ingeniería");
        int potencia = Potencia.potenciaRecursiva(2, 5);

        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("Carrera del estudiante: " + estudiante.getCarrera());
        System.out.println("Potencia recursiva de 2 elevado a 5: " + potencia);
    }
}