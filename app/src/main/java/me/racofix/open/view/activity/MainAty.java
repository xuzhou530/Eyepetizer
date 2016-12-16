package me.racofix.open.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.meikoz.core.ui.TabStripView;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.view.fragment.HomeFragment;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainAty extends AppCompatActivity {

    @Bind(R.id.tsv_navigate_bar)
    private TabStripView mNavigateBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigateBar.onRestoreInstanceState(savedInstanceState);

        mNavigateBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_feed,
                        R.drawable.ic_tab_strip_icon_feed_selected, R.string.tab_bar_text_feed));

        mNavigateBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_category,
                        R.drawable.ic_tab_strip_icon_category_selected, R.string.tab_bar_text_category));

        mNavigateBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_pgc,
                        R.drawable.ic_tab_strip_icon_pgc_selected, R.string.tab_bar_text_pgc));

        mNavigateBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_profile,
                        R.drawable.ic_tab_strip_icon_profile_selected, R.string.tab_bar_text_profile));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //保存当前选中的选项状态
        mNavigateBar.onSaveInstanceState(outState);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
