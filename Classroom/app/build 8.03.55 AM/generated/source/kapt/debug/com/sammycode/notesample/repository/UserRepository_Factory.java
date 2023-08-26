// Generated by Dagger (https://dagger.dev).
package com.sammycode.notesample.repository;

import com.sammycode.notesample.api.UserAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserAPI> userAPIProvider;

  public UserRepository_Factory(Provider<UserAPI> userAPIProvider) {
    this.userAPIProvider = userAPIProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userAPIProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserAPI> userAPIProvider) {
    return new UserRepository_Factory(userAPIProvider);
  }

  public static UserRepository newInstance(UserAPI userAPI) {
    return new UserRepository(userAPI);
  }
}