package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainApplication extends Application {

    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static Student currStudent;
    public static Employee currEmployee;
    private static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("pizza_application_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Sun Devil Pizza");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String scene_name) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(scene_name));
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("C:\\Users\\talal\\IdeaProjects\\students.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] data_split = data.split(",");
                students.add(new Student(data_split[0], data_split[1]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myObj = new File("C:\\Users\\talal\\IdeaProjects\\employees.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] data_split = data.split(",");
                if (Objects.equals(data_split[2], "Chef")) {
                    employees.add(new Chef(data_split[0], data_split[1]));
                } else {
                    employees.add(new OrderProcessingAgent(data_split[0], data_split[1]));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myObj = new File("C:\\Users\\talal\\IdeaProjects\\orders.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] data_split = data.split(",");
                ArrayList<String> toppings = new ArrayList<>();
                for(int i = 2; i < data_split.length; i++) {
                    toppings.add(data_split[i]);
                }
                orders.add(new Order(data_split[0], data_split[1], toppings));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        launch();
    }

    public static Student getStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if(Objects.equals(students.get(i).getId(), id)) {
                return students.get(i);
            }
        }
        return null;
    }

    public static Employee getEmployee(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if(Objects.equals(employees.get(i).getId(), id)) {
                return employees.get(i);
            }
        }
        return null;
    }
}