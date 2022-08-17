package com.example.berryApi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.berryApi.service.BerryApiService;

@RestController
@RequestMapping("/berryapi")
public class BerryApiController {
    private final BerryApiService berryApiService;
    public BerryApiController(@Autowired BerryApiService berryApiService) {
        this.berryApiService = berryApiService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BerryApi> mostrarBerry(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(berryApiService.consultarBerry(id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
