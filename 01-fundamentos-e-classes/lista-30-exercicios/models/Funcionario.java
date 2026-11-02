public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private Departamento departamento;

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
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
