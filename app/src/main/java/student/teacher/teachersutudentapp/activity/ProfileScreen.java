package student.teacher.teachersutudentapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import student.teacher.teachersutudentapp.R;


public class ProfileScreen extends AppCompatActivity{
    CardView cv_profile_card;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);

        cv_profile_card = findViewById(R.id.cv_profile_card);

        cv_profile_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_profile_card();
            }
        });
    }

    public  void  dialog_profile_card() {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(ProfileScreen.this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View dialogView = inflater.inflate(R.layout.dialog_profile_card, null);
        dialogBuilder.setView(dialogView);


        final AlertDialog dialog = dialogBuilder.create();
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        dialog.getWindow().setLayout(300, 900);
        dialog.show();

    }
}
