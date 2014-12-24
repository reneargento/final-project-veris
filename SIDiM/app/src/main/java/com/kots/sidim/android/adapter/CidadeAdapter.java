package com.kots.sidim.android.adapter;


import java.util.List;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.kots.sidim.android.config.ConfigGlobal;
import com.kots.sidim.android.model.Cidade;


public class CidadeAdapter extends BaseAdapter implements Filterable{
	
	private Context context;
	private List<Cidade> cidades;
	SharedPreferences globalPrefs;
	SharedPreferences.Editor editor;
	
	
	public CidadeAdapter(Context context, List<Cidade> cidades){
		
		this.context = context;
		this.cidades = cidades;
		globalPrefs = context.getSharedPreferences(ConfigGlobal.GLOBAL_SHARED_PREFERENCES, Context.MODE_PRIVATE);
		editor = globalPrefs.edit();
		
	}

	@Override
	public int getCount() {

		return cidades.size();
	}

	@Override
	public Object getItem(int arg0) {

		return cidades.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {

		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
				

		Cidade cidade = cidades.get(arg0);
					
		TextView txtBairro = new TextView(context);
		txtBairro.setText(cidade.getNome());	

		return txtBairro;
	}

	@Override
	public Filter getFilter() {
		return null;
	}
	
}
