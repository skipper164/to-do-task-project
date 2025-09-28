package org.com.todoapp.services;

import org.com.todoapp.data.models.Task;
import org.com.todoapp.data.repositories.TaskRepository;

import java.util.List;

public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTasks(String id) {
        return taskRepository.findById(id);
    }
}
