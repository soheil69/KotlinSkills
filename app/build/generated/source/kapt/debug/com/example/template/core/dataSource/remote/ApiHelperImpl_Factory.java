// Generated by Dagger (https://dagger.dev).
package com.example.template.core.dataSource.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlins.skills.remember.api.requests.ApiClass.ApiServices;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiHelperImpl_Factory implements Factory<ApiHelperImpl> {
  private final Provider<ApiServices> apiServiceProvider;

  public ApiHelperImpl_Factory(Provider<ApiServices> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiHelperImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiHelperImpl_Factory create(Provider<ApiServices> apiServiceProvider) {
    return new ApiHelperImpl_Factory(apiServiceProvider);
  }

  public static ApiHelperImpl newInstance(ApiServices apiService) {
    return new ApiHelperImpl(apiService);
  }
}