package lv.javaguru.springboot.customermanager3.controller;

import lv.javaguru.springboot.customermanager3.model.Customer;
import lv.javaguru.springboot.customermanager3.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String initializeCustomer(Model model) {
        return "index";
    }

    @RequestMapping(value = "customers", method = RequestMethod.GET)
    public String listCustomers(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomers", customerService.listCustomers());
        return "customers";
    }

    @RequestMapping(value = "/customer/add", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer customer) {
        if (customer.getId() == 0) {
            customerService.addCustomer(customer);
        } else {
            customerService.updateCustomer(customer);
        }
        return "redirect:/customers";
    }

    @RequestMapping("/remove/{id}")
    public String removeCustomer(@PathVariable("id") int id) {
        customerService.removeCustomer(id);
        return "redirect:/customers";
    }

    @RequestMapping("/edit/{id}")
    public String editCustomer(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        model.addAttribute("listCustomers", customerService.listCustomers());
        return "customers";
    }

    @RequestMapping("customerdata/{id}")
    public String customerData(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customerdata";
    }
}
