// Generated by view binder compiler. Do not edit!
package com.travelands.pemesanantiket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.travelands.pemesanantiket.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBaliBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CardView bali;

  @NonNull
  public final CardView bali1;

  @NonNull
  public final ImageView btnbaliback;

  private ActivityBaliBinding(@NonNull CoordinatorLayout rootView, @NonNull CardView bali,
      @NonNull CardView bali1, @NonNull ImageView btnbaliback) {
    this.rootView = rootView;
    this.bali = bali;
    this.bali1 = bali1;
    this.btnbaliback = btnbaliback;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBaliBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBaliBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bali, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBaliBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bali;
      CardView bali = ViewBindings.findChildViewById(rootView, id);
      if (bali == null) {
        break missingId;
      }

      id = R.id.bali1;
      CardView bali1 = ViewBindings.findChildViewById(rootView, id);
      if (bali1 == null) {
        break missingId;
      }

      id = R.id.btnbaliback;
      ImageView btnbaliback = ViewBindings.findChildViewById(rootView, id);
      if (btnbaliback == null) {
        break missingId;
      }

      return new ActivityBaliBinding((CoordinatorLayout) rootView, bali, bali1, btnbaliback);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
