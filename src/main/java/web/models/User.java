package web.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Email")
    private String email;

    @Column(name="Password")
    private String password;

}
