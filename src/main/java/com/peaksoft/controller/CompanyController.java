package com.peaksoft.controller;

import com.peaksoft.entity.Company;
import com.peaksoft.service.serviceimpl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/company")
public class CompanyController {
    private final CompanyServiceImpl companyServiceImpl;

    @Autowired
    public CompanyController(CompanyServiceImpl companyServiceImpl) {
        this.companyServiceImpl = companyServiceImpl;
    }

    @GetMapping("/allCompany")
    public String getAllCompany(Model model) {
        model.addAttribute("allCompany", companyServiceImpl.getAllCompany());
        return "/company/get_all_company";
    }

    @GetMapping("/getCompanyById/{companyId}")
    public String getCompanyById(@PathVariable("companyId") Long id, Model model) {
        model.addAttribute("company", companyServiceImpl.getCompanyById(id));
        return "/company/inner_page";
    }


    @GetMapping("/new")
    public String newCompany(Model model) {
        model.addAttribute("newCompany", new Company());
        return "/company/save_company";
    }
    @PostMapping("/save")
    public String saveCompany(@ModelAttribute("newCompany") Company company) {
        companyServiceImpl.saveCompany(company);
        return "redirect:/allCompany";
    }


    @GetMapping("/update")
    public String updateCompany(@RequestParam("companyId") Long id, Model model) {
        model.addAttribute("company", companyServiceImpl.getCompanyById(id));
        return "/company/update_company";
    }
    @PostMapping("/saveUpdateCompany")
    public String saveUpdate(@ModelAttribute("company") Company company) {
        companyServiceImpl.saveCompany(company);
        return "redirect:/allCompany";
    }


    @RequestMapping("deleteCompany")
    public String deleteCompany(@RequestParam("companyId") Long id) {
        companyServiceImpl.removeCompanyById(id);
        return "redirect:/getAllCompanies";
    }


}
