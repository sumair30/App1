package git_hub_sumair_app1.database.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import git_hub_sumair_app1.controller.dto.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByName(String name);
	List<User> findById(int id);
	
	@Transactional
	@Modifying
	@Query("update User u set u.name = ?1 where u.id = ?2")
	int updateUserName(String name, int id);
	
}
