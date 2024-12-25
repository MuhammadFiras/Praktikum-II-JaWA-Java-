package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String> kolom1 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NAMA");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getItems().add(new Mahasiswa(1, "123456", "Firas"));
        tabel.getItems().add(new Mahasiswa(2, "234567", "Andi"));
        tabel.getItems().add(new Mahasiswa(3, "345678", "Evan"));
        tabel.getItems().add(new Mahasiswa(4, "456789", "Titus"));
        tabel.getItems().add(new Mahasiswa(5, "567890", "King Kong"));
        tabel.getItems().add(new Mahasiswa(6, "678901", "Tifa Lockhart"));
        tabel.getItems().add(new Mahasiswa(7, "789012", "Big Boss"));
        tabel.getItems().add(new Mahasiswa(8, "890123", "Mario"));
        tabel.getItems().add(new Mahasiswa(9, "901234", "Luigi"));
        tabel.getItems().add(new Mahasiswa(10, "102938", "Willie"));

        VBox vbox = new VBox(tabel);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
