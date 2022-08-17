package com.example.berryApi.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.example.berryApi.controller.BerryApi;
import com.example.berryApi.service.BerryApiService;
import com.google.gson.Gson;

@Service
public class BerryApiServiceImpl implements BerryApiService {

    @Override
    public BerryApi consultarBerry(Integer id) throws IOException {
        {
            URL url = new URL("https://pokeapi.co/api/v2/berry/"+id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Gson g = new Gson();
                BerryApi berryApi = g.fromJson(response.toString(), BerryApi.class); // declaro la variable pokeapi de tipo objeto BerryApi
                return berryApi; 
        }
    return null;
    }
 }
}
