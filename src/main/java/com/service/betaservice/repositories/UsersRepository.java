package com.service.betaservice.repositories;


import com.service.betaservice.dblayer.entities.UsersEntities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersRepository extends CrudRepository<UsersEntities,Integer> {


}
