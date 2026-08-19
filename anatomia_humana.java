import java.util.Scanner;
public class anatomia_humana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estructuras = new String[10];
        String[] sistemasCorporales = new String[10];
        String[] ubicaciones = new String[10];
        String[] funciones = new String[10];
        String[] tiposEstructura = new String[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_de_anatomia_humana|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal de anatomia humana");
            System.out.println("1) Registrar estructura");
            System.out.println("2) Editar estructura");
            System.out.println("3) Listar estructuras");
            System.out.println("4) Buscar estructura");
            System.out.println("5) Eliminar estructura");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|registrar_estructura|--//
                //--------------------------//
                case 1:
                    if (total >= estructuras.length) {
                        System.out.println("No hay espacio para registrar mas estructuras.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de estructura anatomica");
                    System.out.println("id de la estructura a registrar: " + id);
                    System.out.print("nombre de la estructura: ");
                    estructuras[total] = entrada.nextLine();
                    System.out.print("sistema corporal: ");
                    sistemasCorporales[total] = entrada.nextLine();
                    System.out.print("ubicacion: ");
                    ubicaciones[total] = entrada.nextLine();
                    System.out.print("funcion: ");
                    funciones[total] = entrada.nextLine();
                    System.out.print("tipo de estructura: ");
                    tiposEstructura[total] = entrada.nextLine();
                    System.out.print("fecha de registro: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado del registro: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Estructura registrada correctamente.");
                    total++;
                    break;
                //-----------------------//
                //--|editar_estructura|--//
                //-----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen estructuras registradas.");
                        break;
                    }
                    System.out.println("Datos de las estructuras");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Estructura: " + estructuras[i] + " | Sistema: " + sistemasCorporales[i] + " | Ubicacion: " + ubicaciones[i] + " | Funcion: " + funciones[i] + " | Tipo: " + tiposEstructura[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la estructura: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato de la estructura");
                        System.out.print("Nuevo nombre de la estructura: ");
                        estructuras[posicion] = entrada.nextLine();
                        System.out.print("Nuevo sistema corporal: ");
                        sistemasCorporales[posicion] = entrada.nextLine();
                        System.out.print("Nueva ubicacion: ");
                        ubicaciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva funcion: ");
                        funciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de estructura: ");
                        tiposEstructura[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de registro: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del registro: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Estructura actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_estructuras|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen estructuras registradas.");
                    } else {
                        System.out.println("Lista de estructuras de anatomia humana");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Estructura: " + estructuras[i] + " | Sistema: " + sistemasCorporales[i] + " | Ubicacion: " + ubicaciones[i] + " | Funcion: " + funciones[i] + " | Tipo: " + tiposEstructura[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------------//
                //--|buscar_estructura|--//
                //-----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen estructuras registradas.");
                        break;
                    }
                    System.out.println("busqueda de estructura");
                    System.out.print("ingresa la id para buscar estructura: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la estructura encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Estructura: " + estructuras[posicion] + " | Sistema: " + sistemasCorporales[posicion] + " | Ubicacion: " + ubicaciones[posicion] + " | Funcion: " + funciones[posicion] + " | Tipo: " + tiposEstructura[posicion] + " | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|eliminar_estructura|--//
                //-------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen estructuras registradas.");
                        break;
                    }
                    System.out.println("Datos de las estructuras");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Estructura: " + estructuras[i] + " | Sistema: " + sistemasCorporales[i] + " | Ubicacion: " + ubicaciones[i] + " | Funcion: " + funciones[i] + " | Tipo: " + tiposEstructura[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la estructura a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            estructuras[i] = estructuras[i + 1];
                            sistemasCorporales[i] = sistemasCorporales[i + 1];
                            ubicaciones[i] = ubicaciones[i + 1];
                            funciones[i] = funciones[i + 1];
                            tiposEstructura[i] = tiposEstructura[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Estructura eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen estructuras registradas.");
                        break;
                    }
                    int activas = 0;
                    int inactivas = 0;
                    int enRevision = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activas++;
                        } else if (estados[i].equalsIgnoreCase("Inactivo")) {
                            inactivas++;
                        } else if (estados[i].equalsIgnoreCase("En revision")) {
                            enRevision++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String sistemaMayor = sistemasCorporales[0];
                    int cantidadSistemaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadSistema = 0;
                        for (int j = 0; j < total; j++) {
                            if (sistemasCorporales[i].equalsIgnoreCase(sistemasCorporales[j])) {
                                cantidadSistema++;
                            }
                        }
                        if (cantidadSistema > cantidadSistemaMayor) {
                            cantidadSistemaMayor = cantidadSistema;
                            sistemaMayor = sistemasCorporales[i];
                        }
                    }
                    String tipoEstructuraMayor = tiposEstructura[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposEstructura[i].equalsIgnoreCase(tiposEstructura[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoEstructuraMayor = tiposEstructura[i];
                        }
                    }
                    System.out.println("resumen de anatomia humana");
                    System.out.println("Estructuras registradas: " + total);
                    System.out.println("Sistema corporal mas registrado: " + sistemaMayor);
                    System.out.println("Tipo de estructura mas registrado: " + tipoEstructuraMayor);
                    System.out.println("Activas: " + activas);
                    System.out.println("Inactivas: " + inactivas);
                    System.out.println("En revision: " + enRevision);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Anatomia Humana.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}