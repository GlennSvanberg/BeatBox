package com.svanberggroup.beatbox;

import android.widget.SeekBar;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableInt;

public class FragmentViewModel {
    private BeatBox mBeatBox;
    private ObservableInt mProgress = new ObservableInt();



    public FragmentViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
        mProgress = new ObservableInt((int) beatBox.getSpeedRate() * 100);
    }

    public ObservableInt getProgress() {
        return mProgress;
    }

    @BindingAdapter({"format", "arg"})
    public static void setFormattedText(TextView textView, String format, int arg ){
        float floatArg = (float) arg / 100;
        textView.setText(String.format(format,floatArg));
    }
    public void onSeekBarChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mProgress.set(progress);
        float speedRate = (float) (progress) / 100;
        mBeatBox.setSpeedRate(speedRate);
    }

}
