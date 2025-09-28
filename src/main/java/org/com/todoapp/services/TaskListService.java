package org.com.todoapp.services;

import org.com.todoapp.data.models.TaskList;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
    Optional<TaskList> findById(String id);
    TaskList updateTaskList(TaskList taskList, String id);
    void deleteTaskList(String id);
}
