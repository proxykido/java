/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.ImcService;
import com.example.demo.entity.Imc;
import com.example.demo.imcDto.imcDto;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Sergio
 */
@Controller
public class HolaMundoController {
    @Autowired
    private ImcService imcService;
    
    @GetMapping("/holaMundo")
    public String holaMundo(Model modelo ) {
        List<Imc> data = imcService.findAll();
        System.out.println(data);
        modelo.addAttribute("nombres",data.toArray());
        return "hola";
}   

    @PostMapping("/holaMundo")
    public void saveImc(Model modelo, @RequestBody imcDto imcDto ) {
        modelo.addAttribute("Hola mundo desde save ---->"+imcDto.getNombre());
        Imc imc = new Imc();
        imc.setNombre(imcDto.getNombre());
        imcService.saveImc(imc);
    }
}