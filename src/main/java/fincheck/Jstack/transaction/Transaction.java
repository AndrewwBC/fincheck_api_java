package fincheck.Jstack.transaction;

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

    @JoinColumn(name = "user_id")
    private UUID userId;
    private UUID bankAccountId;
    private UUID categoryId;
    private String name;
    private Long value;
    private LocalDateTime date;
    private typeEnum type;

    @ManyToOne
    private User user;

}
