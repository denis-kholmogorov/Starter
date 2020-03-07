package project.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "block_history")
public class BlockHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime time;

    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "comment_id")
    private Integer commentId;

    private Action action;
}
