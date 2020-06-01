package com.red.restClient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.red.restClient.model.Company;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {

    public static final String EGR_API_URL = "http://egr.gov.by/egrn/API.jsp";

    final ObjectMapper objectMapper;

    final RestTemplate restTemplate = new RestTemplate();

    public CompanyService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Company getCompanyById(String registrationNumber) throws Exception {
        List<Company> companyList = null;

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(EGR_API_URL).queryParam("NM",registrationNumber);
        final ResponseEntity<Company[]> forEntity = restTemplate.getForEntity(builder.toUriString(),Company[].class);
        companyList = Arrays.asList(forEntity.getBody());

        return companyList.get(0);
    }
}
