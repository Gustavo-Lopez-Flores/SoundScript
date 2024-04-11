package com.example.soundscript;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.soundscript.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getContext(),
                R.array.playlist, android.R.layout.simple_spinner_item);
        binding.spinner1.setAdapter(adapter);
        binding.spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(mediaPlayer!=null){
                    mediaPlayer.release();
                }
                switch (position){
                    case 1:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.fly_me_to_the_moon);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.fora_da_lei);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.joao_e_maria);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.just_the_two_of_us);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.o_bem);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.o_sol_nascera);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.voce_ja_foi_a_bahia);
                        mediaPlayer.start();
                        break;
                }
                if(mediaPlayer!=null){
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mediaPlayer.release();
                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return binding.getRoot();

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