package at.ra85.dockerplayground;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    UserEntity findByName(String name);

    List<UserEntity> findAll();

}
