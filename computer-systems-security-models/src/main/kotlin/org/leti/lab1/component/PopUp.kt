package org.leti.lab1.component

import javafx.application.Platform
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Control
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Modality
import javafx.stage.Stage
import java.lang.Exception


private const val POPUP_WIDTH = 400.0
private const val POPUP_HEIGHT = 250.0

fun showPopup(message: String, buttonText: String = "OK") {
    val messageLabel = Label(message)
    val confirmButton = createCloseButton(buttonText)
    val vBox = VBox(messageLabel, confirmButton).apply {
        spacing = 30.0
        alignment = Pos.CENTER
    }
    val stageScene = Scene(vBox, POPUP_WIDTH, POPUP_HEIGHT)
    Platform.runLater {
        Stage().apply {
            scene = stageScene
            initModality(Modality.WINDOW_MODAL)
            show()
        }
    }
}

fun showErrorPopup(exception: Exception) {
    showPopup("Ошибка! \n $exception")
}

private fun createCloseButton(text: String) = Button(text).apply {
    setOnAction { closeSelfWindowAction(this) }
}

private fun closeSelfWindowAction(windowComponent: Control) {
    val buttonStage = windowComponent.scene.window as Stage
    buttonStage.close()
}