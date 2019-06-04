/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ite5435.assignment2.controllers;


import java.io.IOException;
import java.net.URISyntaxException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Austin
 */
@RestController
public class WeatherController {
    
    @RequestMapping("/weather")
    public ResponseEntity<String> weatherCity(@RequestParam(value="name", required=false, defaultValue = "Toronto") String name) throws IOException, URISyntaxException{

    // call openwerathermap api    
    String uri = "http://api.openweathermap.org/data/2.5/weather?q="+name+"&appid=29c4607178ca8ac09aa6f286ee4e0458&units=metric";
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

    return response;

    
    }
    
    @RequestMapping("/weather/city24hforecast")
    public ResponseEntity<String> weatherCityForecast(@RequestParam(value="id") String id) throws IOException, URISyntaxException{

    // call openwerathermap api    
    String uri = "http://api.openweathermap.org/data/2.5/forecast?id="+id+"&appid=29c4607178ca8ac09aa6f286ee4e0458&units=metric&cnt=8";
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

    return response;

    
    }
    
    @RequestMapping("/weather/uvindex")
    public ResponseEntity<String> weatherCityUV(@RequestParam(value="lat") String lat, @RequestParam(value="lon") String lon) throws IOException, URISyntaxException{

    // call openwerathermap api    
    String uri = "http://api.openweathermap.org/data/2.5/uvi?lat="+lat+"&lon="+lon+"&appid=29c4607178ca8ac09aa6f286ee4e0458&units=metric";
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

    return response;

    
    }
    
    
    
    
}
