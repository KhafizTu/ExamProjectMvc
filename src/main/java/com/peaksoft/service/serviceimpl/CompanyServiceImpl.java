package com.peaksoft.service.serviceimpl;

import com.peaksoft.entity.Company;
import com.peaksoft.repository.repositoryimpl.CompanyRepositoryImpl;
import com.peaksoft.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepositoryImpl companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepositoryImpl companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public void saveCompany(Company company) {
        companyRepository.saveCompany(company);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getCompanyById(id);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepository.getAllCompany();
    }

    @Override
    public void updateCompanyById(Company company) {
        companyRepository.updateCompanyById(company);
    }

    @Override
    public void removeCompanyById(Long id) {
        companyRepository.removeCompanyById(id);
    }
}
