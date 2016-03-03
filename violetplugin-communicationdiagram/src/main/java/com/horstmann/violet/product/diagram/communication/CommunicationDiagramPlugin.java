package com.horstmann.violet.product.diagram.communication;

import java.util.Locale;
import java.util.ResourceBundle;

import com.horstmann.violet.framework.plugin.IDiagramPlugin;
import com.horstmann.violet.product.diagram.abstracts.IGraph;
/**
 * 
 * @author Artur Ratajczak
 *
 */
public class CommunicationDiagramPlugin implements IDiagramPlugin {

	@Override
	public String getDescription() {
		return "Communication UML diagram";
	}

	@Override
	public String getProvider() {
		return "Alexandre de Pellegrin / Cays S. Horstmann";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}	

	@Override
	public String getName() {
		return this.rs.getString("menu.communication_diagram.name");
	}

	@Override
	public String getCategory() {
		return this.rs.getString("menu.communication_diagram.category");
	}

	@Override
	public String getFileExtension() {
		return this.rs.getString("files.communication.extension");
	}

	@Override
	public String getFileExtensionName() {
		return this.rs.getString("files.communication.name");
	}

	@Override
	public String getSampleFilePath() {
		return this.rs.getString("sample.file.path");
	}

	@Override
	public Class<? extends IGraph> getGraphClass() {
		return CommunicationDiagramGraph.class;
	}
	 private ResourceBundle rs = ResourceBundle.getBundle(CommunicationDiagramConstant.COMMUNICATION_DIAGRAM_STRINGS, Locale.getDefault());
}
