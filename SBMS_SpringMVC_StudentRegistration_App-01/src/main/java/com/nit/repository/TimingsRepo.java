package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.TimingsEntity;
@Repository
public interface TimingsRepo extends JpaRepository<TimingsEntity, Serializable> {

}
