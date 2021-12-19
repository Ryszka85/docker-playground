package at.ra85.dockerplayground;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name;


}
