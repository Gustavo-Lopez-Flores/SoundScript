package com.example.soundscript;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.soundscript.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        int[] list=new int[] {
                R.drawable.albuns_arlindo_cruz, R.drawable.albuns_caetano_veloso,R.drawable.albuns_cartola,
                R.drawable.albuns_chico_buarque, R.drawable.albuns_ed_motta, R.drawable.albuns_frank_sinatra,
                R.drawable.albuns_grover_washington};
        binding.grid1.setAdapter(new Adaptador(getContext(),list));
        binding.grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String album="";
                switch (position){
                    case 0:
                        album="Álbum: Arlindo Cruz";
                        break;
                    case 1:
                        album="Álbum: Caetano Veloso";
                        break;
                    case 2:
                        album="Álbum: Cartola";
                        break;
                    case 3:
                        album="Álbum: Ed Motta";
                        break;
                    case 4:
                        album="Álbum: Frank Sinatra";
                        break;
                    case 5:
                        album="Álbum: Grover Washington";
                        break;
                    default:
                        album="Outros";
                }
                binding.textviewSecond.setText(album);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}