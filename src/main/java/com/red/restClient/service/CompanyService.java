package com.red.restClient.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.red.restClient.model.Company;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {

    public static final String EGR_API_URL = "http://egr.gov.by/egrn/API.jsp";

    final ObjectMapper objectMapper;

    final RestTemplate restTemplate = new RestTemplate();

    private static final TypeReference<Company[]> COMPANY_ARRAY_REFERENCE = new TypeReference<Company[]>() {
    };

    public CompanyService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Company getCompanyById(String registrationNumber) throws Exception {
        List<Company> companyList = null;

        Map<String, String> params = new HashMap<>();
        params.put("NM", registrationNumber);

        companyList = Arrays.asList(restTemplate.getForEntity(EGR_API_URL, Company[].class, params).getBody());

//        URI responseTest = getClass().getClassLoader()
//                .getResource("responseTest").toURI();
//        final File src = new File(responseTest);
//        companyList = Arrays.asList(objectMapper.readValue(src, COMPANY_ARRAY_REFERENCE));

        return companyList.get(0);
    }
}
