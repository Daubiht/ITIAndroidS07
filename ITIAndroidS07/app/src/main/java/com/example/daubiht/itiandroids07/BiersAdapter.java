package com.example.daubiht.itiandroids07;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;

/**
 * Created by Daubiht on 12/01/2018.
 */

class BiersAdapter extends RecyclerView.Adapter<BiersAdapter.BierHolder>{
    JSONArray bieres;

    public BiersAdapter(JSONArray biers) {
       bieres = biers;
    }

    @Override
    public void onBindViewHolder(BiersAdapter.BierHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public BierHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    class BierHolder extends RecyclerView.ViewHolder {

        public BierHolder(View itemView) {
            super(itemView);
        }
    }
}
