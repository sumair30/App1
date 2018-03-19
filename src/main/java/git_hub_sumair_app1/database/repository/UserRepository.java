package git_hub_sumair_app1.database.repository;


import org.springframework.data.repository.CrudRepository;

import git_hub_sumair_app1.controller.dto.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
