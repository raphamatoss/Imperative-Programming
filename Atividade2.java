import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static String arquivo = "pessoas.txt";

    public static void main (String[] args) {
        iniciarPrograma();
        int opcao = 0;

        do {
            System.out.println("1 => Inserir pessoa");
            System.out.println("2 => Inserir bens de uma pessoa");
            System.out.println("3 => Excluir pessoa");
            System.out.println("4 => Excluir bens de uma pessoa");
            System.out.println("5 => Listar pessoas");
            System.out.println("6 => Consultar pessoas");
            System.out.println("7 => Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case(1):
                    inserirPessoa();
                    break;
                case(2):
                        inserirBens();
                    break;
                case(3):
                    excluirPessoa();
                    break;
                case(4):
                    excluirBens();
                    break;
                case(5):
                    listarPessoas();
                    break;
                case(6):
                    consultarPessoas();
                    break;
                default:
                    if (opcao == 7) {
                        System.out.println("Encerrando o programa...");
                        encerrarPrograma();
                    }
                    else {
                        System.out.println("Opcao invalida.");
                    }
            }
        } while(opcao != 7);
    }

    static void inserirPessoa() {
        try {
            System.out.printf("Insira o codigo da pessoa: ");
            long codigo = sc.nextLong();

            if (!codigoPessoaDisponivel(codigo)) {
                System.out.println("Pessoa já cadastrada!");
                inserirPessoa();
                return;
            }

            System.out.printf("Insira o nome da pessoa: ");
            String nome = sc.next();

            Pessoa pessoa = new Pessoa(codigo, nome);
            pessoas.add(pessoa);

            System.out.println("Pessoa adicionada com sucesso!");
        }
        catch (InputMismatchException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static void inserirBens() {

        try {
            System.out.printf("Insira o codigo da pessoa: ");
            long codigoPessoa = sc.nextLong();

            for (int i = 0; i < pessoas.size(); i++) {
                if (pessoas.get(i).getCodigo() == codigoPessoa) {
                    int codigoBem;
                    String nomeBem;
                    double valorBem;

                    System.out.printf("Insira o codigo do bem: ");
                    codigoBem = sc.nextInt();

                    if (!codigoBemDisponivel(codigoBem)) {
                        System.out.println("Código já em uso!");
                        break;
                    }
                    System.out.printf("Insira o nome do bem: ");
                    nomeBem = sc.next();
                    try {
                        System.out.printf("Insira o valor do bem: ");
                        valorBem = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Valor invalido: " + e.getMessage());
                        valorBem = sc.nextDouble();
                    }

                    Bem novoBem = new Bem(codigoBem, nomeBem, valorBem);

                    pessoas.get(i).adicionarBem(novoBem);

                    System.out.println("Bem adicionado com sucesso!");
                }
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static void excluirPessoa() {
        System.out.printf("Insira o codigo da pessoa: ");
        long codigo = sc.nextLong();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo)
                pessoas.remove(pessoas.get(i));
            System.out.println("Pessoa removida com sucesso!");
        }
    }

    static void excluirBens() {
        System.out.printf("Insira o código da pessoa: ");
        long codigo = sc.nextLong();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                if (!pessoas.get(i).getBens().isEmpty()) {
                    System.out.printf("Os bens de %s são: \n", pessoas.get(i).getNome());
                    System.out.println("Cod Bem   Nome do Bem    Valor ");
                    for (int j = 0; j < pessoas.get(i).getBens().size(); j++) {
                        System.out.printf("%d          %s       %.2f\n", pessoas.get(i).getBens().get(j).getCodigo(),
                        pessoas.get(i).getBens().get(j).getNome(), pessoas.get(i).getBens().get(j).getValor());
                    }
                    System.out.printf("\nInsira o codigo de qual deseja remover: ");
                    int codigoBem = sc.nextInt();

                    for (int j = 0; j < pessoas.get(i).getBens().size(); j++) {
                        if (pessoas.get(i).getBens().get(j).getCodigo() == codigoBem) {
                            pessoas.get(i).removerBem(pessoas.get(i).getBens().get(j)); //
                        }
                        else {
                            System.out.println("Codigo invalido.");
                        }
                    }
                }
                else {
                    System.out.println("A pessoa selecionada não possui bens.");
                }
            }
        }
    }

    static void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.printf("Ainda não há pessoas cadastradas. Deseja cadastrar? Digite 0 para sim e 1 para não: ");
            int opcao = sc.nextInt();
            if (opcao == 0) {
                inserirPessoa();
                return;
            }
        }
        else {
            System.out.println("Cod Pessoa   Nome da Pessoa   Val Tot Bens");
            for (int i = 0; i < pessoas.size(); i++) {
                System.out.printf("%d           %s          %.2f\n", pessoas.get(i).getCodigo(), pessoas.get(i).getNome(),
                valorTotalBens(pessoas.get(i).getBens()));
            }
            System.out.println();
        }
    }

    static void consultarPessoas() {
        System.out.printf("Insira o codigo da pessoa: ");
        long codigo = sc.nextLong();

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                System.out.printf("Codigo da pessoa: %d  Nome da pessoa: %s\n", codigo, pessoas.get(i).getNome());
                System.out.println("Cod Bem   Nome do Bem   Valor");
                for (int j = 0; j < pessoas.get(i).getBens().size(); j++) {
                    System.out.printf("%d          %s       %.2f\n", pessoas.get(i).getBens().get(j).getCodigo(),
                    pessoas.get(i).getBens().get(j).getNome(), pessoas.get(i).getBens().get(j).getValor());
                }
                System.out.println();
            }
        }
    }

    static void encerrarPrograma() {
        System.out.printf("Os dados estão sendo salvos...");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            writer.write(formatacao());
        }
        catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }

    static void iniciarPrograma() {
        System.out.println("O programa está sendo inicializado...");

        File file = new File(arquivo);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String dadosGerais[] = linha.split(" ");
                    String dadosPessoa[] = dadosGerais[0].split(";");

                    long codigoPessoa = Long.parseLong(dadosPessoa[0]);
                    String nomePessoa = dadosPessoa[1];

                    Pessoa pessoa = new Pessoa(codigoPessoa, nomePessoa);

                    if (dadosGerais.length > 1) { // previne o erro de acessar um index inexistente, caso haja alguma pessoa sem bens
                        String dadosBens[] = dadosGerais[1].split(";"); // cada bem tem 3 atributos entao o tamando de dadosBens[] deve ser 3*n
                        for (int i = 0; i < dadosBens.length; i += 3) {
                            int codigoBem = Integer.parseInt(dadosBens[i]);
                            String nomeBem = dadosBens[i + 1];
                            double valorBem = Double.parseDouble(dadosBens[i + 2]);

                            Bem bem = new Bem(codigoBem, nomeBem, valorBem);
                            pessoa.adicionarBem(bem);
                        }
                    }

                    pessoas.add(pessoa);
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler arquivo: " + e.getMessage());
            }
            catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }

    // faz a formatação dos dados a serem impressos no arquivo
    static String formatacao() {
        String formatado = "";
        for (int i = 0; i < pessoas.size(); i++) {
            formatado += pessoas.get(i).getCodigo() + ";" + pessoas.get(i).getNome() + " ";
            for (int j = 0; j < pessoas.get(i).getBens().size(); j++) {
                if (j == pessoas.get(i).getBens().size()-1 && j != 0) { // esse permite que quando o ultimo bem da pessoa for escrito, os dados da proxima pessoa começará na proxima linha
                    formatado += ";" + pessoas.get(i).getBens().get(j).getCodigo() + ";" +
                    pessoas.get(i).getBens().get(j).getNome() + ";" + pessoas.get(i).getBens().get(j).getValor() + "\n";
                }
                else if (j == 0 && pessoas.get(i).getBens().size() == 1) {
                    formatado += pessoas.get(i).getBens().get(j).getCodigo() + ";" +
                    pessoas.get(i).getBens().get(j).getNome() + ";" + pessoas.get(i).getBens().get(j).getValor() + "\n";
                }
                else if (j == 0) {
                    formatado += pessoas.get(i).getBens().get(j).getCodigo() + ";" +
                    pessoas.get(i).getBens().get(j).getNome() + ";" + pessoas.get(i).getBens().get(j).getValor();
                }
                else {
                    formatado += ";" + pessoas.get(i).getBens().get(j).getCodigo() + ";" +
                    pessoas.get(i).getBens().get(j).getNome() + ";" + pessoas.get(i).getBens().get(j).getValor();
                }
            }
            if (pessoas.get(i).getBens().isEmpty()) {
                formatado += "\n";
            }
        }
        return formatado;
    }

    static double valorTotalBens(ArrayList<Bem> bens) {
        double aux = 0;

        if (bens.isEmpty())
            return 0;
        else {
            for (int i = 0; i < bens.size(); i++) {
                aux += bens.get(i).getValor();
            }
            return aux;
        }
    }

    // checa se alguém já possui um bem com oo código passado, se sim, retorna false, se nao, retorna true
    static boolean codigoBemDisponivel(int codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            for (int j = 0; j < pessoas.get(i).getBens().size(); j++) {
                if (pessoas.get(i).getBens().get(j).getCodigo() == codigo)
                    return false;
            }
        }
        return true;
    }

    // checa se já há uma pessoa com um devido código, se sim, retorna false, se nao, retorna true
    static boolean codigoPessoaDisponivel(long codigo) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo)
                return false;
        }
        return true;
    }
}

class Pessoa {
    private long codigo;
    private String nome;
    private ArrayList<Bem> bens;

    public Pessoa () {
        this.bens = new ArrayList<>();
    }

    public Pessoa (long codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarBem(Bem umBem) {
        this.bens.add(umBem);
    }

    public void adicionarNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void removerBem(Bem umBem) {
        if (this.bens.contains(umBem))
            this.bens.remove(umBem);
    }

    public long getCodigo() {
        return this.codigo;
    }

    public ArrayList<Bem> getBens() {
        return this.bens;
    }

    public String getNome() {
        return this.nome;
    }
}

class Bem {
    private int codigo;
    private String nome;
    private double valor;

    public Bem (int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }
}