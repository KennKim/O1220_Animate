package com.project.tk.o1220_animate;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.project.tk.o1220_animate.animation.CameraAnim;
import com.project.tk.o1220_animate.animation.MyBounceInterpolator;
import com.project.tk.o1220_animate.animation.SkewAnim;
import com.project.tk.o1220_animate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_main);
        b.setActivity(this);



    }

    public void onClick1(View view) {

    }

    public void onClick2(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        b.btn2.startAnimation(animation);
    }
    public void onClick3(View view) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        MyBounceInterpolator myBounceInterpolator = new MyBounceInterpolator(0.2, 20);
        animation.setInterpolator(myBounceInterpolator);
        b.btn3.startAnimation(animation);
    }
    public void onClick4(View view) {
        SkewAnim skewAnim = new SkewAnim();
        b.btn4.startAnimation(skewAnim);
    }
    public void onClick5(View view) {
        CameraAnim cameraAnim = new CameraAnim();
        b.btn5.startAnimation(cameraAnim);
    }
    public void onClick6(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_alpha);
        b.btn6.startAnimation(animation);
    }
    public void onClick7(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        view.startAnimation(animation);
    }
    public void onClick8(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_linear_interpolator);
        view.startAnimation(animation);
    }
    public void onClick9(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_accelerate_interpolator);
        view.startAnimation(animation);
    }
    public void onClick10(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_decelerate_interpolator);
        view.startAnimation(animation);
    }
    public void onClick11(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_accelerate_decelerate_interpolator);
        view.startAnimation(animation);
    }
    public void onClick12(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_anticipate_interpolator);
        view.startAnimation(animation);
    }
     public void onClick13(View view) {
         Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_overshoot_interpolator);
         view.startAnimation(animation);
    }
     public void onClick14(View view) {
         Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_anticipate_overshoot_interpolator);
         view.startAnimation(animation);
    }
     public void onClick15(View view) {
         Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_bounce_interpolator);
         view.startAnimation(animation);
    }
     public void onClick16(View view) {
         Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate_cycle_interpolator);
         view.startAnimation(animation);
    }

}
