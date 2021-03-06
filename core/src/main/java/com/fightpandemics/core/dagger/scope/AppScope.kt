package com.fightpandemics.core.dagger.scope

import javax.inject.Scope

/**
 * Scope for the entire app runtime.
 */
@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope
