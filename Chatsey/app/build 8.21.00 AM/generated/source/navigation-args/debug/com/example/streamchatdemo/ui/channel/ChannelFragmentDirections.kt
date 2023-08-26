package com.example.streamchatdemo.ui.channel

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.streamchatdemo.R
import kotlin.Int
import kotlin.String

public class ChannelFragmentDirections private constructor() {
  private data class ActionChannelFragmentToChatFragment(
    public val channelId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_channelFragment_to_chatFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("channelId", this.channelId)
      return result
    }
  }

  public companion object {
    public fun actionChannelFragmentToChatFragment(channelId: String): NavDirections =
        ActionChannelFragmentToChatFragment(channelId)

    public fun actionChannelFragmentToUsersFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_channelFragment_to_usersFragment)

    public fun actionChannelFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_channelFragment_to_loginFragment)
  }
}
