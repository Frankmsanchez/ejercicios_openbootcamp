package ejerciciotema9;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente=new Cliente();
        cliente.setNombre("Fernanda");
        cliente.setEdad(18);
        cliente.setTelefono(84809031);
        cliente.setCredito(25000);
        System.out.println("Nombre cliente: "+cliente.getNombre()+
                "\nTelefono: "+cliente.getTelefono()+
                "\nEdad: "+cliente.getEdad()+
                "\nCredito: "+cliente.getCredito());
        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Frank");
        trabajador.setEdad(22);
        trabajador.setTelefono(84682022);
        trabajador.setSalario(300);
        System.out.println("\n" +
                "Nombre trabajador: "+trabajador.getNombre()+
                "\nTelefono: "+trabajador.getTelefono()+
                "\nEdad: "+trabajador.getEdad()+
                "\nSalario: "+trabajador.getSalario());
    }

}

class Persona{
    private String nombre;
    private int edad, telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}