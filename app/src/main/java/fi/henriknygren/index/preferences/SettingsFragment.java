package fi.henriknygren.index.preferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import fi.henriknygren.index.R;

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
