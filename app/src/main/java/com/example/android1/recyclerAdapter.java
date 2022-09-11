package com.example.android1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolderNums> {

    ArrayList<Integer> listNumb;

    public recyclerAdapter(ArrayList<Integer> listNumb) {
        this.listNumb = listNumb;
    }

    public class ViewHolderNums extends RecyclerView.ViewHolder {

        TextView numeros;


        public ViewHolderNums(@NonNull View itemView) {
            super(itemView);
            numeros= itemView.findViewById(R.id.numList);
        }

        public void meterNumeros(Integer numero) {
            String numText =  String.valueOf(numero);
            numeros.setText(numero);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.ViewHolderNums onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.num_list,null,false);
        return new ViewHolderNums(v);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.ViewHolderNums holder, int position) {
        holder.meterNumeros(listNumb.get(position));
    }

    @Override
    public int getItemCount() {
        return listNumb.size();
    }
}
