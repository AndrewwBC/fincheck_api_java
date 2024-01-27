package fincheck.Jstack.category;


import fincheck.Jstack.user.User;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "user_id")
    private String userId;
    private String name;
    private String icon;
    @ManyToOne
    private User user;
}
