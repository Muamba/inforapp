package za.ac.cput.inforshare.ui.profile;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import za.ac.cput.inforshare.R;
import za.ac.cput.inforshare.ui.base.BaseActivity;
import za.ac.cput.inforshare.ui.base.MvpPresenter;
import za.ac.cput.inforshare.ui.base.MvpView;
import za.ac.cput.inforshare.ui.feed.FeedActivity;
import za.ac.cput.inforshare.ui.feed.FeedMvpPresenter;
import za.ac.cput.inforshare.ui.feed.FeedMvpView;

public class Activity_Profile extends BaseActivity{

    @BindView(R.id.toolbar1)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__profile);

        setUp();
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, Activity_Profile.class);
        return intent;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                upIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
                    // This activity is NOT part of this app's task, so create a new task
                    // when navigating up, with a synthesized back stack.
                    TaskStackBuilder.create(this)
                            // Add all of this activity's parents to the back stack
                            .addNextIntentWithParentStack(upIntent)
                            // Navigate up to the closest parent
                            .startActivities();
                } else {
                    // This activity is part of this app's task, so simply
                    // navigate up to the logical parent activity.
                    NavUtils.navigateUpTo(this, upIntent);
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void setUp() {
        setSupportActionBar(mToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }



}
