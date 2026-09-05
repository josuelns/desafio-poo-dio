import com.bootcamp.modelo.Bootcamp;
import com.bootcamp.modelo.Curso;
import com.bootcamp.modelo.Desenvolvedor;
import com.bootcamp.modelo.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Curso javaBasico = new Curso(
                "Fundamentos Java",
                "Sintaxe, tipos e estruturas de controle",
                6
        );

        Curso spring = new Curso(
                "Spring Boot",
                "APIs REST e injeção de dependência",
                10
        );

        Mentoria revisao = new Mentoria(
                "Mentoria de Projeto",
                "Revisão do projeto final",
                LocalDate.now().plusDays(7)
        );

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Backend Java",
                "Trilha completa para backend",
                60
        );

        bootcamp.incluirAtividade(javaBasico);
        bootcamp.incluirAtividade(spring);
        bootcamp.incluirAtividade(revisao);

        Desenvolvedor ana = new Desenvolvedor("Ana");
        Desenvolvedor pedro = new Desenvolvedor("Pedro");

        bootcamp.registrarParticipante(ana);
        bootcamp.registrarParticipante(pedro);

        ana.avancar();
        ana.avancar();

        pedro.avancar();
        pedro.avancar();
        pedro.avancar();

        System.out.println("=== Ana ===");
        System.out.println("Pendentes: " + ana.getPendentes());
        System.out.println("Finalizadas: " + ana.getFinalizadas());
        System.out.println("XP: " + ana.calcularXpTotal());

        System.out.println("=== Pedro ===");
        System.out.println("Pendentes: " + pedro.getPendentes());
        System.out.println("Finalizadas: " + pedro.getFinalizadas());
        System.out.println("XP: " + pedro.calcularXpTotal());
    }
}
