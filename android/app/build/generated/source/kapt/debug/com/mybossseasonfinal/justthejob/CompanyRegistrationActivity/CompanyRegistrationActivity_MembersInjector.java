// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class CompanyRegistrationActivity_MembersInjector
    implements MembersInjector<CompanyRegistrationActivity> {
  private final Provider<CompanyRegistrationPresenter> companyRegistrationPresenterProvider;

  public CompanyRegistrationActivity_MembersInjector(
      Provider<CompanyRegistrationPresenter> companyRegistrationPresenterProvider) {
    this.companyRegistrationPresenterProvider = companyRegistrationPresenterProvider;
  }

  public static MembersInjector<CompanyRegistrationActivity> create(
      Provider<CompanyRegistrationPresenter> companyRegistrationPresenterProvider) {
    return new CompanyRegistrationActivity_MembersInjector(companyRegistrationPresenterProvider);
  }

  @Override
  public void injectMembers(CompanyRegistrationActivity instance) {
    injectCompanyRegistrationPresenter(instance, companyRegistrationPresenterProvider.get());
  }

  public static void injectCompanyRegistrationPresenter(
      CompanyRegistrationActivity instance,
      CompanyRegistrationPresenter companyRegistrationPresenter) {
    instance.companyRegistrationPresenter = companyRegistrationPresenter;
  }
}