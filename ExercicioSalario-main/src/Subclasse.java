public class Subclasse extends ClassePai {
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        double salarioLiquido = super.calcular(salarioBruto, descontos, bonus);
        if (bonus > 1000.0) {
            salarioLiquido = salarioLiquido * 0.5;
        } if(descontos> (salarioBruto/2)){
            throw new RuntimeException("Não pode ter DescTools");
        }  if(salarioBruto<1000.0){
        throw new RuntimeException("Salário abaixo do mínimo");
    }
        return salarioLiquido;
    }
}
