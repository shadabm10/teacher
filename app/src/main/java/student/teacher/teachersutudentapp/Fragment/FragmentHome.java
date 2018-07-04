package student.teacher.teachersutudentapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import student.teacher.teachersutudentapp.R;
import student.teacher.teachersutudentapp.activity.ChatScreen;
import student.teacher.teachersutudentapp.activity.ProfileScreen;
import student.teacher.teachersutudentapp.adapter.AdapterHome;


/**
 * Created by Ankita on 6/20/2018.
 */
public class FragmentHome extends Fragment {

    ListView list_home;
    ArrayList<String> order_id;
    AdapterHome adapterHome;
    ImageView iv_chat,image_profile;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        order_id = new ArrayList<>();
        order_id.add("20281");
        order_id.add("1221");
        order_id.add("281");
        order_id.add("123");
        order_id.add("332");

        list_home = (ListView)view.findViewById(R.id.list_home);
        adapterHome = new AdapterHome(getActivity(), order_id);
        list_home.setAdapter(adapterHome);
        adapterHome.notifyDataSetChanged();
        iv_chat = view.findViewById(R.id.iv_chat);
        image_profile = view.findViewById(R.id.image_profile);

        iv_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChatScreen.class);
                startActivity(intent);
            }
        });


        image_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProfileScreen.class);
                startActivity(intent);
            }
        });

        return view;
    }
}