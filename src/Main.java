//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Materia algoritmos = new Materia("1", "Algoritmos y Estructura de Datos", new HashSet<>());
        Materia discreta = new Materia("3", "Matemática Discreta", new HashSet<>());
        Materia paradigmas = new Materia("2", "Paradigmas de Programación", new HashSet<>(){{add(algoritmos);}});
        Materia superior = new Materia("4", "Matemática Superior", new HashSet<>(){{add(discreta);add(paradigmas);}});

        Alumno rodrigo = new Alumno(20,"Rodrigo", new HashMap<Materia,Integer>());
        rodrigo.agregarMateriaCursada(discreta, 7);
        Inscripcion inscripcionRodrigo = new Inscripcion(rodrigo, new HashSet<Materia>(){{add(algoritmos);}});

        Alumno martin = new Alumno(32, "Martin", new HashMap<Materia, Integer>());
        martin.agregarMateriaCursada(discreta, 5);
        martin.agregarMateriaCursada(algoritmos, 7);
        Inscripcion inscripcionMartin = new Inscripcion(martin, new HashSet<Materia>(){{add(paradigmas);}});

        Alumno sofia = new Alumno(34, "Sofia", new HashMap<Materia, Integer>());
        sofia.agregarMateriaCursada(discreta, 9);
        sofia.agregarMateriaCursada(algoritmos, 7);
        Inscripcion inscripcionSofia = new Inscripcion(sofia, new HashSet<Materia>(){{add(paradigmas);add(superior);}});


        System.out.println(inscripcionRodrigo.aprobada());
        System.out.println(inscripcionMartin.aprobada());
        System.out.println(inscripcionSofia.aprobada());
    }
}