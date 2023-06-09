// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVisualizzaSessioneBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RecyclerView recylerViewSessioni;

  private FragmentVisualizzaSessioneBinding(@NonNull ScrollView rootView,
      @NonNull RecyclerView recylerViewSessioni) {
    this.rootView = rootView;
    this.recylerViewSessioni = recylerViewSessioni;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVisualizzaSessioneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVisualizzaSessioneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_visualizza_sessione, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVisualizzaSessioneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recylerViewSessioni;
      RecyclerView recylerViewSessioni = ViewBindings.findChildViewById(rootView, id);
      if (recylerViewSessioni == null) {
        break missingId;
      }

      return new FragmentVisualizzaSessioneBinding((ScrollView) rootView, recylerViewSessioni);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
