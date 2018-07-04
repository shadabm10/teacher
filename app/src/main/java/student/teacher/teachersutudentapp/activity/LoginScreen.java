package student.teacher.teachersutudentapp.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import student.teacher.teachersutudentapp.R;


public class LoginScreen extends AppCompatActivity{

    String TAG = "login";
   // GlobalClass globalClass;
    ProgressDialog pd;
   // Shared_Preference prefrence;
    TextView login_tv, signup_tv, tv_forgot_password;
    EditText email_edt, password_edt;
    String device_id;
    String fcm_token;
    ImageView img_google,img_fb;
    private static final int RC_SIGN_IN = 700;

    private String facebook_id, f_name, m_name, l_name, profile_image, full_name;
    String emailfb;
    String fbid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_screen);

/*
        globalClass = (GlobalClass) getApplicationContext();
        prefrence = new Shared_Preference(LoginScreen.this);
        prefrence.loadPrefrence();
        pd = new ProgressDialog(LoginScreen.this);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage(getResources().getString(R.string.loading));

        device_id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        Log.d(TAG, "device_id: " + device_id);
        globalClass.setDeviceid(device_id);

        fcm_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "fcm_token: " + fcm_token);*/




        email_edt = findViewById(R.id.email_edt);
        password_edt = findViewById(R.id.password_edt);
        login_tv = findViewById(R.id.login_tv);
        signup_tv = findViewById(R.id.signup_tv);
        tv_forgot_password = findViewById(R.id.tv_forgot_password);




        login_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginScreen.this, DrawerActivity.class);
                startActivity(intent);

               /* if (globalClass.isNetworkAvailable()) {
                    if (!email_edt.getText().toString().isEmpty()) {
                        if (isValidEmail(email_edt.getText().toString())) {
                            if (!password_edt.getText().toString().isEmpty()) {
                                user_login_url();
                            } else {
                                Toasty.warning(LoginScreen.this, getResources().getString(R.string.enter_password), Toast.LENGTH_SHORT, true).show();
                            }
                        } else {
                            Toasty.warning(LoginScreen.this, getResources().getString(R.string.valid_email), Toast.LENGTH_SHORT, true).show();
                        }
                    } else {
                        Toasty.warning(LoginScreen.this, getResources().getString(R.string.enter_email), Toast.LENGTH_SHORT, true).show();
                    }
                } else {
                    Toasty.warning(LoginScreen.this, getResources().getString(R.string.check_internet), Toast.LENGTH_SHORT, true).show();
                }*/
            }
        });

       /* accessToken = AccessToken.getCurrentAccessToken();


        Log.d(TAG, "onClick: ");
        profileTracker = new ProfileTracker() {
            @Override
            protected void onCurrentProfileChanged(
                    Profile oldProfile,
                    Profile currentProfile) {
                // App code

                Log.d(TAG, "onCurrentProfileChanged: "+currentProfile);
                RequestData();
            }
        };
*/

        signup_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, Signup.class);
                startActivity(intent);
            }
        });


      /*  tv_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, Forget_Password.class);
                startActivity(intent);
            }
        });
*/


/*
        img_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               *//* Intent intent = new Intent(LoginScreen.this, FacebookActivity.class);
                startActivity(intent);*//*
            }
        });*/

    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


   /* public void user_login_url() {

        pd.show();

        String url = WebserviceUrl.login;
        AsyncHttpClient cl = new AsyncHttpClient();
        RequestParams params = new RequestParams();


        params.put("email", email_edt.getText().toString());
        params.put("password", password_edt.getText().toString());
        params.put("device_type", globalClass.device_type);
        params.put("device_id", globalClass.getDeviceid());
        params.put("fcm_token", fcm_token);


        Log.d(TAG, "URL " + url);
        Log.d(TAG, "params " + params.toString());

        int DEFAULT_TIMEOUT = 30 * 1000;
        cl.setMaxRetriesAndTimeout(5, DEFAULT_TIMEOUT);
        cl.post(url, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                if (response != null) {
                    Log.d(TAG, "registration_url- " + response.toString());
                    try {

                        // JSONObject result = response.getJSONObject("result");

                        int status = response.getInt("status");
                        String message = response.getString("message");


                        Log.d(TAG, "onSuccess:status>>>> " + status);
                        Log.d(TAG, "onSuccess:message>>>> " + message);


                        if (status == 1) {
                            String address_full;
                            String address_id = "";

                            JSONObject data = response.getJSONObject("data");
                            Log.d(TAG, "onSuccess:data1>>>> " + data);

                            String id = data.getString("id");
                            String first_name = data.getString("first_name");
                            String last_name = data.getString("last_name");
                            String mobile = data.getString("mobile");
                            String email = data.getString("email");
                            String profile_pic = data.getString("profile_pic");

                            JSONObject address_arr = data.optJSONObject("address");
                            if( data.optJSONObject("address") == null){
                                address_full = "";
                            }else {

                                address_id = address_arr.optString("id");
                                String address_first_name = address_arr.optString("fname");
                                String address_last_name = address_arr.optString("lname");
                                String address = address_arr.optString("address");
                                String country = address_arr.optString("country");
                                String city = address_arr.optString("city");
                                String address_mobile = address_arr.optString("mobile");
                                double lat = address_arr.optDouble("lat");
                                double lng = address_arr.optDouble("lng");

                                address_full = address_first_name + " " + address_last_name + "\n" + address + ", "
                                        + city + ", " + country + "\n" + getResources().getString(R.string.mob) + " "
                                        + address_mobile;

                            }

                            //   String name = fname+" "+lname;
                            Log.d(TAG, "address_full: "+address_full);
                            Log.d(TAG, "address_id: "+address_id);


                            globalClass.setId(id);
                            globalClass.setFname(first_name);
                            globalClass.setLname(last_name);
                            globalClass.setPhone_number(mobile);
                            globalClass.setEmail(email);
                            globalClass.setLogin_status(true);
                            globalClass.setProfil_pic(profile_pic);
                            globalClass.setLogin_from("signup");
                            globalClass.setShipping_full_address(address_full);
                            globalClass.setShipping_id(address_id);


                            prefrence.savePrefrence();


                            Toasty.success(LoginScreen.this, getResources().getString(R.string.login_successful), Toast.LENGTH_SHORT, true).show();
                            Intent intent = new Intent(LoginScreen.this, HomeScreen.class);
                            startActivity(intent);
                            finish();
                            pd.dismiss();


                        } else if(status == 0){
                            if(message.equals("You are not registered.")) {
                                Toasty.error(LoginScreen.this, getResources().getString(R.string.not_registered), Toast.LENGTH_SHORT, true).show();
                            }else  if(message.equals("Password incorrect.")){
                                Toasty.error(LoginScreen.this, getResources().getString(R.string.password_incorrect), Toast.LENGTH_SHORT, true).show();
                            }

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
                Log.d(TAG, "onFailure: " + responseString);
            }
        });


    }
*/
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }





}
