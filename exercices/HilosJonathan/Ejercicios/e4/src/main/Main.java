package main;

/*
En este segundo enfoque, todos los hilos ejecutan el método run() con lógica diferente porque los objetos hilo se crean 
a partir de clases diferentes. Este es el enfoque real utilizado en los proyectos para desarrollar multithreading.
 */

public class Main {
    public static void main (String args[]) {
        AddThread add = new AddThread ();
        add.start();
        SubThread sub = new SubThread ();
        sub.start();
        System.out.println ("main exited");
    }
}
