package kinoCMS.database.repository;

import kinoCMS.database.models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersCrudRepository extends JpaRepository<UsersEntity, Integer> {
}
