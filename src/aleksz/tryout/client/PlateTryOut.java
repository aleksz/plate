package aleksz.tryout.client;

import aleksz.plate.client.PlateWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class PlateTryOut implements EntryPoint {

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(new PlateWidget());
  }

}
