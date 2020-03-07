package project.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime time;

    @Column(name = "autor_id")
    private Integer authorId;

    @Column(name = "recipient_id")
    private Integer recipientId;

    @Column(name = "message_text")
    private String messageText;

    @Column(name = "read_status")
    private ReadStatus readStatus;
}
