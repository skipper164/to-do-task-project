package org.com.todoapp.utils;

import org.com.todoapp.data.models.Task;
import org.com.todoapp.dto.TaskDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
