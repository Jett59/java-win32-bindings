// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$171 {

    static final FunctionDescriptor SetTokenInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTokenInformation$MH = RuntimeHelper.downcallHandle(
        "SetTokenInformation",
        constants$171.SetTokenInformation$FUNC
    );
    static final FunctionDescriptor SetCachedSigningLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCachedSigningLevel$MH = RuntimeHelper.downcallHandle(
        "SetCachedSigningLevel",
        constants$171.SetCachedSigningLevel$FUNC
    );
    static final FunctionDescriptor GetCachedSigningLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCachedSigningLevel$MH = RuntimeHelper.downcallHandle(
        "GetCachedSigningLevel",
        constants$171.GetCachedSigningLevel$FUNC
    );
    static final FunctionDescriptor CveEventWrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CveEventWrite$MH = RuntimeHelper.downcallHandle(
        "CveEventWrite",
        constants$171.CveEventWrite$FUNC
    );
    static final FunctionDescriptor DeriveCapabilitySidsFromName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeriveCapabilitySidsFromName$MH = RuntimeHelper.downcallHandle(
        "DeriveCapabilitySidsFromName",
        constants$171.DeriveCapabilitySidsFromName$FUNC
    );
    static final FunctionDescriptor CreatePrivateNamespaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceW$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceW",
        constants$171.CreatePrivateNamespaceW$FUNC
    );
}


