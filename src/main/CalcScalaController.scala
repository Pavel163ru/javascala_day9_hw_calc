package main

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.TextField
import java.net.URL
import java.util.ResourceBundle

class CalcScalaController extends Initializable {

  var data = 0f
  var operation = -1

  @FXML var one: Button = _
  @FXML var two: Button = _
  @FXML var three: Button = _
  @FXML var four: Button = _
  @FXML var five: Button = _
  @FXML var six: Button = _
  @FXML var seven: Button = _
  @FXML var eight: Button = _
  @FXML var nine: Button = _
  @FXML var zero: Button = _

  @FXML var clear: Button = _
  @FXML var plus: Button = _
  @FXML var minus: Button = _
  @FXML var mult: Button = _
  @FXML var div: Button = _
  @FXML var equals: Button = _

  @FXML var display: TextField = _

  @FXML def handleButtonAction(event: ActionEvent): Unit = {
    if (event.getSource eq one) display.setText(display.getText + "1")
    else if (event.getSource eq two) display.setText(display.getText + "2")
    else if (event.getSource eq three) display.setText(display.getText + "3")
    else if (event.getSource eq four) display.setText(display.getText + "4")
    else if (event.getSource eq five) display.setText(display.getText + "5")
    else if (event.getSource eq six) display.setText(display.getText + "6")
    else if (event.getSource eq seven) display.setText(display.getText + "7")
    else if (event.getSource eq eight) display.setText(display.getText + "8")
    else if (event.getSource eq nine) display.setText(display.getText + "9")
    else if (event.getSource eq zero) display.setText(display.getText + "0")
    else if (event.getSource eq clear) display.setText("")
    else if (event.getSource eq plus) {
      data = display.getText.toFloat
      operation = 1 //Addition

      display.setText("")
    }
    else if (event.getSource eq minus) {
      data = display.getText.toFloat
      operation = 2 //Substraction

      display.setText("")
    }
    else if (event.getSource eq mult) {
      data = display.getText.toFloat
      operation = 3 //Mul

      display.setText("")
    }
    else if (event.getSource eq div) {
      data = display.getText.toFloat
      operation = 4 //Division

      display.setText("")
    }
    else if (event.getSource eq equals) {
      val secondOperand = display.getText.toFloat
      var result = 0f
      operation match {
        case 1 =>
          result = data + secondOperand
          display.setText(String.valueOf(result))

        case 2 => //Subtraction

          result = data - secondOperand
          display.setText(String.valueOf(result))

        case 3 =>
          result = data * secondOperand
          display.setText(String.valueOf(result))

        case 4 => //Div
          try {
            result = data / secondOperand
          } catch {
            case e: Exception =>
              display.setText("Error")
          }
          display.setText(String.valueOf(result))

      }
    }
  }

  override def initialize(location: URL, resources: ResourceBundle): Unit = {}
}
