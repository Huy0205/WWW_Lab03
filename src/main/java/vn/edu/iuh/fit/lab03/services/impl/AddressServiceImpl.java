package vn.edu.iuh.fit.lab03.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.lab03.models.Address;
import vn.edu.iuh.fit.lab03.repositories.AddressRepository;
import vn.edu.iuh.fit.lab03.services.AddressService;

import java.util.List;
import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public List<Address> getAll() {
        return addressRepository.getAll();
    }

    @Override
    public Address get(UUID uuid) {
        return addressRepository.get(uuid);
    }

    @Override
    public boolean add(Address address) {
        return addressRepository.add(address);
    }

    @Override
    public boolean update(Address address) {
        return addressRepository.update(address);
    }

    @Override
    public boolean delete(UUID uuid) {
        return addressRepository.delete(uuid);
    }
}
