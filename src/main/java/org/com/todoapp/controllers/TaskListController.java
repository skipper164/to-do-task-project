package org.com.todoapp.controllers;

import org.com.todoapp.dto.TaskListDto;
import org.com.todoapp.services.TaskListService;
import org.com.todoapp.services.TaskListServiceImpl;
import org.com.todoapp.utils.TaskListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/task_lists")
public class TaskListController {

    @Autowired
    private TaskListServiceImpl taskListService;
    @Autowired
    private  TaskListMapper taskListMapper;

//    @Autowired
//    public TaskListController(TaskListServiceImpl taskListService, TaskListMapper taskListMapper) {
//        this.taskListService = taskListService;
//        this.taskListMapper = taskListMapper;
//    }

    @GetMapping
    public List<TaskListDto> listTaskLists() {
        return taskListService.listTaskLists()
                .stream().map(taskListMapper::toDto)
                .toList();

    }

    @PostMapping
    public TaskListDto createTaskList(TaskListDto taskListDto) {
        return taskListMapper.toDto(taskListService.createTaskList(taskListMapper.fromDto(taskListDto)));
    }

    @GetMapping(path = "/{task_lists_id}")
    public Optional<TaskListDto> findById(String id) {
        return taskListService.findById(id)
                .map(taskListMapper::toDto);

    }
}
