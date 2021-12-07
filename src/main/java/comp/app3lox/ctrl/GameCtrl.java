package comp.app3lox.ctrl;

import java.util.ArrayList;
import java.util.List;
import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

import comp.app3lox.models.Game;

public class GameCtrl extends BaseCtrl {

	private Listbox lbxGame;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception{
		super.doAfterCompose(comp);	
		
		loadUser();
	}
	
	private void loadUser() {
	
			List<Game> list = new ArrayList<Game>();
			
			Game game = new Game();
			game.setFirstPlayer("Juan");
			game.setSecondPlayer("Alejo");
			game.setWinner("Juan");
			game.seMatrixOrder(2);
			list.add(game);
			
			game = new Game();
			game.setFirstPlayer("Vane");
			game.setSecondPlayer("Lau");
			game.setWinner("Lau");
			game.seMatrixOrder(2);
			list.add(game);
			
			if(list != null && list.size() > 0) {
				//lbxGame.getItems().clear();
				
				Listitem item;
				Listcell cell;
				
				for(Game curGame:list) {
					item = new Listitem();
					item.setParent(lbxGame);
					item.setValue(curGame);
					
					cell = new Listcell();
					cell.setParent(item);
					cell.setLabel(curGame.getFirstPlayer());
					
					cell = new Listcell();
					cell.setParent(item);
					cell.setLabel(curGame.getSecondPlayer());
					
					cell = new Listcell();
					cell.setParent(item);
					cell.setLabel(curGame.getWinner());
					
					cell = new Listcell();
					cell.setParent(item);
					cell.setLabel(String.valueOf(curGame.getMatrixOrder()));
												
				}
				// Refresca el listbox
				lbxGame.invalidate();
			}
	}
}
