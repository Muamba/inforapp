/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package za.ac.cput.inforshare.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import za.ac.cput.inforshare.R;
import za.ac.cput.inforshare.ui.base.BaseActivity;
import za.ac.cput.inforshare.ui.feed.FeedActivity;
import za.ac.cput.inforshare.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    @BindView(R.id.et_email)
    EditText mEmailEditText;

    @BindView(R.id.spn_institution)
    Spinner mSpinner;

    @BindView(R.id.et_password)
    EditText mPasswordEditText;

    @BindView(R.id.textView)
    TextView mTextViewInsti;
    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(LoginActivity.this);
        mPasswordEditText.setVisibility(View.INVISIBLE);
        mSpinner.setVisibility(View.INVISIBLE);
        mTextViewInsti.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.btn_server_login)
    void onServerLoginClick(View v) {
        if(mSpinner.getVisibility()==View.INVISIBLE){
            String insti[]={"CPUT","DIT","FID"};
            List<String > instiList=new ArrayList<>();
            instiList.add(insti[0]);
            instiList.add(insti[1]);
            instiList.add(insti[2]);
            ArrayAdapter<String> dataAdapter = new ArrayAdapter(this,
                    android.R.layout.simple_spinner_item, instiList);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(dataAdapter);
            mTextViewInsti.setVisibility(View.VISIBLE);
            mSpinner.setVisibility(View.VISIBLE);
            mPasswordEditText.setVisibility(View.VISIBLE);
        }
        else {

            mPresenter.onServerLoginClick(mEmailEditText.getText().toString(), mPasswordEditText.getText().toString());
        }
    }

    @Override
    public void openMainActivity() {
        Intent intent = FeedActivity.getStartIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}
