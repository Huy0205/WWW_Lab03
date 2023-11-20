package vn.edu.iuh.fit.lab03.repositories;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.lab03.models.Address;

import javax.sql.DataSource;
import java.util.List;
import java.util.UUID;

@Repository
public class AddressRepository extends AbstractRepository<Address, UUID> {
    public AddressRepository(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public List<Address> getAll() {
        String sql = "select * from address";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Address.class));
    }

    @Override
    public Address get(UUID uuid) {
        String sql = "select * from address where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Address.class), uuid);
    }

    @Override
    public boolean add(Address address) {
        String sql = "insert into address values(?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, address.getId(), address.getStreet(), address.getCity(), address.getCountry(), address.getNumber(), address.getZipcode()) > 0;
    }

    @Override
    public boolean update(Address address) {
        String sql = "upadte address set street = ?, city = ?, country = ?, number = ?, zipcode = ? where id = ?";
        return jdbcTemplate.update(sql, address.getStreet(), address.getCity(), address.getCountry(), address.getNumber(), address.getZipcode(), address.getId()) > 0;
    }

    @Override
    public boolean delete(UUID uuid) {
        String sql = "delete from address where id = ?";
        return jdbcTemplate.update(sql, uuid) > 0;
    }
}
