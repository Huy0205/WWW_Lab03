package vn.edu.iuh.fit.lab03.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab03.models.Candidate;

import java.util.List;
import java.util.UUID;

@Service
public interface CandidateService {
    public List<Candidate> getAll();

    public Candidate get(UUID uuid);

    public  boolean add(Candidate candidate);

    public boolean update(Candidate candidate);

    public boolean delete(UUID uuid);
}
