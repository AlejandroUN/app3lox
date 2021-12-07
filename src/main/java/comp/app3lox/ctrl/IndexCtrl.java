package comp.app3lox.ctrl;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Label;

public class IndexCtrl extends BaseCtrl {

	private Label lblsaludo;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception{
		super.doAfterCompose(comp);
		lblsaludo.setValue("Hola compañero");
	}
	
	public void onClick$btnEvent(Event event) {
		lblsaludo.setValue("Cambio");
		lblsaludo.setStyle("color:blue");
	}
}
