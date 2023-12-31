// Generated by view binder compiler. Do not edit!
package com.sammycode.notesample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sammycode.notesample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addNote;

  @NonNull
  public final RecyclerView noteList;

  @NonNull
  public final SpinKitView progressBar;

  @NonNull
  public final TextView textView;

  private FragmentMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addNote, @NonNull RecyclerView noteList,
      @NonNull SpinKitView progressBar, @NonNull TextView textView) {
    this.rootView = rootView;
    this.addNote = addNote;
    this.noteList = noteList;
    this.progressBar = progressBar;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_note;
      FloatingActionButton addNote = ViewBindings.findChildViewById(rootView, id);
      if (addNote == null) {
        break missingId;
      }

      id = R.id.note_list;
      RecyclerView noteList = ViewBindings.findChildViewById(rootView, id);
      if (noteList == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      SpinKitView progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentMainBinding((ConstraintLayout) rootView, addNote, noteList, progressBar,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
