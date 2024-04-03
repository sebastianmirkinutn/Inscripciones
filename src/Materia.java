import java.util.Set;
public class Materia {
    private static String codMateria;
    private static String nombre;
    private static Set<Materia> correlativas;

    public Set<Materia> getCorrelativas(){
        return correlativas;
    }

    public Materia(String codMateria, String nombre, Set<Materia> correlativas){
        this.codMateria = codMateria;
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
}
