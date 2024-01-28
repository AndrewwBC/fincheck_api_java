package fincheck.Jstack.bankAccount;

import fincheck.Jstack.transaction.Transaction;
import fincheck.Jstack.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Long initialBalance;
    private typeEnum type;
    private String color;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "bankAccount", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Transaction> transactions = new ArrayList<>();


}
