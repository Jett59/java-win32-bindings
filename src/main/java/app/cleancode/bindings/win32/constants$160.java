// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$160 {

    static final FunctionDescriptor CreatePrivateObjectSecurityEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateObjectSecurityEx$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateObjectSecurityEx",
        constants$160.CreatePrivateObjectSecurityEx$FUNC
    );
    static final FunctionDescriptor CreatePrivateObjectSecurityWithMultipleInheritance$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateObjectSecurityWithMultipleInheritance$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateObjectSecurityWithMultipleInheritance",
        constants$160.CreatePrivateObjectSecurityWithMultipleInheritance$FUNC
    );
    static final FunctionDescriptor CreateRestrictedToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateRestrictedToken$MH = RuntimeHelper.downcallHandle(
        "CreateRestrictedToken",
        constants$160.CreateRestrictedToken$FUNC
    );
    static final FunctionDescriptor CreateWellKnownSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWellKnownSid$MH = RuntimeHelper.downcallHandle(
        "CreateWellKnownSid",
        constants$160.CreateWellKnownSid$FUNC
    );
    static final FunctionDescriptor EqualDomainSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EqualDomainSid$MH = RuntimeHelper.downcallHandle(
        "EqualDomainSid",
        constants$160.EqualDomainSid$FUNC
    );
    static final FunctionDescriptor DeleteAce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeleteAce$MH = RuntimeHelper.downcallHandle(
        "DeleteAce",
        constants$160.DeleteAce$FUNC
    );
}


