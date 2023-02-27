package main;

import controller.ProjectController;
import java.sql.Connection;
import model.Project;
import util.ConnectionFactory;

public class App {


    public static void main(String[] args) {
        
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) c);
        
        
        
//          ProjectController projectController = new ProjectController();
//        
//          Project project = new Project();
//          project.setName("Projeto teste");
//          project.setDescription("description");
//          projectController.save(project);      
    }
}
