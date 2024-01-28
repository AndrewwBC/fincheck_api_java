package fincheck.Jstack.category;

import fincheck.Jstack.transaction.Transaction;
import fincheck.Jstack.user.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String icon;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "category")
    private List<Transaction> transactions = new ArrayList<>();
}
