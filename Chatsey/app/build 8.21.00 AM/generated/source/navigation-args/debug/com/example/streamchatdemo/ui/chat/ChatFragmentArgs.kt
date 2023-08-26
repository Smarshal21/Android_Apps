package com.example.streamchatdemo.ui.chat

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ChatFragmentArgs(
  public val channelId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("channelId", this.channelId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ChatFragmentArgs {
      bundle.setClassLoader(ChatFragmentArgs::class.java.classLoader)
      val __channelId : String?
      if (bundle.containsKey("channelId")) {
        __channelId = bundle.getString("channelId")
        if (__channelId == null) {
          throw IllegalArgumentException("Argument \"channelId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"channelId\" is missing and does not have an android:defaultValue")
      }
      return ChatFragmentArgs(__channelId)
    }
  }
}
