/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Imc;
import com.example.demo.repository.ImcRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class ImcService {
    @Autowired
    private ImcRepository imcRepository;
    
    public List<Imc> findAll() {        return (List<Imc>) imcRepository.findAll();
    
    }
    public void saveImc(Imc imc) {
        imcRepository.save(imc);
    }
}
