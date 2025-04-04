package com.guruspringframework.milkfactory.service;

import com.guruspringframework.milkfactory.web.model.MilkDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface MilkService {

    MilkDto getMilkById(UUID milkId);

    MilkDto saveNewMilk(MilkDto milkDto);

    void updateMilk(UUID milkId, MilkDto milkDto);

    void deleteById(UUID milkId);

}
