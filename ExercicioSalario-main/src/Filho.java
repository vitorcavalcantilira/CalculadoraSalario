public class Filho extends ClassePai {
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        double salarioLiquido=super.calcular(salarioBruto, descontos, bonus);;
        if (bonus<100) {
            salarioLiquido = salarioBruto + (salarioBruto * 0.3) - descontos;
        }
        if (descontos > 700) {
            descontos = 700.0;
            salarioLiquido = salarioBruto + bonus - descontos;
        }
        return salarioLiquido;
    }
}


