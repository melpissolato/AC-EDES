package ac14;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private CarteiraTrabalho carteira;

    public Funcionario(String nome, String cargo, double salario, CarteiraTrabalho carteira) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public CarteiraTrabalho getCarteira() {
        return carteira;
    }

    @Override
    public String toString() {
        return "fun {" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario= R$ " + salario +
                ", " + carteira.toString() +
                '}';
    }
    }