package org.com.todoapp.dto;

import org.com.todoapp.data.models.TaskList;
import org.com.todoapp.data.models.TaskStatus;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class TaskDto {
    private String id;
    private String name;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;

}
