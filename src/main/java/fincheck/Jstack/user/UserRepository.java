package fincheck.Jstack.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {


}
