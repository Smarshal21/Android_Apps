// Generated by view binder compiler. Do not edit!
package com.example.Chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.Chat.R;
import io.getstream.chat.android.ui.message.input.MessageInputView;
import io.getstream.chat.android.ui.message.list.MessageListView;
import io.getstream.chat.android.ui.message.list.header.MessageListHeaderView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MessageInputView messageInputView;

  @NonNull
  public final MessageListView messageList;

  @NonNull
  public final MessageListHeaderView messagesHeaderView;

  private FragmentChatBinding(@NonNull ConstraintLayout rootView,
      @NonNull MessageInputView messageInputView, @NonNull MessageListView messageList,
      @NonNull MessageListHeaderView messagesHeaderView) {
    this.rootView = rootView;
    this.messageInputView = messageInputView;
    this.messageList = messageList;
    this.messagesHeaderView = messagesHeaderView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.messageInputView;
      MessageInputView messageInputView = rootView.findViewById(id);
      if (messageInputView == null) {
        break missingId;
      }

      id = R.id.messageList;
      MessageListView messageList = rootView.findViewById(id);
      if (messageList == null) {
        break missingId;
      }

      id = R.id.messagesHeaderView;
      MessageListHeaderView messagesHeaderView = rootView.findViewById(id);
      if (messagesHeaderView == null) {
        break missingId;
      }

      return new FragmentChatBinding((ConstraintLayout) rootView, messageInputView, messageList,
          messagesHeaderView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
