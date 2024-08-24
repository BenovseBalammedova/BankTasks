package service;

import java.util.List;

public interface CommonService <T>{
    void add(T common);
    void delete(int id);
    T read(int id);
    void  update(int id,String name);
    List<T>getAll();
    T getById(int id);
}
