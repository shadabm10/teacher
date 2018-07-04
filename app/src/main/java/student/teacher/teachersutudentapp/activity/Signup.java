package student.teacher.teachersutudentapp.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import student.teacher.teachersutudentapp.R;


public class Signup extends AppCompatActivity {

    EditText input_fname,input_lname,input_email,input_password,input_con_password,input_mobile;

    TextView tv_login;
  /*  GlobalClass globalClass;
    Shared_Preference prefrence;*/
    ProgressDialog pd;
    String TAG = "Signup";
    ImageView img_eye_1, img_eye_2;
    String device_id;
    String fcm_token;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
/*

        globalClass = (GlobalClass)getApplicationContext();
        prefrence = new Shared_Preference(Signup.this);
        pd=new ProgressDialog(Signup.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage(getResources().getString(R.string.loading));


        // device_id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        device_id = Settings.Secure.getString(getContentResolver(), Secure.ANDROID_ID);
        Log.d(TAG, "device_id: "+device_id);
        globalClass.setDeviceid(device_id);

        fcm_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "fcm_token: "+fcm_token);

        input_fname = findViewById(R.id.input_fname);
        input_lname = findViewById(R.id.input_lname);
        input_email = findViewById(R.id.input_email);
        input_password = findViewById(R.id.input_password);
        input_con_password = findViewById(R.id.input_con_password);
        input_mobile = findViewById(R.id.input_mobile);
        tv_login = findViewById(R.id.tv_login);
        img_eye_1 = findViewById(R.id.img_eye_1);
        img_eye_2 = findViewById(R.id.img_eye_2);
        img_eye_1.setImageResource(R.mipmap.eye_show);
        img_eye_2.setImageResource(R.mipmap.eye_show);
        img_eye_1.setVisibility(View.GONE);
        img_eye_2.setVisibility(View.GONE);

*/


        input_fname = findViewById(R.id.input_fname);
        input_lname = findViewById(R.id.input_lname);
        input_email = findViewById(R.id.input_email);
        input_password = findViewById(R.id.input_password);
        input_con_password = findViewById(R.id.input_con_password);
        input_mobile = findViewById(R.id.input_mobile);
        tv_login = findViewById(R.id.tv_login);



        /*input_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length() > 0){
                    img_eye_1.setVisibility(View.VISIBLE);

                }else {

                    img_eye_1.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        input_con_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length() > 0){
                    img_eye_2.setVisibility(View.VISIBLE);

                }else {

                    img_eye_2.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });*/
     /*   input_mobile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!input_password.getText().toString().matches(input_con_password.getText().toString())){
                    input_mobile.clearFocus();
                    input_con_password.requestFocus();
                    Toasty.info(Signup.this,getResources().getString(R.string.password_mismatch),Toast.LENGTH_SHORT).show();
                }*//*else {
                    input_con_password.clearFocus();
                    input_mobile.requestFocus();


                }*//*
            }
        });*/




     /*   img_eye_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_password.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    //password is visible
                    img_eye_1.setImageResource(R.mipmap.viewoff96);
                    input_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else if(input_password.getTransformationMethod() == HideReturnsTransformationMethod.getInstance()) {
                    //password is hidden
                    img_eye_1.setImageResource(R.mipmap.eye_show);
                    input_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });


        img_eye_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_con_password.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    //password is visible
                    img_eye_2.setImageResource(R.mipmap.viewoff96);
                    input_con_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else if(input_con_password.getTransformationMethod() == HideReturnsTransformationMethod.getInstance()) {
                    //password is hidden
                    img_eye_2.setImageResource(R.mipmap.eye_show);
                    input_con_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

*/
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Intent intent = new Intent(Signup.this, HomeScreen.class);
                startActivity(intent);
                finish();*/



               /* if(globalClass.isNetworkAvailable()){
                    if(!input_fname.getText().toString().isEmpty()) {
                        if (!input_lname.getText().toString().isEmpty()) {
                            if (!input_email.getText().toString().isEmpty()) {
                                if (isValidEmail(input_email.getText().toString())) {
                                    if (!input_password.getText().toString().isEmpty()) {
                                        if (!input_con_password.getText().toString().isEmpty()) {
                                            if (!input_mobile.getText().toString().isEmpty()) {
                                                if (input_password.getText().toString().length() > 5) {
                                                    if (input_password.getText().toString().matches(input_con_password.getText().toString())) {
                                                        registration_url();
                                                    } else {
                                                        Toasty.error(Signup.this, getResources().getString(R.string.password_mismatch), Toast.LENGTH_SHORT, true).show();}
                                                } else {
                                                    Toasty.info(Signup.this, getResources().getString(R.string.minimum_length), Toast.LENGTH_SHORT, true).show();}
                                            } else {
                                                Toasty.warning(Signup.this, getResources().getString(R.string.enter_mobile), Toast.LENGTH_SHORT, true).show();}
                                        } else {
                                            Toasty.warning(Signup.this, getResources().getString(R.string.enter_confirm_password), Toast.LENGTH_SHORT, true).show();}
                                    } else {
                                        Toasty.warning(Signup.this, getResources().getString(R.string.password), Toast.LENGTH_SHORT, true).show();}
                                } else {
                                    Toasty.warning(Signup.this, getResources().getString(R.string.valid_email), Toast.LENGTH_SHORT, true).show();}
                            } else {
                                Toasty.warning(Signup.this, getResources().getString(R.string.enter_email), Toast.LENGTH_SHORT, true).show();}
                        } else {
                            Toasty.warning(Signup.this, getResources().getString(R.string.enter_last_name), Toast.LENGTH_SHORT, true).show();}
                    }else{
                        Toasty.warning(Signup.this, getResources().getString(R.string.enter_first_name), Toast.LENGTH_SHORT, true).show();}
                }else {
                        Toasty.info(Signup.this, getResources().getString(R.string.check_internet), Toast.LENGTH_SHORT, true).show();
                }
*/
            }
        });



    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


/*    public void registration_url(){

        pd.show();

        String url = WebserviceUrl.user_signup;
        AsyncHttpClient cl = new AsyncHttpClient();
        RequestParams params = new RequestParams();

        params.put("first_name",input_fname.getText().toString());
        params.put("last_name",input_lname.getText().toString());
        params.put("email_id",input_email.getText().toString());
        params.put("password",input_password.getText().toString());
        params.put("mobile",input_mobile.getText().toString());
        params.put("device_type",globalClass.device_type);
        params.put("device_id",globalClass.getDeviceid());
        params.put("fcm_token",fcm_token);




        Log.d(TAG , "URL "+url);
        Log.d(TAG , "params "+params.toString());

        int DEFAULT_TIMEOUT = 30 * 1000;
        cl.setMaxRetriesAndTimeout(5 , DEFAULT_TIMEOUT);
        cl.post(url,params, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                if (response != null) {
                    Log.d(TAG, "registration_url- " + response.toString());
                    try {

                       // JSONObject result = response.getJSONObject("result");

                        int status = response.getInt("status");
                        String message = response.getString("message");


                        Log.d(TAG, "onSuccess:status>>>> "+status);
                        Log.d(TAG, "onSuccess:message>>>> "+message);



                        if (status == 1) {

                            JSONObject data= response.getJSONObject("data");
                            Log.d(TAG, "onSuccess:data1>>>> "+data);

                            String id = data.getString("id");
                            String first_name = data.getString("first_name");
                            String last_name = data.getString("last_name");
                            String mobile = data.getString("mobile");
                            String email = data.getString("email");
                            String profile_pic = data.getString("profile_pic");
                            String address = data.getString("address");

                            //   String name = fname+" "+lname;

                            globalClass.setId(id);
                            globalClass.setFname(first_name);
                            globalClass.setLname(last_name);
                            globalClass.setPhone_number(mobile);
                            globalClass.setEmail(email);
                            globalClass.setLogin_status(true);
                            globalClass.setProfil_pic(profile_pic);
                            globalClass.setShipping_full_address(address);
                            prefrence.savePrefrence();



                            Toasty.success(Signup.this, getResources().getString(R.string.registration_successful), Toast.LENGTH_SHORT, true).show();
                            Intent intent = new Intent(Signup.this, HomeScreen.class);
                            startActivity(intent);
                            finish();
                            pd.dismiss();



                        }else if (status == 0){

                            Toasty.error(Signup.this, getResources().getString(R.string.already_registered), Toast.LENGTH_SHORT, true).show();
                            pd.dismiss();
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }



            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                Log.d(TAG, "onFailure: "+responseString);
            }
        });


    }*/


}
