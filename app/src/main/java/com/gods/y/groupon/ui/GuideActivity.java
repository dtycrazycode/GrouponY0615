package com.gods.y.groupon.ui;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;

import com.gods.y.groupon.R;
import com.gods.y.groupon.adapter.GuideFragmentAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends AppCompatActivity {

    @BindView(R.id.guide_vp)
    ViewPager guideVp;
    @BindView(R.id.guide_select)
    CirclePageIndicator guideSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        setVpAdapter();
    }

    private void setVpAdapter() {
        GuideFragmentAdapter adapter = new GuideFragmentAdapter(getSupportFragmentManager());
        guideVp.setAdapter(adapter);
        guideSelect.setViewPager(guideVp);
        final float density = getResources().getDisplayMetrics().density;
//        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,)
        guideSelect.setBackgroundColor(0x00000000);
        guideSelect.setRadius(6 * density);
        guideSelect.setPageColor(0xFFFFFFFF);
        guideSelect.setFillColor(0xFFDD5044);
        guideSelect.setStrokeColor(0xFFDD5044);
        guideSelect.setStrokeWidth(2*density);

        guideVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==3){
                    guideSelect.setVisibility(View.GONE);
                }else {
                    guideSelect.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
