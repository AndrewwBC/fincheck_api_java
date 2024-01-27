package fincheck.Jstack.user;


import fincheck.Jstack.bankAccount.BankAccount;
import fincheck.Jstack.category.Category;
import fincheck.Jstack.transaction.Transaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<BankAccount> bankAccounts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions = new ArrayList<>();
}
