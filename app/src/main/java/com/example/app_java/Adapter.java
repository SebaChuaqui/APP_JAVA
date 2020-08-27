package com.example.app_java;

import android.renderscript.ScriptGroup;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_java.Apartment;
import com.example.app_java.databinding.DepartamentoBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemViewHolder> {
    private List<Apartment> apartmentList;
    private PassElementSelect mListener;

    public Adapter(List<Apartment> apartmentList, PassElementSelect mListener) {
        this.apartmentList = apartmentList;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView img;
        private TextView tv1, tv2, tv3;

        public ItemViewHolder(@NonNull DepartamentoBinding mBinding) {
            super(mBinding.getRoot());
            img=mBinding.imgDepto;
            tv1=mBinding.tvEdif;
            tv2=mBinding.tvDepto;
            tv3=mBinding.tvDirec;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {

        }
    }

    public interface PassElementSelect{
        void passElement(Apartment apartment);
    }
}