package ejercicio2M;

import java.util.Date;

public class CuentaCorriente {

    private String nombre;
    private long numeroCuenta;
    private Date fechaCreacion;
    private double saldo;

    public CuentaCorriente(){

    }

    public CuentaCorriente(String nombre, long numeroCuenta, Date fechaCreacion, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente c){
        this.nombre = c.getNombre();
        this.numeroCuenta = c.getNumeroCuenta();
        this.fechaCreacion = c.getFechaCreacion();
        this.saldo = c.getSaldo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double valor){
        if(valor < 0)
            System.out.println("Operacion invalida");
        this.saldo += valor;
    }

    public void egreso(double valor) {
        if (valor < 0 || this.saldo < valor)
            System.out.println("Operacion invalida");
        this.saldo -= valor;

    }

    public void reintegro(double valor){
        this.saldo += valor;
    }

    public void transferencia(CuentaCorriente c, double valor){
        if(valor < 0)
            System.out.println("Operacion incorrecta");
        this.saldo -= valor;
        c.saldo += valor;
    }
}
