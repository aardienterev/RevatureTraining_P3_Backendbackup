package com.revature.revspace.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.revspace.models.GroupThread;

public interface GroupThreadRepository extends CrudRepository<GroupThread, Integer>
{
//	@Query("select DISTINCT from groupthread g join g.user_id u where u.email = :email")
//	List<GroupThread> findByEmail(@Param("email")String email);
}
