package org.com.todoapp.utils;

import org.com.todoapp.data.models.TaskList;
import org.com.todoapp.dto.TaskListDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
