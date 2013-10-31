package br.edu.bahiana.attendancelist.mobileapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import br.edu.bahiana.attendancelist.mobileapp.dummy.ClassMenuContent;

/**
 * A fragment representing a single Classe detail screen. This fragment is
 * either contained in a {@link ClasseListActivity} in two-pane mode (on
 * tablets) or a {@link ClasseDetailActivity} on handsets.
 */
public class ClasseDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private ClassMenuContent.ClassMenuItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ClasseDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = ClassMenuContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_classe_detail,
				container, false);

		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			if (!mItem.IsTitle()){				
//				((TextView) rootView.findViewById(R.id.classe_detail))
//						.setText(Html.fromHtml(mItem.content));
				
				TableLayout table = (TableLayout)rootView.findViewById(R.id.classe_detail);
				
				//Table Header
				TableRow header = new TableRow(this.getActivity());
				header.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
				
				TextView tvName = new TextView(this.getActivity());
                tvName.setPadding(3,0,0,0);                             
                tvName.setText("Matrícula");
                header.addView(tvName);
				
				tvName = new TextView(this.getActivity());
                tvName.setPadding(3,0,0,0);
                tvName.setText("Nome");
                header.addView(tvName);
                
                tvName = new TextView(this.getActivity());
                tvName.setPadding(3,0,0,0);
                tvName.setText("Aula 1");
                header.addView(tvName);
                
                tvName = new TextView(this.getActivity());
                tvName.setPadding(3,0,0,0);
                tvName.setText("Aula 2");
                header.addView(tvName);
                
                tvName = new TextView(this.getActivity());
                tvName.setPadding(3,0,0,0);
                tvName.setText("Aula 3");
                header.addView(tvName);
                
				table.addView(header);
				
				addRow(table, "76431", "Jose Alonso da Silva");
				addRow(table, "7545", "Paulo Carvalho de Souza");
				addRow(table, "8934", "Antonio Carlos Lima");
				addRow(table, "4598", "Jefferson Cruz");
				addRow(table, "1029", "Laura Cardoso");
				addRow(table, "9859", "Livia Nunes");
			}
		}

		return rootView;
	}
	
	private void addRow(TableLayout table, String matricula, String nome){
		TableRow row = new TableRow(this.getActivity());
		row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
		
		TextView tvName = new TextView(this.getActivity());
        tvName.setPadding(3,0,0,0);
        tvName.setText(matricula);
        row.addView(tvName);
		
		tvName = new TextView(this.getActivity());
        tvName.setPadding(3,0,0,0);
        tvName.setText(nome);
        row.addView(tvName);
        
        CheckBox cbx = new CheckBox(this.getActivity());
        cbx.setPadding(3,0,0,0);                
        row.addView(cbx);
        
        cbx = new CheckBox(this.getActivity());
        cbx.setPadding(3,0,0,0);                
        row.addView(cbx);
        
        cbx = new CheckBox(this.getActivity());
        cbx.setPadding(3,0,0,0);                
        row.addView(cbx);
        
		table.addView(row);
	}
}
