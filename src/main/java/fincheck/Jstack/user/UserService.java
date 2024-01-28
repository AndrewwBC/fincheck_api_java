package fincheck.Jstack.user;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        System.out.println("Usuarios:" + users);
        return users;
    }


}
