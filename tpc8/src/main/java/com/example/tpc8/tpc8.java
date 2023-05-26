package com.example.tpc8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class tpc8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Texto tpc8 verde
        Text texto = new Text("TPC 8");
        texto.setFont(Font.font("Arial", FontWeight.BOLD, 42));
        texto.setFill(Color.GREEN);
        texto.setLayoutX(50);
        texto.setLayoutY(50);


        // quadrado azul
        Rectangle retangulo = new Rectangle(100, 150, 100, 100);
        retangulo.setFill(Color.BLUE);
        retangulo.setStroke(Color.BLACK);
        retangulo.setStrokeWidth(4);

        // Linha vermelha
        Line linha = new Line(670, 100, 300, 100);
        linha.setStroke(Color.RED);
        linha.setLayoutX(-150);
        linha.setLayoutY(150);
        linha.setRotate(45);

        //trinagulo amarelo
        Polygon triangulo = new Polygon(400, 150, 500, 250, 300, 250);
        triangulo.setFill(Color.YELLOW);
        triangulo.setStroke(Color.YELLOW);
        Line linhaTriangulo = new Line(400, 150, 500, 250);
        linhaTriangulo.setStroke(Color.YELLOW);
        triangulo.setRotate(225);

        double X = -((530 - 200) / 2.0); // Calcular o deslocamento horizontal necessário
        double Y = -((200 - 500) / 2.0); // Calcular o deslocamento vertical necessário
        triangulo.setTranslateX(X);
        triangulo.setTranslateY(Y);



        // Círculo
        Circle circulo = new Circle(100, 500, 50);
        circulo.setFill(Color.ORANGE);

        double PosicaoX = 390; // Nova posição horizontal
        double PosicaoY = 430; // Nova posição vertical
        circulo.setCenterX(PosicaoX);
        circulo.setCenterY(PosicaoY);


        // Imagem
        Image imagem = new Image("uta-logo.png");
        ImageView imageView = new ImageView(imagem);
        imageView.setLayoutX(50);
        imageView.setLayoutY(470);

        root.getChildren().addAll(texto, linha, triangulo, linhaTriangulo, retangulo,circulo, imageView);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TPC-8 Trabalhar com scene");
        primaryStage.show();
        scene.setFill(Color.LIGHTSKYBLUE);

    }
}
