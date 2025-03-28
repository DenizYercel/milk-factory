package com.guruspringframework.milkfactory.controller;

import com.guruspringframework.milkfactory.service.MilkService;
import com.guruspringframework.milkfactory.web.model.MilkDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/milk")
@RestController
public class MilkController {

    private final MilkService milkService;

    public MilkController(MilkService milkService) {
        this.milkService = milkService;
    }


    @GetMapping("/{milkId}")
    public ResponseEntity<MilkDto> getMilk(@PathVariable("milkId") UUID milkId) {
        return new ResponseEntity<>(milkService.getMilkById(milkId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(MilkDto milkDto) {
        MilkDto savedDto = milkService.saveNewMilk(milkDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","api/v1/milk/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

}
