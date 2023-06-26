package com.micro.charactertracker.controller;
import com.micro.charactertracker.dto.PersonDTO;

import com.micro.charactertracker.service.ICreatePersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class CreatePersonController {
    private final ICreatePersonService createPersonService;

    @PostMapping("/create")
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO dto) {
        return new ResponseEntity<>(createPersonService.createPerson(dto), HttpStatus.OK);
    }
}
