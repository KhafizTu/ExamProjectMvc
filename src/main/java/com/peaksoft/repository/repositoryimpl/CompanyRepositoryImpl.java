package com.peaksoft.repository.repositoryimpl;

import com.peaksoft.entity.Company;
import com.peaksoft.repository.CompanyRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CompanyRepositoryImpl implements CompanyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCompany(Company company) {
        entityManager.persist(company);
    }

    @Override
    public Company getCompanyById(Long id) {
        return entityManager.find(Company.class, id);
    }

    @Override
    public List getAllCompany() {
        return entityManager.createQuery("select c from Company c").getResultList();
    }

    @Override
    public void updateCompany(Company company) {
        entityManager.merge(company);
    }

    @Override
    public void removeCompanyById(Long id) {
        entityManager.remove(entityManager.find(Company.class, id));
    }

}
