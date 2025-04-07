package se.lexicon;

public class TodoItemTask {
    // Fields
// [access modifier] [data type] [variable name];
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }
// test
    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

// Methods

}
