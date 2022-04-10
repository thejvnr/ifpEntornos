package practica1;
import java.util.Scanner;

/**
 * La aplicacion esta hecha para calcular las notas y comprobar si el alumno
 * aprueba o suspende una asignatura
 * clase Notas contiene los metodos usados para el calculo y mostrar las notas
 * que fueron introducidas
 * @author Claudio R Lemes S Junior
 * @see Notas
 * @version 1.0
 */

public class Notas {
    // declaramos la variables que nos hacen falta
    double uf1, uf2, uf3;
    double acumulado1, acumulado2, acumulado3, definitiva;
    //utilizamos un scanner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    /**
     * Metodo ingresaNotas es el primer metodo que ejecutamos y
     * sirve para ingresar las 3 notas del alumno en la asignatura en
     * las variables uf1, uf2 y uf3
     */

    public void ingresaNotas() {
        //cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
        System.out.println("ingrese las notas del estudiante");

        System.out.print("ingrese nota 1: ");

        uf1= entrada.nextDouble();



        System.out.print("ingrese nota 2: ");

        uf2= entrada.nextDouble();
        System.out.print("ingrese nota 3: ");

        uf3= entrada.nextDouble();


    }
    /**
     * el metodo comprobacion sirve para comprobar si las notas de las
     * variables uf fueron introducidas correctamente y estan entre 0 y 10
     */

    public void comprobacion(){

        if (uf1>10) {
            System.out.println(" nota1 mal introducida");

        }else {
            System.out.println(" nota1 correcta");
        }

        if (uf2>10) {
            System.out.println(" nota2 mal introducida");

        }else {
            System.out.println(" nota2 correcta");
        }
        if (uf3>10) {
            System.out.println(" nota3 mal introducida");

        }else {
            System.out.println(" nota3 correcta");
        }




    }
    /**
     * el metodo calculoNotas calcula las notas de cada uf por
     * el peso que tiene en el semestre con las variables
     * acu y suma para crear la nota definitiva en la variable def
     */

    public void calculoNotas() {
        acumulado1 = uf1 * 0.35;
        acumulado2 = uf2 * 0.35;
        acumulado3 = uf3 * 0.30;

        definitiva = acumulado1 + acumulado2 + acumulado3;

        //hasta aqui la tenemos calculada pero no la mostramos
    }

    /**
     * el metodo mostrar sirve para mostrar todo lo que ha sido introducido
     * usando println y printa las variables de todas notas
     */

    public void mostrar() {
        //print ln lo que hace es que al terminar el print baja la linea
        System.out.println(" notas introducidas son:");
        System.out.println(" nota1 = " + uf1);
        System.out.println(" nota2 = " + uf2);
        System.out.println(" nota3 = " + uf3);

        System.out.println(" acumuado 1 = "+ acumulado1);
        System.out.println(" acumuado 2 = "+ acumulado2);
        System.out.println(" acumuado 3 = "+ acumulado3);

        System.out.println(" nota definitiva es = "+ definitiva);

    }
    /**
     * Metodo aprobado tiene una condiciones para ver si la nota definitiva
     * entra en los aprobados o suspendidos
     */
    public void aprobado() {

        if(definitiva <5 && definitiva >=0) {
            System.out.println("suspendido");
        }else if (definitiva >=5 && definitiva <=10 ) {
            System.out.println("aprobado");
        }else {
            System.out.println(" error en la notas");
        }
    }

    /**
     * metodo main para llamar a todos metodos en secuencia
     * para calcular y mostrar las notas
     *
     */

    public static void main(String[] args) {
        // creamos mecanismos para llamar a cualquier metodo fuera de la clase
        Notas fc= new Notas();

        fc.ingresaNotas();

        fc.comprobacion();

        fc.calculoNotas();

        fc.mostrar();

        fc.aprobado();

    }

}
