package com.example.macbook.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by macbook on 04/04/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
