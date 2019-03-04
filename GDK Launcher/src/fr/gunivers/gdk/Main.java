package fr.gunivers.gdk;

import java.util.ArrayList;

import fr.gunivers.gdk.gui.util.Application;
import fr.gunivers.gdk.gui.util.Util;
import fr.gunivers.gdk.gui.view.BaseController;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application
{
	public final static String TITLE = "GDK Plugins Launcher";
	
	public final static ArrayList<GDKPlugin> plugins = new ArrayList<>();
	
	private BaseController controller;
	
	public static void main(String... args) { launch(args); }
	
	@Override
	public void initialize()
	{
		plugins.add(new GDKPlugin() {});
		plugins.add(new GDKPlugin("Test", "Test", "Test", "Test") {});
		plugins.add(new GDKPlugin("Name", "Author", "Version", "Description") {});
		
		controller = Util.loadFXML(Main.class.getResource("gui/view/Base.fxml"), (BorderPane p) -> { stage.setScene(new Scene(p)); });
		
		stage.show();
		stage.setTitle(TITLE);
	}
	
	public BaseController getController() { return controller; }
}
