package fincheck.Jstack.transaction;

import fincheck.Jstack.bankAccount.BankAccount;
import fincheck.Jstack.category.Category;
import fincheck.Jstack.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Long value;
    private LocalDateTime date;
    private typeEnum type;

    @ManyToOne
    private User user;
    @ManyToOne
    private BankAccount bankAccount;
    @ManyToOne
    private Category category;

}
