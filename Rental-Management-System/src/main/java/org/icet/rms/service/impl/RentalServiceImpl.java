package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Rental;
import org.icet.rms.entity.RentalEntity;
import org.icet.rms.repository.RentalRepository;
import org.icet.rms.service.RentalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    RentalServiceImpl(ObjectMapper mapper,RentalRepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    final private ObjectMapper mapper;
    final private RentalRepository repository;


    @Override
    public void persist(Rental rental) {
        repository.save(mapper.convertValue(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> retrieve() {
        List<Rental> list = new ArrayList<>();
        Iterable<RentalEntity> all = repository.findAll();
        all.forEach(element ->{
            list.add(mapper.convertValue(element,Rental.class));
        });
        return list;
    }
}
