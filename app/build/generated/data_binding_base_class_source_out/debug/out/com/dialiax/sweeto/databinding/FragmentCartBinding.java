// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCartBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView cartRecyclerView;

  @NonNull
  public final AppCompatButton proceedbutton;

  @NonNull
  public final TextView textView9;

  protected FragmentCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView cartRecyclerView, AppCompatButton proceedbutton, TextView textView9) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartRecyclerView = cartRecyclerView;
    this.proceedbutton = proceedbutton;
    this.textView9 = textView9;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, null, false, component);
  }

  public static FragmentCartBinding bind(@NonNull View view) {
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
  public static FragmentCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCartBinding)bind(component, view, R.layout.fragment_cart);
  }
}
