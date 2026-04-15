import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        int cantidadEstudiantes = 1000000; 
        int cantidad = 1_000_000;

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);

        // for (Estudiante est : estudiantes ) {
        //     System.out.println(est.nombre);
        // }


        String nombreBuscar = "Estudiante_20000";
        int intentos = 0; 
        for(Estudiante est: estudiantes){
            if(est.nombre.equals(nombreBuscar)) {
                System.out.println("EXISTE");
                break; 
            }
            else {
                intentos++; 
            }
        }
        System.out.println(intentos);
        System.out.println("FIN");
        
    } 
} 
=======
        int[] array = new int[]{1,2,3,4,5,6,}; 
        System.out.println(array[0]);
        System.out.println(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
>>>>>>> cba6b51445e079d7cd28251b824a98b779b80b30
