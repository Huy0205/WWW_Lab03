package vn.edu.iuh.fit.lab03.repositories;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.lab03.mapper.CandidateMapper;
import vn.edu.iuh.fit.lab03.models.Candidate;

import javax.sql.DataSource;
import java.util.List;
import java.util.UUID;
@Repository
public class CandidateRepository extends AbstractRepository<Candidate, UUID> {
    public CandidateRepository(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public List<Candidate> getAll() {
        String sql = "select * from candidate";
        return jdbcTemplate.query(sql, new CandidateMapper());
    }

    @Override
    public Candidate get(UUID uuid) {
        String sql = "select * from candidate where id = ?";
        return jdbcTemplate.queryForObject(sql, new CandidateMapper(), uuid);
    }

    @Override
    public boolean add(Candidate candidate) {
        String sql = "insert into candidate(id, dob, email, full_name, phone, address) values(?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, candidate.getId(), candidate.getDob(), candidate.getEmail(), candidate.getFullName(), candidate.getPhone(), candidate.getAddress().getId()) > 0;
    }

    @Override
    public boolean update(Candidate candidate) {
        String sql = "update candidate set dob = ?, email = ?, full_name = ?, phone = ?, address = ? where id = ?";
        return jdbcTemplate.update(sql, candidate.getDob(), candidate.getEmail(), candidate.getFullName(), candidate.getPhone(), candidate.getAddress().getId(), candidate.getId()) > 0;
    }

    @Override
    public boolean delete(UUID uuid) {
        String sql = "delete from candidate where id = ?";
        return jdbcTemplate.update(sql, uuid) > 0;
    }
}
