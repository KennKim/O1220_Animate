package com.project.tk.o1220_animate.animation;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/**
 * Created by conscious on 2017-12-20.
 */

public class SkewAnim extends Animation {
    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        setDuration(3000);         // 지속시간
        setInterpolator(new LinearInterpolator());    // 일정하게
    }
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        Matrix matrix = t.getMatrix();
        matrix.setSkew(2.0f * interpolatedTime, 0);    // 기울기 * 시간
    }
}



