package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Tivi Lg", 600, "55 Inch", "Lg"));
        products.put(2, new Product(2, "Iphone X", 300, "128Gb", "Apple"));
        products.put(3, new Product(3, "May Giat SamSung", 500, "11kg", "SamSung"));
        products.put(4, new Product(4, "Macbook Pro", 800, "32Gb Ram", "Apple"));
        products.put(5, new Product(5, "SamSung Z Fold", 750, "16Gb Ram", "SamSung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String search) {
        List<Product> newListProduct = new ArrayList<>();
        for (Product product : products.values()
        ) {
            if (product.getName().contains(search)) newListProduct.add(product);
        }
        return newListProduct;
    }
}
