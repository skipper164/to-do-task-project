package org.com.todoapp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document("task_lists")
public class TaskList {
    @Id
    private String id;
    private String title;
    private List<Task> tasks;
    @DBRef
    private User user;
    private LocalDate created;
    private LocalDate updatedAt;


}
