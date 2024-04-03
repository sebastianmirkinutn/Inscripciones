import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.lang.Integer;


public class Alumno {
    private static int legajo;
    private static String nombre;
    private Map<Materia,Integer> materiasCursadas;
    public boolean aprobo(Materia materia){
        return materiasCursadas.containsKey(materia) &&  materiasCursadas.get(materia) >= 6;
    }
    public void agregarMateriaCursada(Materia materia, Integer nota){
        materiasCursadas.put(materia, nota);
    }
    public Alumno(Integer legajo, String nombre, Map<Materia, Integer> materiasCursadas){
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasCursadas = materiasCursadas;
    }
    public Alumno(Integer legajo, String nombre){
        this.legajo = legajo;
        this.nombre = nombre;
        materiasCursadas = new HashMap<Materia, Integer>();
    }
}
