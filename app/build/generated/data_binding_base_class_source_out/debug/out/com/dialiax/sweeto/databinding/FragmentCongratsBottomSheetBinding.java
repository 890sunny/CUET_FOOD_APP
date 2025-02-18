// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCongratsBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton goHome;

  @NonNull
  public final ImageView imageView3;

  protected FragmentCongratsBottomSheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton goHome, ImageView imageView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.goHome = goHome;
    this.imageView3 = imageView3;
  }

  @NonNull
  public static FragmentCongratsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_congrats_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCongratsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCongratsBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_congrats_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCongratsBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_congrats_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCongratsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCongratsBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_congrats_bottom_sheet, null, false, component);
  }

  public static FragmentCongratsBottomSheetBinding bind(@NonNull View view) {
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
  public static FragmentCongratsBottomSheetBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentCongratsBottomSheetBinding)bind(component, view, R.layout.fragment_congrats_bottom_sheet);
  }
}
