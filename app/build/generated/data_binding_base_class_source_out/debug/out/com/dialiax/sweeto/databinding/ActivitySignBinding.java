// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignBinding extends ViewDataBinding {
  @NonNull
  public final TextView alreadyhavebutton;

  @NonNull
  public final AppCompatButton button2;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final AppCompatButton googleSignIn;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final AppCompatButton signUpbutton;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final EditText userName;

  protected ActivitySignBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView alreadyhavebutton, AppCompatButton button2, EditText emailEditText,
      AppCompatButton googleSignIn, ImageView imageView4, EditText passwordEditText,
      AppCompatButton signUpbutton, TextView textView13, TextView textView14, TextView textView15,
      TextView textView16, TextView textView17, EditText userName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.alreadyhavebutton = alreadyhavebutton;
    this.button2 = button2;
    this.emailEditText = emailEditText;
    this.googleSignIn = googleSignIn;
    this.imageView4 = imageView4;
    this.passwordEditText = passwordEditText;
    this.signUpbutton = signUpbutton;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.userName = userName;
  }

  @NonNull
  public static ActivitySignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sign, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignBinding>inflateInternal(inflater, R.layout.activity_sign, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sign, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignBinding>inflateInternal(inflater, R.layout.activity_sign, null, false, component);
  }

  public static ActivitySignBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySignBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignBinding)bind(component, view, R.layout.activity_sign);
  }
}
