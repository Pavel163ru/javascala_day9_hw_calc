
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

object CalcScala
{
  def main(args: Array[String])
  {
    Application.launch(classOf[CalcScala], args: _*)
  }
}

class CalcScala extends Application
{
  override def start(primaryStage: Stage)
  {

    val root: Parent = FXMLLoader.load(getClass().getResource("/main/calculator.fxml"))

    val scene = new Scene(root)

    primaryStage.setScene(scene)
    primaryStage.centerOnScreen()
    primaryStage.setTitle("CalcScala")
    primaryStage.show
  }
}