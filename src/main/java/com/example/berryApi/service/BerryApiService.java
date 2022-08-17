package com.example.berryApi.service;

import java.io.IOException;

import com.example.berryApi.controller.BerryApi;

public interface BerryApiService {
    BerryApi consultarBerry(Integer id) throws IOException;
    
}
