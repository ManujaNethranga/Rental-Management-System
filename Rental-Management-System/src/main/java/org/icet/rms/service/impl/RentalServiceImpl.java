package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Rental;
import org.icet.rms.entity.RentalEntity;
import org.icet.rms.repository.RentalRepository;
import org.icet.rms.service.RentalService;
import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService {

    RentalServiceImpl(ObjectMapper mapper,RentalRepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    final private ObjectMapper mapper;
    final private RentalRepository repository;


    @Override
    public void save(Rental rental) {
        repository.save(mapper.convertValue(rental, RentalEntity.class));
    }
}
