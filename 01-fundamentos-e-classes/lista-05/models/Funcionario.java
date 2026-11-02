public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private Departamento departamento;

    static double percentualReajusteGeral;

    public Funcionario(String nome, String cargo, double salario) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }

    public Funcionario(String nome, String cargo, double salario, Departamento departamento) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
        setDepartamento(departamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setSalario(double salario) {
        if (salario<0) {
            throw new RuntimeException("Salário inválido");
        }

        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void aumentarSalario(double percentual) {
        if (percentual<0) {
            throw new RuntimeException("Percentual inválido");
        }
        
        this.salario = salario * ((100+percentual)/100);
    }

    public void aumentarSalario(double percentual, double percentualAdicional) {
        aumentarSalario(percentual);

        if (percentualAdicional<0) {
            throw new RuntimeException("Percentual inválido");
        }

        aumentarSalario(percentualAdicional);
    }
}
