/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Imc;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sergio
 */
public interface ImcRepository extends CrudRepository<Imc, Integer>   {
    
}
