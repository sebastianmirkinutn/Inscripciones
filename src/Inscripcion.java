import java.util.Set;


public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;
    public boolean aprobada(){
        boolean aprobada = true;
        for(Materia materia:materias){
            for(Materia materiaCorrelativa:materia.getCorrelativas()){
                aprobada = aprobada && alumno.aprobo(materiaCorrelativa);
            }
        }
        return aprobada;
    }
    public Inscripcion(Alumno alumno, Set<Materia> materias){
        this.alumno = alumno;
        this.materias = materias;
    }
}
