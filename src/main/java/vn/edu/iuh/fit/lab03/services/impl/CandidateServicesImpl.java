package vn.edu.iuh.fit.lab03.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab03.models.Candidate;
import vn.edu.iuh.fit.lab03.repositories.CandidateRepository;
import vn.edu.iuh.fit.lab03.services.CandidateService;

import java.util.List;
import java.util.UUID;

@Service
public class CandidateServicesImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<Candidate> getAll() {
        return candidateRepository.getAll();
    }

    @Override
    public Candidate get(UUID uuid) {
        return candidateRepository.get(uuid);
    }

    @Override
    public boolean add(Candidate candidate) {
        return candidateRepository.add(candidate);
    }

    @Override
    public boolean update(Candidate candidate) {
        return candidateRepository.update(candidate);
    }

    @Override
    public boolean delete(UUID uuid) {
        return candidateRepository.delete(uuid);
    }
}
