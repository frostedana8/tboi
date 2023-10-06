/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.nanner.tboi.controllers;

import es.nanner.tboi.models.Item;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nana
 */

@RestController
@RequestMapping("item")
public class ItemController {
    
    @GetMapping
    public List<Item> getAll(){
        
        
        return null;
    }
    
}
