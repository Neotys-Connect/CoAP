package com.neotys.ps.iot;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.google.common.base.Optional;
import com.neotys.extensions.action.Action;
import com.neotys.extensions.action.ActionParameter;
import com.neotys.extensions.action.engine.ActionEngine;

public final class CoAPRequestAction implements Action{
	private static final String BUNDLE_NAME = "com.neotys.ps.iot.bundle";
	private static final String DISPLAY_NAME = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault()).getString("displayName");
	private static final String DISPLAY_PATH = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault()).getString("displayPath");
    private static final ImageIcon DISPLAY_ICON = new ImageIcon(CoAPRequestAction.class.getResource(ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault()).getString("iconPath")));

	@Override
	public String getType() {
		return "CoAPRequest";
	}

	@Override
	public List<ActionParameter> getDefaultActionParameters() {
		final List<ActionParameter> parameters = new ArrayList<ActionParameter>();
		/** TODO Add default parameters
            Example parameter :
            parameters.add(new ActionParameter("Method","GET"));
        **/
		return parameters;
	}

	@Override
	public Class<? extends ActionEngine> getEngineClass() {
		return CoAPRequestActionEngine.class;
	}

	@Override
	public Icon getIcon() {
		return DISPLAY_ICON;
	}

	@Override
	public boolean getDefaultIsHit(){
		return false;
	}

	@Override
	public String getDescription() {
		final StringBuilder description = new StringBuilder();
		// TODO Add description
		description.append("CoAPRequest description.\n");
		return description.toString();
	}

	@Override
	public String getDisplayName() {
		return DISPLAY_NAME;
	}

	@Override
	public String getDisplayPath() {
		return DISPLAY_PATH;
	}

    @Override
    public Optional<String> getMinimumNeoLoadVersion() {
        return Optional.absent();
    }

    @Override
    public Optional<String> getMaximumNeoLoadVersion() {
        return Optional.absent();
    }


}
