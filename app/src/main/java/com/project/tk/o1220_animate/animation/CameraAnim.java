package com.project.tk.o1220_animate.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/**
 * Created by conscious on 2017-12-20.
 */

public class CameraAnim extends Animation {
    float cx, cy;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        cx = width/2;         // 좌표를 뷰의 중앙으로 지정
        cy = height/2;
        setDuration(3000);
        setInterpolator(new LinearInterpolator());
    }
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        Camera cam = new Camera();
        /**
         *  360도 * 시간 - 시간이 0~1이므로 점진적으로 360도 회전
         */
        cam.rotateX(360 * interpolatedTime);
        cam.rotateY(360 * interpolatedTime);
        cam.rotateZ(360 * interpolatedTime);
        Matrix matrix = t.getMatrix();
        cam.getMatrix(matrix);
        // 회전 중심을 이미지 중심으로 하기 위해 카메라를 회전하기 전 중심을
        matrix.preTranslate(-cx, -cy);    // 원점으로 옮기고
        matrix.postTranslate(cx, cy);    // 회전 후 다시 원래 위치
    }
}



