/* Copyright (c) 2024, Charles T. */

module pong {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    exports abitodyssey.pong;

    opens abitodyssey.pong to javafx.fxml;
}
