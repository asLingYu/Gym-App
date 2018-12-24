package e.asus.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentThree extends Fragment {



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_three,container,false);
        return view;
    }
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
        Button bt_login=(Button)getActivity().findViewById(R.id.login_down);
        Button bt_zc=(Button)getActivity().findViewById(R.id.login_zc);
        Button bt_player=(Button)getActivity().findViewById(R.id.login_play);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent i=;
                startActivity(new Intent(getActivity(),MainLogin.class));
            }
        });
        bt_zc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent i=;
                startActivity(new Intent(getActivity(),MainRegister.class));
            }
        });
        bt_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent i=;
                startActivity(new Intent(getActivity(),Player.class));
            }
        });


    }
}