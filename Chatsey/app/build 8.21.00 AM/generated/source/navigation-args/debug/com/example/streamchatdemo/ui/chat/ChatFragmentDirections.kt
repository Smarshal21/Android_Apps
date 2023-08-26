package com.example.streamchatdemo.ui.chat

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.streamchatdemo.R
import com.example.streamchatdemo.model.ChatUser
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ChatFragmentDirections private constructor() {
  private data class ActionChatFragmentToChannelFragment(
    public val chatUser: ChatUser
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_chatFragment_to_channelFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ChatUser::class.java)) {
        result.putParcelable("chatUser", this.chatUser as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ChatUser::class.java)) {
        result.putSerializable("chatUser", this.chatUser as Serializable)
      } else {
        throw UnsupportedOperationException(ChatUser::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionChatFragmentToChannelFragment(chatUser: ChatUser): NavDirections =
        ActionChatFragmentToChannelFragment(chatUser)
  }
}
