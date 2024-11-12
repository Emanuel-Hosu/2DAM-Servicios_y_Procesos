package main;

class Contador {
    private int cuenta = 0;

    public synchronized int getCuenta() {
        return cuenta;
    }

    public synchronized int incrementa() {
        this.cuenta++;
        return cuenta;
    }
}