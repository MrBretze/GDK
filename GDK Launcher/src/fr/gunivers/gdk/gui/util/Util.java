package fr.gunivers.gdk.gui.util;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Consumer;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;

public class Util
{
	public static Alert alert(AlertType type, String title, String header, String content, boolean wait)
	{
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		
		if (wait) alert.showAndWait(); else alert.show();
		return alert;
	}
	
	public static <P extends Pane, C extends Controller> C loadFXML(URL path, Consumer<P> action)
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(path);
		
		C controller = null;
		
		try
		{
			action.accept(loader.load());
			controller = loader.getController();
			
			if (controller != null)
				controller.setMainApplication(Application.getApp());
			else
				System.out.println("WARNING: No controller found for '"+ path.toString() +'\'');
		} catch (IOException e) { e.printStackTrace(); }
		
		return controller;
	}
	
	public static <K,V> Entry<K,V> newEntry(K key, V value)
	{
		return (new HashMap<K,V>() {
			private static final long serialVersionUID = -5357373460483833255L;
			{ put(key,value); }}
		).entrySet().iterator().next();
	}
}
