package product;

import java.util.ArrayList;

public interface Imanager <S>{
    void add(S s);
    void remove(int id);
    void update(int id,S s);
    int findIndexByID(int id);
    ArrayList<S> showAll();

}
