
package product;

import java.util.ArrayList;

class ProductsManager implements Imanager <Product>{
    ArrayList<Product> products;
    public ProductsManager() {
        products = new ArrayList<>();
    }
    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(int id) {
        products.remove(findIndexByID(id));
    }

    @Override
    public void update( int id ,Product product) {
        products.set(findIndexByID(id), product);
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Product> showAll() {
        return products;
    }
    public void DisplayProduct () {
        ArrayList<Product> temp = showAll();
        for (Product product : temp) {
            System.out.println(product);
        }
    }



}