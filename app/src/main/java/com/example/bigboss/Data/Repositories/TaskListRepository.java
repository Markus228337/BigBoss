package com.example.bigboss.Data.Repositories;

import com.example.bigboss.Data.Models.Task;

import java.util.List;

public interface TaskListRepository {
    public List<Task> getTasks();
    public Task get(int index);
    public void add(Task task);
    public boolean isEmpty();
    public void clearAll();
    public int getSize();
}
