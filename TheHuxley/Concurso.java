package TheHuxley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Concurso {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int vagas;
        char gabarito[] = new char[10];
        String nome;
        ConjuntoParticipantes participantes = new ConjuntoParticipantes();

        vagas = sc.nextInt();
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = Character.toUpperCase(sc.next().charAt(0));
        }

        while(true) {
            nome = sc.next();
            if (nome.equals("*"))
                break;
            Participante participante = new Participante(nome);

            for (int i = 0; i < gabarito.length; i++) {
                char resposta = Character.toUpperCase(sc.next().charAt(0));
                participante.adicionarGabarito(i, resposta);

                if (gabarito[i] == participante.getRespostas(i))
                    participante.adicionarAcerto();
            }
            participantes.adicionarParticipante(participante);
        }

        Collections.sort(participantes.getParticipantes(), (x, y) -> y.getAcertos() - x.getAcertos()); // como funciona essa comparação?
        //Collections.sort(participantes.getParticipantes(), (x, y) -> y.getNome() - x.getNome());

        for (int i = 0; i < participantes.getParticipantes().size(); i++) {
            if (i <= vagas-1) {
                System.out.println(participantes.getParticipante(i).getNome() + " " + participantes.getParticipante(i).getAcertos() + " Aprovado(a)");
            }
            else {
                System.out.println(participantes.getParticipante(i).getNome() + " " + participantes.getParticipante(i).getAcertos() + " Nao Aprovado(a)");
            }
        }
    }
}

class Participante {
    private String nome;
    private char respostas[];
    private int acertos;

    public Participante() {
        this.respostas = new char[10];
        this.acertos = 0;
    }

    public Participante(String nome) {
        this();
        this.nome = nome;
    }

    public void adicionarGabarito(int i, char c) {
        this.respostas[i] = c;
    }

    public void adicionarNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAcerto() {
        this.acertos = this.acertos+1;
    }
    public char getRespostas(int i) {
        return this.respostas[i];
    }

    public int getAcertos() {
        return this.acertos;
    }

    public String getNome() {
        return this.nome;
    }
}

class ConjuntoParticipantes {
    private ArrayList<Participante> participantes;

    public ConjuntoParticipantes() {
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public ArrayList<Participante> getParticipantes() {
        return this.participantes;
    }

    public Participante getParticipante(int i) {
        return this.participantes.get(i);
    }
}

//    public static void coletarInput(String nome, char[] gabarito, Participante participante) {
//        char resposta;
//
//        participante.adicionarNome(nome);
//        for (int i = 0; i < gabarito.length; i++) {
//            resposta = sc.next().charAt(0);
//            participante.adicionarGabarito(i, resposta);
//            calcularAcertos(gabarito, participante);
//        }
//        participante.adicionarParticipante(participante);
//    }
//
//    public static void calcularAcertos(char[] gabarito, Participante participante) {
//        for (int i = 0; i < gabarito.length; i++) {
//            if (gabarito[i] == participante.getRespostas(i)) {
//                participante.adicionarAcerto();
//            }
//        }
//    }