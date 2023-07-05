// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentModificaBackgroundBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button buttonSalvaAllineamento;

  @NonNull
  public final Button buttonSalvaDescrizione;

  @NonNull
  public final Button buttonSalvaDifetti;

  @NonNull
  public final Button buttonSalvaIdeali;

  @NonNull
  public final Button buttonSalvaLegami;

  @NonNull
  public final Button buttonSalvaStoria;

  @NonNull
  public final Button buttonSalvaTratticaratteriali;

  @NonNull
  public final EditText editTextDescrizione;

  @NonNull
  public final EditText editTextDifetti;

  @NonNull
  public final EditText editTextIdeali;

  @NonNull
  public final EditText editTextLegami;

  @NonNull
  public final EditText editTextStoria;

  @NonNull
  public final EditText editTextTratticaratteriali;

  @NonNull
  public final Spinner spinnerAllineamento;

  private FragmentModificaBackgroundBinding(@NonNull ScrollView rootView,
      @NonNull Button buttonSalvaAllineamento, @NonNull Button buttonSalvaDescrizione,
      @NonNull Button buttonSalvaDifetti, @NonNull Button buttonSalvaIdeali,
      @NonNull Button buttonSalvaLegami, @NonNull Button buttonSalvaStoria,
      @NonNull Button buttonSalvaTratticaratteriali, @NonNull EditText editTextDescrizione,
      @NonNull EditText editTextDifetti, @NonNull EditText editTextIdeali,
      @NonNull EditText editTextLegami, @NonNull EditText editTextStoria,
      @NonNull EditText editTextTratticaratteriali, @NonNull Spinner spinnerAllineamento) {
    this.rootView = rootView;
    this.buttonSalvaAllineamento = buttonSalvaAllineamento;
    this.buttonSalvaDescrizione = buttonSalvaDescrizione;
    this.buttonSalvaDifetti = buttonSalvaDifetti;
    this.buttonSalvaIdeali = buttonSalvaIdeali;
    this.buttonSalvaLegami = buttonSalvaLegami;
    this.buttonSalvaStoria = buttonSalvaStoria;
    this.buttonSalvaTratticaratteriali = buttonSalvaTratticaratteriali;
    this.editTextDescrizione = editTextDescrizione;
    this.editTextDifetti = editTextDifetti;
    this.editTextIdeali = editTextIdeali;
    this.editTextLegami = editTextLegami;
    this.editTextStoria = editTextStoria;
    this.editTextTratticaratteriali = editTextTratticaratteriali;
    this.spinnerAllineamento = spinnerAllineamento;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentModificaBackgroundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentModificaBackgroundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_modifica_background, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentModificaBackgroundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSalvaAllineamento;
      Button buttonSalvaAllineamento = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaAllineamento == null) {
        break missingId;
      }

      id = R.id.buttonSalvaDescrizione;
      Button buttonSalvaDescrizione = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaDescrizione == null) {
        break missingId;
      }

      id = R.id.buttonSalvaDifetti;
      Button buttonSalvaDifetti = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaDifetti == null) {
        break missingId;
      }

      id = R.id.buttonSalvaIdeali;
      Button buttonSalvaIdeali = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaIdeali == null) {
        break missingId;
      }

      id = R.id.buttonSalvaLegami;
      Button buttonSalvaLegami = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaLegami == null) {
        break missingId;
      }

      id = R.id.buttonSalvaStoria;
      Button buttonSalvaStoria = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaStoria == null) {
        break missingId;
      }

      id = R.id.buttonSalvaTratticaratteriali;
      Button buttonSalvaTratticaratteriali = ViewBindings.findChildViewById(rootView, id);
      if (buttonSalvaTratticaratteriali == null) {
        break missingId;
      }

      id = R.id.editTextDescrizione;
      EditText editTextDescrizione = ViewBindings.findChildViewById(rootView, id);
      if (editTextDescrizione == null) {
        break missingId;
      }

      id = R.id.editTextDifetti;
      EditText editTextDifetti = ViewBindings.findChildViewById(rootView, id);
      if (editTextDifetti == null) {
        break missingId;
      }

      id = R.id.editTextIdeali;
      EditText editTextIdeali = ViewBindings.findChildViewById(rootView, id);
      if (editTextIdeali == null) {
        break missingId;
      }

      id = R.id.editTextLegami;
      EditText editTextLegami = ViewBindings.findChildViewById(rootView, id);
      if (editTextLegami == null) {
        break missingId;
      }

      id = R.id.editTextStoria;
      EditText editTextStoria = ViewBindings.findChildViewById(rootView, id);
      if (editTextStoria == null) {
        break missingId;
      }

      id = R.id.editTextTratticaratteriali;
      EditText editTextTratticaratteriali = ViewBindings.findChildViewById(rootView, id);
      if (editTextTratticaratteriali == null) {
        break missingId;
      }

      id = R.id.spinnerAllineamento;
      Spinner spinnerAllineamento = ViewBindings.findChildViewById(rootView, id);
      if (spinnerAllineamento == null) {
        break missingId;
      }

      return new FragmentModificaBackgroundBinding((ScrollView) rootView, buttonSalvaAllineamento,
          buttonSalvaDescrizione, buttonSalvaDifetti, buttonSalvaIdeali, buttonSalvaLegami,
          buttonSalvaStoria, buttonSalvaTratticaratteriali, editTextDescrizione, editTextDifetti,
          editTextIdeali, editTextLegami, editTextStoria, editTextTratticaratteriali,
          spinnerAllineamento);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}