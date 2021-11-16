package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;



public class Controller {
    TodoList currentList = new TodoList();
    @FXML
    private ScrollPane itemListPane;
    @FXML
    private Label enterTitleLbl;
    @FXML
    private TextField enterTitleFldNew;
    @FXML
    private TextField enterTitleFldLoad;
    @FXML
    private TextField itemTitle;
    @FXML
    private DatePicker dateField;
    @FXML
    private TextArea description;
    @FXML
    private  GridPane itemInfo;
    @FXML
    private Label TitleList;
    @FXML
    private Button saveBtn;
    @FXML
    private TextField removeTxt;
    @FXML
    private Button clearBtn;

    @FXML
    protected void newList(ActionEvent event) throws IOException {
        String temp = enterTitleFldNew.getText();
        try {
            String name = temp + ".txt";
            File myFile = new File("ToDoLists/" + name);
            if (myFile.createNewFile()) {
            } else {

            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        System.out.println("run");
        TitleList.setText(temp);
    }
    @FXML
    protected void clearList(ActionEvent event) throws IOException {
        currentList = new TodoList();
        itemInfo.getChildren().clear();
    }
    @FXML
    protected void removeList(ActionEvent event) throws IOException {

        currentList.removeFromList(Integer.parseInt(removeTxt.getText()));
        itemInfo.getChildren().remove(Integer.parseInt(removeTxt.getText()));
    }
    @FXML
    protected void saveList(ActionEvent event) throws IOException {

        try {
            FileWriter myFile = new FileWriter("ToDoLists/"+ TitleList.getText() +".txt", true);

            myFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @FXML
    protected void addItem(ActionEvent event) throws IOException {

        Label infoTitle = new Label();
        Label infoDescription = new Label();
        Label infoDate = new Label();
        CheckBox completed = new CheckBox();

        String iT = itemTitle.getText();
        String iD = description.getText();
        LocalDate dF = dateField.getValue();
        int rc = itemInfo.getRowCount();
        infoTitle.setText(((rc+1) + ". " + iT));
        infoDescription.setText(iD);
        infoDate.setText(String.valueOf(dF));

        Item newItem;
        newItem = new Item(itemTitle.getText(),description.getText(),dateField.getAccessibleText(), false);
        currentList.addToList(newItem);
        System.out.println(currentList.getNumItems());





        if (iT != null && iD != null && dF != null){
            itemInfo.add(infoTitle, 0, rc);
            itemInfo.add(infoDate, 1, rc);
            itemInfo.add(infoDescription, 2, rc);
            completed.setTranslateX(400);
            completed.setTranslateY(rc*17);
            itemInfo.getChildren().add(completed);


        }
        else
        {
        }
        /*
         */



    }

}
