/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.domain.JewelleryCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BONGANI
 */
@Repository
public interface JewelleryCategoryRepository extends JpaRepository<JewelleryCategory,Long>{
    
}
