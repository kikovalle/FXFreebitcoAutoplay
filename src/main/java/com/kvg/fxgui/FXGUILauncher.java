package com.kvg.fxgui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class FXGUILauncher extends Application {

	private Stage stage;
	private static final Logger LOG = LoggerFactory.getLogger(FXGUILauncher.class);


	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		Application.launch(FXGUILauncher.class, args);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start(final Stage primaryStage) throws Exception {
		setStage(primaryStage);
		LOG.debug("Application start - loading main window.");
		FXMLLoader loader1 = new FXMLLoader();
		AnchorPane pnl = loader1.load(FXGUILauncher.class.getResource("/com/kvg/fxgui/view/PLGBotBtc.fxml").openStream());
		Scene scene = new Scene(pnl);
		getStage().setScene(scene);
		getStage().setMaximized(true);
		getStage().show();
	}


	/**
	 * @return
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * @param stage
	 */
	public void setStage(final Stage stage) {
		this.stage = stage;
	}



}
