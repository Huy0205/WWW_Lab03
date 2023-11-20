package vn.edu.iuh.fit.lab03.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab03.models.Address;
import vn.edu.iuh.fit.lab03.models.Candidate;

import java.util.List;
import java.util.UUID;

@Service
public interface AddressService {
    public List<Address> getAll();

    public Address get(UUID uuid);

    public  boolean add(Address address);

    public boolean update(Address address);

    public boolean delete(UUID uuid);
}
