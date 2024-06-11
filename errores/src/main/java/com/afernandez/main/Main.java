/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.afernandez.main;

import com.afernandez.exceptions.InvalidProductException;
import com.afernandez.exceptions.ProductAlreadyExistsException;
import com.afernandez.exceptions.ProductNotFoundException;

/**
 *
 * @author alvaro
 */
public class Main {
    public static void main(String[] args) throws ProductAlreadyExistsException, InvalidProductException, ProductNotFoundException {

        // Inicializamos manager
        ProductManager manager = new ProductManager();

        try {

        // Añadimos productos usando el metodo del manager
        manager.addProduct(new Product(0, "PC", 1499.99));
        manager.addProduct(new Product(1, "Pato", 999.99));
        manager.addProduct(new Product(2, "Tablet", 299.99));

        // Los printamos
        System.out.println("_____________________________________________");
        System.out.println("PRODUCTOS:");
        manager.printAllProducts();
        System.out.println("_____________________________________________");

        // Obtener un producto por ID
        Product product = manager.getProduct(2);
        System.out.println("PRODUCTO ESPECIFICO:");
        System.out.println(product);
        System.out.println("_____________________________________________");

        // Eliminar un producto por indice
        manager.removeProduct(0);
        System.out.println("PRODUCTOS DESPUES DE BORRAR UNO DE LA LISTA:");
        manager.printAllProducts();
        System.out.println("_____________________________________________");

        ////#region Excepciones
        // Descomentar segun se prueba 🦆👍
        /*
        System.out.println("EXCEPCION ID NEGATIVO");
        manager.addProduct(new Product(-4, "fiumba", 399.99));
        System.out.println("_____________________________________________");

        System.out.println("EXCEPCION NOMBRE INCORRECTO");
        manager.addProduct(new Product(-4, "", 399.99));
        System.out.println("_____________________________________________");

        System.out.println("EXCEPCION PRECIO NEGATIVO");
        manager.addProduct(new Product(4, "fiumba", -399.99));
        System.out.println("_____________________________________________");

        System.out.println("EXCEPCION ID REPETIDO");
        manager.addProduct(new Product(1, "Pato", 999.99));
        System.out.println("_____________________________________________");

        System.out.println("EXCEPCION ID NO EXISTENTE");
        Product product2 = manager.getProduct(6);
        System.out.println(product2);
        System.out.println("_____________________________________________");
        */
        ////#endregion

        } catch (ProductAlreadyExistsException | ProductNotFoundException | InvalidProductException e) {
            System.err.println(e.getMessage());
        }
    }
}