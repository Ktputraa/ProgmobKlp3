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

public final class ActivityJakartaBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView btnjakartaback;

  @NonNull
  public final CardView jktt1;

  @NonNull
  public final CardView jkttt;

  private ActivityJakartaBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView btnjakartaback, @NonNull CardView jktt1, @NonNull CardView jkttt) {
    this.rootView = rootView;
    this.btnjakartaback = btnjakartaback;
    this.jktt1 = jktt1;
    this.jkttt = jkttt;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJakartaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJakartaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jakarta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJakartaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnjakartaback;
      ImageView btnjakartaback = ViewBindings.findChildViewById(rootView, id);
      if (btnjakartaback == null) {
        break missingId;
      }

      id = R.id.jktt1;
      CardView jktt1 = ViewBindings.findChildViewById(rootView, id);
      if (jktt1 == null) {
        break missingId;
      }

      id = R.id.jkttt;
      CardView jkttt = ViewBindings.findChildViewById(rootView, id);
      if (jkttt == null) {
        break missingId;
      }

      return new ActivityJakartaBinding((CoordinatorLayout) rootView, btnjakartaback, jktt1, jkttt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
