package com.example.soundscript;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.soundscript.databinding.FragmentFirstBinding;
import com.example.soundscript.databinding.FragmentThirdBinding;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<ItemListView> itens=new ArrayList<>();
        itens.add(0,new ItemListView(R.drawable.artista_arlindo_cruz,"Arlindo Cruz"));
        itens.add(1,new ItemListView(R.drawable.artista_caetano_veloso,"Caetano Veloso"));
        itens.add(2,new ItemListView(R.drawable.artista_cartola,"Cartola"));
        itens.add(3,new ItemListView(R.drawable.artista_chico_buarque,"Chico Buarque"));
        itens.add(4,new ItemListView(R.drawable.artista_ed_motta,"Chihuahua"));
        itens.add(3,new ItemListView(R.drawable.artista_frank_sinatra,"Frank Sinatra"));
        itens.add(4,new ItemListView(R.drawable.artista_grove_whashington_jr,"Grove Washington"));

        binding.list.setAdapter(new AdaptadorListView(getContext(),itens));

        final TextView textView = binding.textView3;
        textView.getText();
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}