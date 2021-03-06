package com.alexrwegener.dagger2byexamples.di.user;

import com.alexrwegener.dagger2byexamples.data.user.UserDataModule;
import com.alexrwegener.dagger2byexamples.interactor.user.UserInteractorModule;
import com.alexrwegener.dagger2byexamples.store.user.UserStoreModule;
import dagger.Module;

@Module(includes = { UserStoreModule.class, UserDataModule.class, UserInteractorModule.class }) public final class UserModule {

}
