package Ejercicio_18;

import java.util.Scanner;

public class main_empleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el codigo del empleado: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de la hora trabajada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        double porcentajeRetencion = scanner.nextDouble();

        empleado empleado = new empleado(codigo, nombres, horasTrabajadas, valorHora, porcentajeRetencion);

        System.out.println("\nInformacion del Empleado:");
        empleado.mostrarInformacion();
    }
}
