package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.RentalDetail;
import org.icet.rms.entity.RentalDetailEntity;
import org.icet.rms.repository.RentalDetailRepository;
import org.icet.rms.service.RentalDetailService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalDetailServiceImpl implements RentalDetailService {

    RentalDetailServiceImpl(ObjectMapper mapper,RentalDetailRepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    final ObjectMapper mapper;
    final RentalDetailRepository repository;

    @Override
    public void persist(RentalDetail rentalDetail) {
        repository.save(mapper.convertValue(rentalDetail, RentalDetailEntity.class));
    }

    @Override
    public List<RentalDetail> retrieve() {
        List<RentalDetail> list = new ArrayList<>();
        Iterable<RentalDetailEntity> all = repository.findAll();
        all.forEach(element ->{
            list.add(mapper.convertValue(element,RentalDetail.class));
        });
        return list;
    }
}
