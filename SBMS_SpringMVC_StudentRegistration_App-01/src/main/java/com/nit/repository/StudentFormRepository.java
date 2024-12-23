package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.binders.StudentFormBinders;

@Repository
public interface StudentFormRepository extends JpaRepository<StudentFormBinders, Serializable>{

}
