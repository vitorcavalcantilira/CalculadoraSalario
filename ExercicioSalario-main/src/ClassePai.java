public class ClassePai implements CalculadoraDeSalarioLiquido {

    private static final double salarioMinimo = 1302;
    protected double descontos;
    private double bonus;

    public ClassePai() {
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        double salarioLiquido = 0;
        if (salarioBruto < salarioMinimo) {
            throw new RuntimeException("O salario bruto não pode ser menor do que o mínimo");
        }
        if (bonus > 1000) {
            throw new RuntimeException("O bônus não pode ser maior do que R$1000.00");
        }
        if (salarioBruto > salarioMinimo && bonus <= 1000) {
            salarioLiquido = salarioBruto - descontos;
        }
        return salarioLiquido;
    }
}
