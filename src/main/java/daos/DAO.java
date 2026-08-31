package daos;

import java.util.List;

public interface DAO<T> {

    T findById(int id);

    List<T> findAll();

    void create(T entity);

    void update(T entity);

    void delete(int id);

    void deleteAll();
}
