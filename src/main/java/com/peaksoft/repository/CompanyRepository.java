package com.peaksoft.repository;

import com.peaksoft.entity.Company;

import java.util.List;

public interface CompanyRepository {
    void saveCompany(Company company);
    Company getCompanyById(Long id);
    List<Company> getAllCompany();
    void updateCompanyById(Company company);
    void removeCompanyById(Long id);

}
