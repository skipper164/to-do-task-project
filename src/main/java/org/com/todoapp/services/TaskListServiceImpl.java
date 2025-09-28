package org.com.todoapp.services;

import org.com.todoapp.data.models.TaskList;
import org.com.todoapp.data.repositories.TaskListRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }

    @Override
    public TaskList createTaskList(TaskList taskList) {

        if(null != taskList.getId()) {
            throw new IllegalArgumentException("TaskList already has an id");
        }
        if(null == taskList.getTitle() || taskList.getTitle().isBlank()) {
            throw new IllegalArgumentException("TaskList title must be provided");
        }

            LocalDate now = LocalDate.from(LocalDateTime.now());
            TaskList newTaskList = new TaskList();
            newTaskList.setTitle(taskList.getTitle());
            newTaskList.setUser(taskList.getUser());
            newTaskList.setCreated(now);
            newTaskList.setUpdatedAt(now);
            TaskList saved = taskListRepository.save(newTaskList);
            return saved;

    }

    @Override
    public Optional<TaskList> findById(String id) {
        return taskListRepository.findById(id);
    }

    @Override
    public TaskList updateTaskList(TaskList taskList, String id) {
        TaskList existingTaskList = taskListRepository.findById(id).orElseThrow();

        existingTaskList.setTitle(taskList.getTitle());
        existingTaskList.setUpdatedAt(LocalDate.now());
        return taskListRepository.save(existingTaskList);

    }

    @Override
    public void deleteTaskList(String id) {
        taskListRepository.deleteById(id);
    }


}
