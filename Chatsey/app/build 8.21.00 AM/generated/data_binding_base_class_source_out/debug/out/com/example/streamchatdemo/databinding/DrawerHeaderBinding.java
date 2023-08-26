// Generated by view binder compiler. Do not edit!
package com.example.Chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.Chat.R;
import io.getstream.chat.android.ui.avatar.AvatarView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DrawerHeaderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AvatarView avatarView;

  @NonNull
  public final TextView idTextView;

  @NonNull
  public final TextView nameTextView;

  private DrawerHeaderBinding(@NonNull ConstraintLayout rootView, @NonNull AvatarView avatarView,
      @NonNull TextView idTextView, @NonNull TextView nameTextView) {
    this.rootView = rootView;
    this.avatarView = avatarView;
    this.idTextView = idTextView;
    this.nameTextView = nameTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatarView;
      AvatarView avatarView = rootView.findViewById(id);
      if (avatarView == null) {
        break missingId;
      }

      id = R.id.id_textView;
      TextView idTextView = rootView.findViewById(id);
      if (idTextView == null) {
        break missingId;
      }

      id = R.id.name_textView;
      TextView nameTextView = rootView.findViewById(id);
      if (nameTextView == null) {
        break missingId;
      }

      return new DrawerHeaderBinding((ConstraintLayout) rootView, avatarView, idTextView,
          nameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}