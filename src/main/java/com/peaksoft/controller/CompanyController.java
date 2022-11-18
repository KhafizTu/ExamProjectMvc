package com.peaksoft.controller;

import com.peaksoft.entity.Company;
import com.peaksoft.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/allCompany")
    public String getAllCompany(Model model) {
        model.addAttribute("allCompany", companyService.getAllCompany());
        return "/company/get_all_company";
    }



    @GetMapping("/getCompanyById/{companyId}")
    public String getCompanyById(@PathVariable("companyId") Long id, Model model) {
        model.addAttribute("company", companyService.getCompanyById(id));
        return "/company/get_all_company";
    }



    @GetMapping("/new")
    public String newCompany(Model model) {
        model.addAttribute("newCompany", new Company());
        return "/company/save_company";
    }
    @PostMapping("/save")
    public String saveCompany(@ModelAttribute("newCompany") Company company) {
        companyService.saveCompany(company);
        return "redirect:/allCompany";
    }



    @GetMapping("/updateCompany")
    public String updateCompany(@RequestParam("companyId") Long id, Model model) {
        model.addAttribute("company", companyService.getCompanyById(id));
        return "/company/update_company";
    }
    @PostMapping("/saveUpdateCompany")
    public String saveUpdate(@ModelAttribute("company") Company company) {
        System.out.println("b");
        companyService.updateCompany(company);
        return "redirect:/allCompany";
    }



    @RequestMapping("/deleteCompany")
    public String deleteCompany(@RequestParam("companyId") Long id) {
        companyService.removeCompanyById(id);
        return "redirect:/allCompany";
    }

}
