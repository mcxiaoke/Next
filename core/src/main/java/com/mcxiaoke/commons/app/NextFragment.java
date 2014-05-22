package com.mcxiaoke.commons.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import com.mcxiaoke.commons.utils.LogUtils;

/**
 * User: mcxiaoke
 * Date: 14-3-5
 * Time: 11:49
 */
@TargetApi(VERSION_CODES.HONEYCOMB)
public abstract class NextFragment extends Fragment {
    public static final boolean DEBUG = false;
    private static final String BASE_TAG = NextFragment.class.getSimpleName();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        LogUtils.v(BASE_TAG, "onAttach() fragment=" + getClazzName());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.v(BASE_TAG, "onCreate() fragment=" + getClazzName());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogUtils.v(BASE_TAG, "onActivityCreated() fragment=" + getClazzName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.v(BASE_TAG, "onDestroy() fragment=" + getClazzName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtils.v(BASE_TAG, "onDetach() fragment=" + getClazzName());
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.v(BASE_TAG, "onResume() fragment=" + getClazzName());
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.v(BASE_TAG, "onPause() fragment=" + getClazzName());
    }

    @Override
    public void onHiddenChanged(final boolean hidden) {
        super.onHiddenChanged(hidden);
        LogUtils.v(BASE_TAG, "onHiddenChanged() hidden=" + hidden + " fragment=" + getClazzName());
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtils.v(BASE_TAG, "onStart() fragment=" + getClazzName());
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.v(BASE_TAG, "onStop() fragment=" + getClazzName());
    }

    private String getClazzName() {
        Object o = this;
        return o.getClass().getSimpleName();
    }

    public final NextActivity getBaseActivity() {
        return (NextActivity) getActivity();
    }

    public final void showProgressIndicator() {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.showProgressIndicator();
        }
    }

    public final void hideProgressIndicator() {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.hideProgressIndicator();
        }
    }

    public final void finishActivity() {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void setResult(int resultCode) {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.setResult(resultCode);
        }
    }

    public final void setResult(int resultCode, Intent data) {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.setResult(resultCode, data);
        }
    }


    public final void invalidateOptionsMenu() {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    public final ActionBar getActionBar() {
        NextActivity activity = getBaseActivity();
        if (activity != null) {
            return activity.getActionBar();
        }
        return null;
    }

    public final void setActionBarTitle(CharSequence text) {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(text);
        }
    }

    public final void setActionBarTitle(int resId) {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(resId);
        }
    }

    public final void setActionBarSubTitle(CharSequence text) {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setSubtitle(text);
        }
    }

    public final void setActionBarSubTitle(int resId) {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setSubtitle(resId);
        }
    }

    protected NextFragment getFragment() {
        return this;
    }

}