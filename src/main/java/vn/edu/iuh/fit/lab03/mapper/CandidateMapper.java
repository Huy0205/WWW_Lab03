package vn.edu.iuh.fit.lab03.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import vn.edu.iuh.fit.lab03.models.Address;
import vn.edu.iuh.fit.lab03.models.Candidate;
import vn.edu.iuh.fit.lab03.services.AddressService;

import java.rmi.server.UID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.UUID;

public class CandidateMapper implements RowMapper<Candidate> {
    @Override
    public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
        UUID id = UUID.fromString(rs.getString("id"));
        LocalDate dob = rs.getDate("dob").toLocalDate();
        String email = rs.getString("email");
        String fullName = rs.getString("full_name");
        String phone = rs.getString("phone");
        Address address = new Address(UUID.fromString(rs.getString("address")));
        return new Candidate(id, dob, email, fullName, phone, address);
    }
}
