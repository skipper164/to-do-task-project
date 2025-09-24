package org.com.todoapp.data.repositories;

import org.com.todoapp.data.models.TaskList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends MongoRepository<TaskList, String> {

}
