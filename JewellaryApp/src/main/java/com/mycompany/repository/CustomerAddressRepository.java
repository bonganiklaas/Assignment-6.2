/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.domain.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BONGANI
 */
public interface CustomerAddressRepository extends CrudRepository <CustomerAddress,Long> {
    
}
