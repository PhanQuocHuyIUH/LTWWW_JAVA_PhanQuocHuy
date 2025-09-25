package iuh.fit.se.thigk.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    private Long id;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id") // foreign key column in DB
    @ToString.Exclude
    private User user;
}
