package com.afernandez.main;

import java.util.ArrayList;
import java.util.List;

import com.afernandez.exceptions.ProductAlreadyExistsException;
import com.afernandez.exceptions.ProductNotFoundException;

public class ProductManager {
    private final List<Product> products = new ArrayList<>();

    // Método para añadir un producto
    public void addProduct(Product product) throws ProductAlreadyExistsException {
        if (products.stream().anyMatch(p -> p.getId() == product.getId())) {
            throw new ProductAlreadyExistsException("Product with ID " + product.getId() + " already exists.");
        }
        products.add(product);
    }

    // Método para eliminar un producto por su id
    public void removeProduct(int id) throws ProductNotFoundException {
        Product product = getProduct(id);
        if (product == null) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
        products.remove(product);
    }

    // Método para obtener un producto por id
    public Product getProduct(int id) throws ProductNotFoundException {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found."));
    }

    // Método para obtener la lista de todos los productos
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    // Método para imprimir todos los productos (opcional)
    public void printAllProducts() {
        products.forEach(System.out::println);
    }
}
