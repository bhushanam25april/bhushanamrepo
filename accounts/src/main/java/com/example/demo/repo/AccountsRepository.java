package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AccountsEntity;

public interface AccountsRepository extends JpaRepository<AccountsEntity,String> {

	List<AccountsEntity> findAllByCifId(String cifId);

}
