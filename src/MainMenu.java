import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class MainMenu {

    private GridPane _grid;
    private Scene _scene;

    public MainMenu(){
        _grid = new GridPane();
        _scene = new Scene(_grid, 500, 400);
    }

    public void SetMainMenuGrid(){
        _grid.setAlignment(Pos.CENTER);
        _grid.setHgap(10);
        _grid.setVgap(10);
        _grid.setPadding(new Insets(25, 25, 25, 25));
    }

    public Scene GetMainMenuScene(){
        return this._scene;
    }

    public void AddToGrid(Node obj, int width, int height ){
        _grid.add(obj, width, height);
    }

}
