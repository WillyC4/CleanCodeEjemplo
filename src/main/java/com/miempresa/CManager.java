package com.miempresa; // Se agregó el paquete

import java.util.ArrayList;
import java.util.List;

/**
 * Clase CManager para administrar clientes y órdenes.
 */
public class CManager {
    /** Lista de clientes registrados. */
    private final List<String> customers = new ArrayList<>();

    /** Lista de órdenes registradas. */
    private final List<String> orders = new ArrayList<>();

    /**
     * Agrega un cliente a la lista.
     * @param name Nombre del cliente (debe ser final).
     */
    public void addCustomer(final String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Error: Nombre de cliente inválido.");
            return;
        }
        customers.add(name);
        System.out.println("Cliente agregado: " + name);
    }

    /**
     * Agrega una orden a la lista.
     * @param order Nombre de la orden (debe ser final).
     */
    public void addOrder(final String order) {
        if (order == null || order.isBlank()) {
            System.out.println("Error: Orden inválida.");
            return;
        }
        orders.add(order);
        System.out.println("Orden agregada: " + order);
    }

    /**
     * Procesa todas las órdenes de un cliente.
     * @param customer Cliente el cual se procesarán órdenes
     */
    public void processOrders(final String customer) {
        if (!customers.contains(customer)) {
            System.out.println("Error: Cliente no encontrado.");
            return;
        }
        System.out.println("\nProcesando órdenes para: " + customer);
        for (String order : orders) {
            System.out.println("Orden procesada: " + order);
        }
    }

    /**
     * Genera un reporte de clientes y órdenes.
     */
    public void generateReport() {
        printReport("Reporte de Clientes", customers);
        printReport("Reporte de Órdenes", orders);
    }

    /**
     * Método auxiliar para imprimir reportes sin repetir código.
     * @param title Título del reporte (debe ser final).
     * @param list Lista de elementos a imprimir (debe ser final).
     */
    private void printReport(final String title, final List<String> list) {
        System.out.println("\n " + title);
        for (String item : list) {
            System.out.println("- " + item);
        }
    }

    /**
     * Método principal para probar la funcionalidad.
     * @param args Argumentos de línea de comandos (debe ser final).
     */
    public static void main(final String[] args) {
        CManager manager = new CManager();
        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");
        manager.addOrder("Pedido #1");
        manager.addOrder("Pedido #2");
        manager.processOrders("John Doe");
        manager.generateReport();
    }
}
