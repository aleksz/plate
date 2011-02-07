package aleksz.plate.client;

import aleksz.plate.client.plates.PlateFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class PlateWidget extends Composite {

  private static PlateWidgetUiBinder uiBinder =
    GWT.create(PlateWidgetUiBinder.class);

  interface PlateWidgetUiBinder extends UiBinder<Widget, PlateWidget> {
  }

  @UiField
  TextBox sequence;

  @UiField
  Label type;

  public PlateWidget() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("sequence")
  void onKeyUp(KeyUpEvent e) {
    try {
      type.setText(PlateFactory.createPlate(sequence.getText()).getClass().getName());
    } catch (IllegalArgumentException iae) {
      type.setText("wrong");
    }
  }

}
