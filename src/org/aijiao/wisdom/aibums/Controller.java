package org.aijiao.wisdom.aibums;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

//    @FXML
//    ImageView imageView;

    @FXML
    FlowPane flowPane;

    public void initialize(URL location, ResourceBundle resources) {
    }

    public void shouImage() {
//        final Image image = new Image(Main.class.getResourceAsStream("/a.png"));
//        final Image image = new Image(Main.class.getResourceAsStream("/b.jpg"));
//        imageView.setImage(image);

        File file = new File("F:\\应用宝照片备份\\IMG_20170408_160221.jpg");
        String localUrl = file.toURI().toString();
        Image localImage = new Image(localUrl, false);
        ImageView imageView = new ImageView(localImage);
        imageView.setImage(localImage);
        imageView.setFitHeight(120);
        imageView.setFitWidth(120);
        flowPane.getChildren().addAll(imageView);
    }

}