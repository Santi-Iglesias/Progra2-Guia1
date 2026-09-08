import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la guia 1");

        Scanner scanner = new Scanner(System.in);

        Empleado carlos = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        Empleado ana = new Empleado(34234123, "Ana", "Sanchez", 27500);

        int opcion;

        do {
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("0 para Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ejercicio 1");

                    System.out.println("Empleado 1: " + carlos);
                    System.out.println("Empleado 2: " + ana);

                    carlos.calcularSalario();
                    ana.calcularSalario();

                    carlos.aumentarSalario(scanner);
                    System.out.println("Salario de Carlos aumentado: " + carlos);

                    break;

                case 2:
                    System.out.println("Ejercicio 2");
                    //1
                    CuentaBancaria cuenta = new CuentaBancaria(1, "Santi", 15000);
                    //2
                    cuenta.credito(2500);
                    //3
                    cuenta.debito(1500);
                    //4
                    cuenta.debito(30000);
                    //5
                    System.out.println(cuenta);


                    break;

                case 3:
                    System.out.println("Ejercicio 3");
                    //a
                    Libro libro1 = new Libro("El Quijote", "Miguel Cervantes", 500, 10);
                    //b
                    Libro libro2 = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez", 700, 5);
                    //c
                    System.out.println(libro1);
                    System.out.println(libro2);
                    //d
                    libro1.vender(3);
                    //e
                    System.out.println(libro1);
                    //f
                    libro2.vender(8);
                    //g
                    libro2.incrementarCopias(5);
                    //h
                    System.out.println(libro2);



                    break;

                case 4:
                    System.out.println("Ejercicio 4");

                    ItemVenta item = null;
                    int opcionItem;

                    do {
                        System.out.println("SUB MENU");
                        System.out.println("1-Agregar item");
                        System.out.println("2-Imprimir item");
                        System.out.println("3-Actualizar cantidad");
                        System.out.println("4-Actualizar precio unitario");
                        System.out.println("5-Imprimir precio total");
                        System.out.println("6-Salir");
                        System.out.println("Elegi una opcion");

                        opcionItem = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionItem) {
                            case 1:
                                System.out.println("Ingrese ID: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Ingrese descripcion: ");
                                String descripcion = scanner.nextLine();

                                System.out.println("Ingrese cantidad: ");
                                int cantidad = scanner.nextInt();

                                System.out.println("Ingrese precio unitario: ");
                                double precioUnitario = scanner.nextDouble();

                                item = new ItemVenta(id, descripcion, cantidad, precioUnitario);
                                System.out.println("Item agregado");
                                break;

                            case 2:
                                if (item != null) {
                                    System.out.println(item);
                                } else  {
                                    System.out.println("Ingrese un item");
                                }
                                break;

                            case 3:
                                if (item != null) {
                                    System.out.println("Ingrese una nueva cantidad: ");
                                    item.setCantidad(scanner.nextInt());
                                    System.out.println("Cantidad actualizada");
                                } else  {
                                    System.out.println("Antes debe agregar un item");
                                }
                                break;

                            case 4:
                                if (item != null) {
                                    System.out.println("Ingrese un nuevo precio: ");
                                    item.setPrecioUnitario(scanner.nextDouble());
                                    System.out.println("Precio actualizado");
                                } else   {
                                    System.out.println("Antes debe agregar un item");
                                }

                            case 5:
                                if (item != null) {
                                    System.out.println("Precio total: " + item.calcularPrecioTotal());
                                }  else  {
                                    System.out.println("Antes debe agregar un item");
                                }
                                break;

                            case 6:
                                System.out.println("Saliendo de la gestion de items");
                                break;

                            default:
                                System.out.println("Opcion invalida");
                        }
                    } while (opcionItem != 6);

                    break;

                case 0:
                    System.out.println("Saliendo de la guía...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}