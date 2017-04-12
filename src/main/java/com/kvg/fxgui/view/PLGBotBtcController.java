package com.kvg.fxgui.view;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.beans.value.ChangeListener;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

public class PLGBotBtcController implements Initializable, Serializable {

	/** Serializacion de clase java. */
	private static final long serialVersionUID = 77791370267191600L;
	private static final Logger LOG = LoggerFactory.getLogger(PLGBotBtcController.class);
	@FXML
	private WebView vistaWeb;
	@FXML
	private Button start;
	private String faucetUrl = "https://freebitco.in/?r=4047796";
	private ChangeListener<Worker.State> reloadHandler;
	final StringBuffer scriptBuffer = new StringBuffer();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		LOG.debug("Initializing view controller...");
		reloadHandler = (ov, oldState, newState) -> {
			if (Worker.State.SUCCEEDED.equals(newState)) {
				vistaWeb.getEngine().executeScript(scriptBuffer.toString());
			}
		};
		vistaWeb.getEngine().load(faucetUrl);
		try {
			final List<String> lines = IOUtils.readLines(PLGBotBtcController.class.getResourceAsStream("/js/bots/freebitcoin/script.js"));
			for (String line: lines) {
				scriptBuffer.append(line).append("\n");
			}
			scriptBuffer.append(scriptBuffer.toString());
		} catch (final IOException e) {
			LOG.error("Error loading script", e);
		}

	}

	/**
	 * @param event
	 */
	@FXML
	private void pulsadoInicio(final ActionEvent event) {
		event.consume();
		vistaWeb.getEngine().getLoadWorker().stateProperty().addListener(reloadHandler);
		vistaWeb.getEngine().executeScript(scriptBuffer.toString());
	}

}
