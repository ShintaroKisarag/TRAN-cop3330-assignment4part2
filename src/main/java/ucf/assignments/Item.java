package ucf.assignments;

/*public class Item{
    Initialize item class
    Initialize a string description variable
                    Initialize a string due date variable
                    Initialize a boolean completion variable
    Create an item constructor
    Create a method to set an item's description
    Item description equals user input
    Create a method to set an item's due date
    Item due date equals user input
    Create a method to set the completion variable
    Completion status equals to opposite of current

    Create a method to get an item's description
    Returns item description
    Create a method to get an item's due date
    Returns due date
    Create a method to get the completion variable
    Returns completion


}*/
public class Item {
    private String title;
    private String description;
    private String dueDate;
    private Boolean completion;

    public Item()
    {
        this.title = "Default";
        this.description = "Default";
        this.dueDate = "1970-01-01";
        this.completion = false;
    }
    public Item(String title, String description, String dueDate, Boolean completion){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completion = completion;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompletion(Boolean completion) {
        this.completion = completion;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
    public Boolean getCompletion() {
        return completion;
    }
    public String getTitle() {
        return title;
    }

}
