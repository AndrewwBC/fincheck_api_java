package fincheck.Jstack.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

        private static UserService userService;
        public UserController (UserService UserService) {
        UserController.userService = UserService;
    }
        @GetMapping
        public String get() {

            userService.getAllUsers();

            return userService.getAllUsers().toString();
        }



}
