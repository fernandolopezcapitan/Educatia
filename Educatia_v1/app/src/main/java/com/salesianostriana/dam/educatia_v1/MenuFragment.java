package com.salesianostriana.dam.educatia_v1;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.security.Permission;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    Button mi_perfil, calendario, mi_horario, mis_ausencias, ajustes;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        mi_perfil = (Button) view.findViewById(R.id.btn_mi_perfil);
        calendario = (Button) view.findViewById(R.id.btn_calendario);
        mi_horario = (Button) view.findViewById(R.id.btn_mi_horario);
        mis_ausencias = (Button) view.findViewById(R.id.btn_mis_ausencias);
        ajustes = (Button) view.findViewById(R.id.btn_ajustes);

        mi_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),MiPerfilActivity.class);
                startActivity(i);
                //FragmentManager FM = get;
                /*FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment f = new MiperfilFragment();
                ft.add(R.layout.fragment_miperfil,f);*/

                /*FragmentManager FM = getSupportFragmentManager().;
                FragmentTransaction FT = FM.beginTransaction();

                Fragment fragment = new FragmentUNO();
                FT.add(R.id.fragment_container, fragment);
                FT.commit();*/


            }
        });
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),CalendarioActivity.class);
                startActivity(i);
            }
        });
        mi_horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Fragment f = new MihorarioFragment();
            }
        });
        mis_ausencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Fragment f = new MisausenciasFragment();
            }
        });
        ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Fragment f = new AjustesFragment();
            }
        });

        return view;
    }

}
