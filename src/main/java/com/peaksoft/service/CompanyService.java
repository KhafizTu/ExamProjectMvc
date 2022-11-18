package com.peaksoft.service;

import com.peaksoft.entity.Company;

import java.util.List;

public interface CompanyService {
    void saveCompany(Company company);
    Company getCompanyById(Long id);
    List<Company> getAllCompany();
    void updateCompany(Company company);
    void removeCompanyById(Long id);
}
