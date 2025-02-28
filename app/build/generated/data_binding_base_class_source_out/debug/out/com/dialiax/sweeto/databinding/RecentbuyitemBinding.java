// Generated by view binder compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dialiax.sweeto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecentbuyitemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView foodImage;

  @NonNull
  public final TextView foodName;

  @NonNull
  public final TextView foodPrice;

  @NonNull
  public final TextView foodQuantity;

  @NonNull
  public final TextView textView22;

  private RecentbuyitemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView foodImage,
      @NonNull TextView foodName, @NonNull TextView foodPrice, @NonNull TextView foodQuantity,
      @NonNull TextView textView22) {
    this.rootView = rootView;
    this.foodImage = foodImage;
    this.foodName = foodName;
    this.foodPrice = foodPrice;
    this.foodQuantity = foodQuantity;
    this.textView22 = textView22;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecentbuyitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecentbuyitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recentbuyitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecentbuyitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.foodImage;
      ImageView foodImage = ViewBindings.findChildViewById(rootView, id);
      if (foodImage == null) {
        break missingId;
      }

      id = R.id.foodName;
      TextView foodName = ViewBindings.findChildViewById(rootView, id);
      if (foodName == null) {
        break missingId;
      }

      id = R.id.foodPrice;
      TextView foodPrice = ViewBindings.findChildViewById(rootView, id);
      if (foodPrice == null) {
        break missingId;
      }

      id = R.id.foodQuantity;
      TextView foodQuantity = ViewBindings.findChildViewById(rootView, id);
      if (foodQuantity == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      return new RecentbuyitemBinding((ConstraintLayout) rootView, foodImage, foodName, foodPrice,
          foodQuantity, textView22);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
