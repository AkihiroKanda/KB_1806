// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.DI.Module;

import com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FragmentModule_ProvideCompanyListFragmentViewFactory
    implements Factory<CompanyListFragmentContract.View> {
  private final FragmentModule module;

  public FragmentModule_ProvideCompanyListFragmentViewFactory(FragmentModule module) {
    this.module = module;
  }

  @Override
  public CompanyListFragmentContract.View get() {
    return Preconditions.checkNotNull(
        module.provideCompanyListFragmentView(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyListFragmentContract.View> create(FragmentModule module) {
    return new FragmentModule_ProvideCompanyListFragmentViewFactory(module);
  }
}