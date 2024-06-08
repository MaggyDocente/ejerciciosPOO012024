import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 7
        Scanner scanner = new Scanner(System.in);
        Double sueldoBruto = 0.0;

        System.out.printf("Ingrese tipo de empleado: \n1-Programador junior \n2-Programador Senior \n" +
                "3-Jefe de proyecto \n");
        Integer opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                sueldoBruto=950.0;
                break;
            case 2:
                sueldoBruto=1200.0;
            case 3:
                sueldoBruto=1600.0;
                break;
        }

        System.out.printf("Ingrese dias de viaje\n");
        Double diasDeViaje = scanner.nextDouble();
        Double dieta = diasDeViaje*30;
        Double sueldoNeto = sueldoBruto+dieta;

        System.out.printf("Ingrese su estado civil: \n1-Soltero \n2-Casado\n");
        Integer estadoCivil = scanner.nextInt();

        switch (estadoCivil){
            case 1:
                sueldoNeto= sueldoNeto-(sueldoNeto*0.25);
                break;
            case 2:
                sueldoNeto= sueldoNeto-(sueldoNeto*0.20);
                break;
        }

        System.out.printf("Sueldo: "+sueldoNeto);
    }
}