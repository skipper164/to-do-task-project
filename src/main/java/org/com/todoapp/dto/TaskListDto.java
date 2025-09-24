package org.com.todoapp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@Document
public class TaskListDto {
    private String id;
    private String name;
    private String description;
    private Integer count;
    private List<TaskDto> tasks;


}
