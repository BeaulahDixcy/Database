package com.tcs.cruddatabase.repo;

import org.springframework.data.repository.CrudRepository;
import com.tcs.cruddatabase.variables.Data;

public interface CruddatabaseRepo extends CrudRepository<Data, Integer>
{

}
