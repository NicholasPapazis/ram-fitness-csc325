module com.example.ramfitnesscsc325 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires google.cloud.firestore;
    requires firebase.admin;
    requires com.google.auth.oauth2;


    /*opens com.example.ramfitnesscsc325 to javafx.fxml;
    exports com.example.ramfitnesscsc325;
    exports viewmodel;
    opens viewmodel to javafx.fxml;*/
    opens viewmodel;
    exports viewmodel;
    opens dao;
    exports dao;
    opens model;
    exports model;

}