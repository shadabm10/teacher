package student.teacher.teachersutudentapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import student.teacher.teachersutudentapp.R;
import student.teacher.teachersutudentapp.activity.ChatScreen;
import student.teacher.teachersutudentapp.activity.ProfileScreen;

public class FragmentProfile extends Fragment {
    ImageView iv_chat;
    TextView tv_view_profile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        iv_chat = view.findViewById(R.id.iv_chat);
        tv_view_profile = view.findViewById(R.id.tv_view_profile);

        iv_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChatScreen.class);
                startActivity(intent);
            }
        });

        tv_view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProfileScreen.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
