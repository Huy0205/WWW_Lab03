package vn.edu.iuh.fit.lab03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.lab03.models.Address;
import vn.edu.iuh.fit.lab03.models.Candidate;
import vn.edu.iuh.fit.lab03.services.AddressService;
import vn.edu.iuh.fit.lab03.services.CandidateService;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Lab03Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab03Application.class, args);
    }

    @Autowired
    private AddressService addressService;
    @Autowired
    private CandidateService candidateService;

    @Bean
    public CommandLineRunner test(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Address address = new Address(UUID.randomUUID(), "ABC", "TP.HCM", (short) 1, "10", "7678");
                Candidate candidate = new Candidate(UUID.randomUUID(), LocalDate.of(2002,5,2), "Anh", "huy@gmail.com", "0329999999", address);

                addressService.add(address);
                candidateService.add(candidate);

                ArrayList<Candidate> candidates = (ArrayList<Candidate>) candidateService.getAll();

                for (int i = 0; i < candidates.size(); i++) {
                    candidates.get(i).setAddress(addressService.get(candidates.get(i).getAddress().getId()));
                    System.out.println(candidates.get(i));
                }
            }
        };
    }
}
