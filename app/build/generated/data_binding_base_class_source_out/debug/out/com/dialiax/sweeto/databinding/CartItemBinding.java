// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CartItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView cartFoodName;

  @NonNull
  public final ImageView cartImage;

  @NonNull
  public final TextView cartItemQuantity;

  @NonNull
  public final TextView cartitemPrice;

  @NonNull
  public final ImageButton deleteButton;

  @NonNull
  public final ImageButton minusButton;

  @NonNull
  public final ImageButton plusbutton;

  protected CartItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView cartFoodName, ImageView cartImage, TextView cartItemQuantity, TextView cartitemPrice,
      ImageButton deleteButton, ImageButton minusButton, ImageButton plusbutton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartFoodName = cartFoodName;
    this.cartImage = cartImage;
    this.cartItemQuantity = cartItemQuantity;
    this.cartitemPrice = cartitemPrice;
    this.deleteButton = deleteButton;
    this.minusButton = minusButton;
    this.plusbutton = plusbutton;
  }

  @NonNull
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cart_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CartItemBinding>inflateInternal(inflater, R.layout.cart_item, root, attachToRoot, component);
  }

  @NonNull
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cart_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CartItemBinding>inflateInternal(inflater, R.layout.cart_item, null, false, component);
  }

  public static CartItemBinding bind(@NonNull View view) {
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
  public static CartItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (CartItemBinding)bind(component, view, R.layout.cart_item);
  }
}
