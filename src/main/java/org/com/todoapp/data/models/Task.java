package org.com.todoapp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("tasks")
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    private TaskList taskList;
    private LocalDate dueDate;
    private TaskStatus status;
    private LocalDate created;
}
