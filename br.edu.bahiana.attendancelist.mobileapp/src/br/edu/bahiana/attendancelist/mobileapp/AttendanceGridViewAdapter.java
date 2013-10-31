package br.edu.bahiana.attendancelist.mobileapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AttendanceGridViewAdapter extends BaseAdapter {

	private Context mContext;
	
	public AttendanceGridViewAdapter(Context c){
		mContext = c;
	}
	
	@Override
	public int getCount() {
		return 10; //mContext.items.count;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {		
		View v;
		if(convertView == null) {
	        LayoutInflater li = LayoutInflater.from(mContext);
	        v = li.inflate(R.layout.grid_view, null);
	    } else {             
	        v = convertView;         
	    }

//	    TextView tv = (TextView)v.findViewById(R.id.grid_item_text);
//	    tv.setText(items.get(position));         

	    return v;     
	}

}
