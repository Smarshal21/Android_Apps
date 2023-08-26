// Generated by view binder compiler. Do not edit!
package com.example.Chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.example.Chat.R;
import com.google.android.material.navigation.NavigationView;
import io.getstream.chat.android.ui.channel.list.ChannelListView;
import io.getstream.chat.android.ui.channel.list.header.ChannelListHeaderView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChannelBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final ChannelListHeaderView channelListHeaderView;

  @NonNull
  public final ChannelListView channelsView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navigationView;

  private FragmentChannelBinding(@NonNull DrawerLayout rootView,
      @NonNull ChannelListHeaderView channelListHeaderView, @NonNull ChannelListView channelsView,
      @NonNull DrawerLayout drawerLayout, @NonNull NavigationView navigationView) {
    this.rootView = rootView;
    this.channelListHeaderView = channelListHeaderView;
    this.channelsView = channelsView;
    this.drawerLayout = drawerLayout;
    this.navigationView = navigationView;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChannelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChannelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_channel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChannelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.channelListHeaderView;
      ChannelListHeaderView channelListHeaderView = rootView.findViewById(id);
      if (channelListHeaderView == null) {
        break missingId;
      }

      id = R.id.channelsView;
      ChannelListView channelsView = rootView.findViewById(id);
      if (channelsView == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.navigationView;
      NavigationView navigationView = rootView.findViewById(id);
      if (navigationView == null) {
        break missingId;
      }

      return new FragmentChannelBinding((DrawerLayout) rootView, channelListHeaderView,
          channelsView, drawerLayout, navigationView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}