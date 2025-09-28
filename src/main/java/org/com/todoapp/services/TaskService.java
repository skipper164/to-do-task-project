package org.com.todoapp.services;

import org.com.todoapp.data.models.Task;

import java.util.List;

public interface TaskService {
    List<Task> listTasks(String id);
}
