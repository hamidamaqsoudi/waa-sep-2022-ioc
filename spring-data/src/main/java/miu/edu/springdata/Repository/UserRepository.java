package miu.edu.springdata.Repository;
import miu.edu.springdata.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {



}
