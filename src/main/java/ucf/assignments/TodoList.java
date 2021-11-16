package ucf.assignments;

import javafx.scene.Parent;

import java.time.zone.ZoneOffsetTransitionRule;

/* public class todolist{
Initialize todo list
Initialize a string title variable
Initialize an item array
Initialize number of items in list variable;
Todolist constructor method
Method to set a todo list title
	Title equals user input
Method to set a to do list
    array equals new to do list
Method to get a todo list title
    return title
Method to get a todo list
    return array
Method to add item to array
	 Array Add User Inputted Item
Method to remove item from array
    Initialize boolean removedIndex
    Initialize new Item Array
    Initialize int offset for removed index

	for loop through entire array
	  if array is 1 item from being original size
        break the for loop
		if the item is the one specified to be removed and has not already been removed
		    set removedIndex to true
		    set offset to 1
		    subtract one from number of items
		else
		    add to new array from original array
		close if statement
	end of for loop
	set new array
Method to display all existing items/Incomplete/Complete items specifying which in argument
	for loop through entire list
		if all/completed/not completed depending on user input
			Display Item Description
			Display Item Due Date
		close if statement
	end of for loop


}

 */
public class TodoList {
    private String title = "Default";
    private Item[] list = new Item[100];
    private int numItems = 0;
    TodoList(){
        this.title = title;
        this.list = list;
        this.numItems = numItems;

    }

    public TodoList(String title){
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setList(Item[] list) {
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public int getNumItems() {
        return numItems;
    }

    public Item[] getList() {
        return list;
    }

    public void addToList(Item task){
        list[numItems] = task;
        numItems++;
    }

    public void removeFromList(int numitem){
        boolean removeIndex = false;
        int removeOffset = 0;
        Item[] newItemArray = new Item[100];
        for (int i = 0; i < list.length; i++)
        {
            if (i == list.length - 1)
                break;

            //if (list[i].getDescription().equals(task.getDescription()) && list[i].getDueDate().equals(task.getDueDate()) && removeIndex == false && list[i].getTitle().equals(task.getTitle()))
            if (i + 1 == numitem)
            {
                removeIndex = true;
                removeOffset = 1;
                numItems--;
            }
            else
            {
                newItemArray[i] = list[i-removeOffset];
            }
        }
        list = newItemArray;
    }

    public void display(boolean optionC, boolean optionI){
        if (optionC)
        {
            for (int i = 0; i < list.length; i++){
                System.out.println(list[i]);
            }
        }
        if (optionI)
        {

        }
    }

}
