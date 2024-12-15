package com.skydeteg.todolist.repositories;

import com.skydeteg.todolist.Model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {

}
