package com.guruspringframework.milkfactory.service;

import com.guruspringframework.milkfactory.web.model.MilkDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MilkServiceImpl implements MilkService {
    @Override
    public MilkDto getMilkById(UUID milkId) {
        return MilkDto.builder().id(UUID.randomUUID())
                .milkName("Sutas")
                .milStyle("100ml")
                .build();
    }

    @Override
    public MilkDto saveNewMilk(MilkDto milkDto) {
        return MilkDto.builder()
                .id(UUID.randomUUID())
                .build();
    }


}
