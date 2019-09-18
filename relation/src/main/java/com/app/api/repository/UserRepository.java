/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.api.repository;

import com.app.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jhon Baron
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
