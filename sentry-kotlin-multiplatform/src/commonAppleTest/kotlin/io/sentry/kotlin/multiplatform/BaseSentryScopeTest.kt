package io.sentry.kotlin.multiplatform

import cocoapods.Sentry.SentryScope as CocoaScope

actual abstract class BaseSentryScopeTest {
    actual fun initializeScope(): Scope {
        val cocoaScope = CocoaScope()
        val scopeCocoaImpl = ScopeCocoaImpl(cocoaScope)
        return Scope(scopeCocoaImpl)
    }
}
