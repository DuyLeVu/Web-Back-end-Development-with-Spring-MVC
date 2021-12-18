package service.product;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProductRepository;

import java.util.Optional;

public class ProductService implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void remove(Long id) {

    }
}
