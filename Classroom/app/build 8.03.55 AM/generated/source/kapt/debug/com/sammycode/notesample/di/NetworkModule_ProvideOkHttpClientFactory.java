// Generated by Dagger (https://dagger.dev).
package com.sammycode.notesample.di;

import com.sammycode.notesample.api.AuthInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<AuthInterceptor> interceptorProvider;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module,
      Provider<AuthInterceptor> interceptorProvider) {
    this.module = module;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module, interceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module,
      Provider<AuthInterceptor> interceptorProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(module, interceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance,
      AuthInterceptor interceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient(interceptor));
  }
}
