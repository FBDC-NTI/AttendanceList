package br.edu.bahiana.attendancelist.mobileapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.text.Html;
import android.view.MenuItem;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ClassMenuContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<ClassMenuItem> ITEMS = new ArrayList<ClassMenuItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, ClassMenuItem> ITEM_MAP = new HashMap<String, ClassMenuItem>();

	static {
		// Add 3 sample items.
		addItem(new ClassMenuItem("1", "2013.2"));		
		addItem(new ClassMenuSubItem("2", "MDS138 - SAÚDE COLETIVA II (Teórica - Turma)"));
		addItem(new ClassMenuSubItem("3", "MDS323 - METODOLOGIA DA PESQUISA I G1"));
		addItem(new ClassMenuSubItem("4", "MDS323 - METODOLOGIA DA PESQUISA I G2"));
		addItem(new ClassMenuSubItem("5", "PMSH11 - ÉTICA E BIOÉTICA MEST/DOUT"));
		addItem(new ClassMenuSubItem("6", "PTS15 - MÉTODOS QUANTITATIVOS - II TURMA II"));
		addItem(new ClassMenuSubItem("7", "PTS18 - ÉTICA E BIOÉTICA TURMA II"));
		addItem(new ClassMenuItem("8", "2012.1"));
		//addItem(new ClassMenuItem("9", "MDS126 - SAÚDE COMUNITÁRIA - I Turma"));		
	}

	private static void addItem(ClassMenuItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class ClassMenuItem {
		public String id;
		public String content;		
		private Boolean isTitle;

		public ClassMenuItem(String id, String content) {
			this.id = id;
			this.content = content;
			this.isTitle = true;
		}

		@Override
		public String toString() {			
			return content;			
		}

		public Boolean IsTitle() {
			return isTitle;
		}		
		public void setIsTitle(Boolean isTitle){
			this.isTitle = isTitle;
		}
	}
	
	public static class ClassMenuSubItem extends ClassMenuItem{

		public ClassMenuSubItem(String id, String content) {
			super(id, content);
			this.setIsTitle(false);			
		}

		public String getAttendanceList(){
			return this.content+"<br />"+"Período:2013.2<br />"
					+ "<table>"+
				"<thead><tr><td>Matrícula</td><td>Aluno</td><td>Data</td><td>10/10</td><td>10/10</td></tr></thead><tbody><tr><td>011310046</td><td>ADMILSON OLIVEIRA MACHADO</td><td><input type='checkbox' /></td><td><input type='checkbox' /></td><td><input type='checkbox' /></td></tr></tbody></table>";
		}
		
		public String getTitle(){
			return this.content;
		}
		
		public String getSubtitle(){
			return "Período:2013.2";
		}
		
		@Override
		public String toString() {
			return "  "+content;
		}
	}
	
	
}
