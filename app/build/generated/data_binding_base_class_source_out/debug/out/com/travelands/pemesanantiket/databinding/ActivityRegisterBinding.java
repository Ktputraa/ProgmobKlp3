// Generated by view binder compiler. Do not edit!
package com.travelands.pemesanantiket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.travelands.pemesanantiket.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText edtEmailRegister;

  @NonNull
  public final EditText edtPasswordRegister;

  @NonNull
  public final CardView logenn;

  @NonNull
  public final TextView tvToLogin;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView, @NonNull Button btnRegister,
      @NonNull EditText edtEmailRegister, @NonNull EditText edtPasswordRegister,
      @NonNull CardView logenn, @NonNull TextView tvToLogin) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.edtEmailRegister = edtEmailRegister;
    this.edtPasswordRegister = edtPasswordRegister;
    this.logenn = logenn;
    this.tvToLogin = tvToLogin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.edt_email_register;
      EditText edtEmailRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailRegister == null) {
        break missingId;
      }

      id = R.id.edt_password_register;
      EditText edtPasswordRegister = ViewBindings.findChildViewById(rootView, id);
      if (edtPasswordRegister == null) {
        break missingId;
      }

      id = R.id.logenn;
      CardView logenn = ViewBindings.findChildViewById(rootView, id);
      if (logenn == null) {
        break missingId;
      }

      id = R.id.tv_to_login;
      TextView tvToLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvToLogin == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, btnRegister, edtEmailRegister,
          edtPasswordRegister, logenn, tvToLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}