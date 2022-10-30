package com.java.githubcicdactions;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.githubcicdactions.controllers.TaskController;
import com.java.githubcicdactions.entity.Task;
import com.java.githubcicdactions.repositories.TaskRepository;

@ExtendWith(MockitoExtension.class)
public class TaskServicesTests {
    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskController taskController;

    @Test
    public void testAddTask() {
        Task task = new Task();
        task.setName("Test Task");
        task.setDescription("Test Description");
        task.setStatus("doing");
        Mockito.when(taskRepository.save(task)).thenReturn(task);
        Task t = taskController.addTask(task);
        org.assertj.core.api.Assertions.assertThat(t.getName()).isEqualTo("Test Task");
        Mockito.verify(taskRepository).save(task);
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task();
        task.setName("Test Task");
        task.setDescription("Test Description");
        task.setStatus("doing");
        taskController.deleteTask(task.getId());
        Mockito.verify(taskRepository).deleteById(task.getId());
    }


    
}
