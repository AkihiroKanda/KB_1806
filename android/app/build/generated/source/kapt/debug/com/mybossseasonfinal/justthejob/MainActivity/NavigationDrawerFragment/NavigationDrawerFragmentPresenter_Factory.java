// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment;

import com.mybossseasonfinal.justthejob.Services.ApiService;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NavigationDrawerFragmentPresenter_Factory
    implements Factory<NavigationDrawerFragmentPresenter> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<NavigationDrawerFragmentContract.View> viewProvider;

  public NavigationDrawerFragmentPresenter_Factory(
      Provider<ApiService> apiServiceProvider,
      Provider<NavigationDrawerFragmentContract.View> viewProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.viewProvider = viewProvider;
  }

  @Override
  public NavigationDrawerFragmentPresenter get() {
    return new NavigationDrawerFragmentPresenter(apiServiceProvider.get(), viewProvider.get());
  }

  public static Factory<NavigationDrawerFragmentPresenter> create(
      Provider<ApiService> apiServiceProvider,
      Provider<NavigationDrawerFragmentContract.View> viewProvider) {
    return new NavigationDrawerFragmentPresenter_Factory(apiServiceProvider, viewProvider);
  }
}
