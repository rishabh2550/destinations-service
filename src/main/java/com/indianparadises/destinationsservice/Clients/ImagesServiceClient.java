package com.indianparadises.destinationsservice.Clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImagesServiceClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public ImagesServiceClient(RestTemplate restTemplate, @Value("${images-service.host}") String host,
                               @Value("${images-service.port}") int port) {
        this.restTemplate = restTemplate;
        this.baseUrl = "http://" + host + ":" + port;
    }

//    public fetchExploreDestinationsImages() {
//
//    }

}
