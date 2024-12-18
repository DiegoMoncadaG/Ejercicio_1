package Ejercicio_18;

public class empleado {

    private String codigo;
    private String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    public empleado(String codigo, String nombres, int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * porcentajeRetencion / 100);
    }

    public void mostrarInformacion() {
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: " + String.format("%.2f", calcularSalarioBruto()));
        System.out.println("Salario Neto: " + String.format("%.2f", calcularSalarioNeto()));
    }
}
