public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Cliente cliente = new Cliente("John", "Gallego", "1234567", "Preferencial","012");
        Vendedor vendedor = new Vendedor("Camila", "Gallego", "325", 453, 20);

        Productos productos = new Productos();
        Perecedero perecedero = new Perecedero("Galletas",50,45,"1000", 2005);
        NoPerecedero noPerecedero = new NoPerecedero("Atun",24,55, "1000", "Lata");
        Limpieza limpieza = new Limpieza("Rinde",5000,"Bicarbonato",50);

        imprimir(cliente);
        imprimir(vendedor);
        imprimirProductos(perecedero);
        imprimirProductos(noPerecedero);
        imprimirProductos(limpieza);
    }
    public static void imprimir(Persona persona){
        System.out.println(persona.getNombre()+" "+ persona.getApellido()+" Id: "+ persona.getId());
        if(persona instanceof Cliente){
            System.out.println("Usted es un cliente: "+((Cliente)persona).getTipoCliente());
            System.out.println("Su codigo es: "+((Cliente)persona).getCodigoCuenta());
        }
        if(persona instanceof Vendedor){
            System.out.println("Su salario actual es: "+ ((Vendedor)persona).getSalario());
            System.out.println("Este mes vendío: "+((Vendedor)persona).getNumeroVentas());
        }
        System.out.println("==============================");
    }

    public static void imprimirProductos(Productos productos){
        System.out.println(productos.getNombreProd()+" $"+productos.getPrecio());
        if(productos instanceof Alimentos){
            System.out.println("Peso (gr): "+((Alimentos)productos).getPeso());
            System.out.println("Calorias: "+((Alimentos)productos).getCalorias());
            if(productos instanceof Perecedero){
                System.out.println("Vence: "+((Perecedero)productos).getFechaVencimiento());
            }else if(productos instanceof NoPerecedero){
                System.out.println("Empaque: "+((NoPerecedero)productos).getEmpaquetado());
            }
        }
        if(productos instanceof Limpieza){
            System.out.println("Componente: "+((Limpieza)productos).getComponentes());
            System.out.println("Contenido neto (Lt/gr): "+((Limpieza)productos).getLitros());
        }
        System.out.println("=================================");
    }


    }