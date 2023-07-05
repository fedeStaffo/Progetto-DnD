// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSottorazzaGnomoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAvanti;

  @NonNull
  public final Button infoForeste;

  @NonNull
  public final Button infoRocce;

  @NonNull
  public final Button scegliForeste;

  @NonNull
  public final Button scegliRocce;

  private FragmentSottorazzaGnomoBinding(@NonNull LinearLayout rootView, @NonNull Button btnAvanti,
      @NonNull Button infoForeste, @NonNull Button infoRocce, @NonNull Button scegliForeste,
      @NonNull Button scegliRocce) {
    this.rootView = rootView;
    this.btnAvanti = btnAvanti;
    this.infoForeste = infoForeste;
    this.infoRocce = infoRocce;
    this.scegliForeste = scegliForeste;
    this.scegliRocce = scegliRocce;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSottorazzaGnomoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSottorazzaGnomoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sottorazza_gnomo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSottorazzaGnomoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_avanti;
      Button btnAvanti = ViewBindings.findChildViewById(rootView, id);
      if (btnAvanti == null) {
        break missingId;
      }

      id = R.id.info_foreste;
      Button infoForeste = ViewBindings.findChildViewById(rootView, id);
      if (infoForeste == null) {
        break missingId;
      }

      id = R.id.info_rocce;
      Button infoRocce = ViewBindings.findChildViewById(rootView, id);
      if (infoRocce == null) {
        break missingId;
      }

      id = R.id.scegli_foreste;
      Button scegliForeste = ViewBindings.findChildViewById(rootView, id);
      if (scegliForeste == null) {
        break missingId;
      }

      id = R.id.scegli_rocce;
      Button scegliRocce = ViewBindings.findChildViewById(rootView, id);
      if (scegliRocce == null) {
        break missingId;
      }

      return new FragmentSottorazzaGnomoBinding((LinearLayout) rootView, btnAvanti, infoForeste,
          infoRocce, scegliForeste, scegliRocce);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}