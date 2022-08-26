package com.springbootdemo.multipleddsameconfig.repository.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipleddsameconfig.model.manager.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
