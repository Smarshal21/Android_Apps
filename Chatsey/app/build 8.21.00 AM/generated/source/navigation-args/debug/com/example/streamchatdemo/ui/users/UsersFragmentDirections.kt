package com.example.streamchatdemo.ui.users

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.streamchatdemo.R
import kotlin.Int
import kotlin.String

public class UsersFragmentDirections private constructor() {
  private data class ActionUsersFragmentToChatFragment(
    public val channelId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_usersFragment_to_chatFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("channelId", this.channelId)
      return result
    }
  }

  public companion object {
    public fun actionUsersFragmentToChatFragment(channelId: String): NavDirections =
        ActionUsersFragmentToChatFragment(channelId)
  }
}
