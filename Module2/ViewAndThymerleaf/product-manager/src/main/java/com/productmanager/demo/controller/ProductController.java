package com.productmanager.demo.controller;

import com.productmanager.demo.model.Product;
import com.productmanager.demo.service.ProductService;
import com.productmanager.demo.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public ModelAndView index(Model model) {
        List<Product> list = productService.findAll();
        model.addAttribute("message","hello");
        return new ModelAndView("index", "products", productService.findAll());
    }

    @GetMapping("/product/AddNew")
    public ModelAndView create() {
        return new ModelAndView("AddNew", "product", new Product());
    }

    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirect){
        int randomId = (int) (Math.random()*100000);
        while (productService.findById(randomId) == null){
            randomId = (int) (Math.random()*100000);
        }
        product.setId(randomId);
        productService.save(product);
        redirect.addFlashAttribute("status","succes!!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model ,RedirectAttributes redirect) {
        model.addAttribute("product", productService.findById(id));
        Product product = productService.findById(id);
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
//    @PostMapping("/customer/delete")
//    public String delete(Product product, RedirectAttributes redirect) {
//        productService.remove(product.getId());
//        redirect.addFlashAttribute("success", "Removed customer successfully!");
//        return "redirect:/";
//    }
}
