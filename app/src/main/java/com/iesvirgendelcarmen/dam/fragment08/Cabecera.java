package com.iesvirgendelcarmen.dam.fragment08;

import android.content.Context;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by matinal on 25/10/2017.
 */

public class Cabecera extends ListFragment {
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Elementos.Cabeceras));

        }
        public interface CabeceraListener{
            public void tocado(int position);
        }
        CabeceraListener mCallback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallback = (CabeceraListener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        mCallback.tocado(position);

    }
}
