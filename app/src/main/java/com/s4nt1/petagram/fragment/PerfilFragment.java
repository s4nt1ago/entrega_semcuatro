package com.s4nt1.petagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.s4nt1.petagram.R;
import com.s4nt1.petagram.adapter.FotosAdaptador;
import com.s4nt1.petagram.adapter.MascotaAdaptador;
import com.s4nt1.petagram.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rec_grid);
        LinearLayoutManager llm = new GridLayoutManager(getActivity(),2);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicilizarAdaptador();

        return v;
    }
    public FotosAdaptador adaptador;
    public void  inicilizarAdaptador(){
        FotosAdaptador adaptador = new FotosAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Mascota 1",R.drawable.perro_1,6));
        mascotas.add(new Mascota("Mascota 2",R.drawable.perro_2,6));
        mascotas.add(new Mascota("Mascota 3",R.drawable.perro_3,6));

    }
}