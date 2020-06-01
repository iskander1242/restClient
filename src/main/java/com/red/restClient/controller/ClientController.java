package com.red.restClient.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.red.restClient.model.Company;
import com.red.restClient.model.CompanyDto;
import com.red.restClient.service.CompanyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    public static final String ERROR = "INTERNAL SERVER ERROR";

    final ObjectMapper objectMapper;

    final CompanyService companyService;

    Logger logger = LogManager.getLogger(ClientController.class);

    public ClientController(ObjectMapper objectMapper, CompanyService companyService) {
        this.objectMapper = objectMapper;
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public String showForm(Model model) {
        CompanyDto company = new CompanyDto();
        model.addAttribute("company", company);
        return "company";
    }

    @PostMapping("/company")
    public String submitForm(Model model, @ModelAttribute("company") @Validated CompanyDto companyDto) {
        try {
            final Company company = companyService.getCompanyById(companyDto.getRegistrationNumber());

            toDto(companyDto, company);
        } catch (Exception e) {
            logger.error(e);
            model.addAttribute("errorMessage", ERROR);
        }
        return "company";
    }

    private CompanyDto toDto(@Validated @ModelAttribute("company") CompanyDto companyDto, Company company) {
        //TODO asked about address?
        companyDto.setAddress(company.getDD());
        companyDto.setFullName(company.getFullName());
        companyDto.setStatus(company.getStatus());
        companyDto.setRegistrationDate(company.getRegistrationDate());
        return companyDto;
    }
}
