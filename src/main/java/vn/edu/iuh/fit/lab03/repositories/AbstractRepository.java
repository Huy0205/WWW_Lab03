package vn.edu.iuh.fit.lab03.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T, ID> {

    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public abstract List<T> getAll();
    public abstract T get(ID id);
    public abstract boolean add(T t);
    public abstract boolean update(T t);
    public abstract boolean delete(ID id);
}
