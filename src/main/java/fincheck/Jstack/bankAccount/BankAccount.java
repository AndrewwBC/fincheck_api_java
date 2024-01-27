package fincheck.Jstack.bankAccount;

import fincheck.Jstack.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.UUID;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "user_id")
    private UUID userId;
    private String name;
    private Long initialBalance;
    private typeEnum type;
    private String color;
    @ManyToOne
    private User user;


}
