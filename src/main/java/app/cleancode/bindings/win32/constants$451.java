// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$451 {

    static final FunctionDescriptor CertSetStoreProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetStoreProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetStoreProperty",
        constants$451.CertSetStoreProperty$FUNC
    );
    static final FunctionDescriptor CertGetStoreProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetStoreProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetStoreProperty",
        constants$451.CertGetStoreProperty$FUNC
    );
    static final FunctionDescriptor PFN_CERT_CREATE_CONTEXT_SORT_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_CREATE_CONTEXT_SORT_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$451.PFN_CERT_CREATE_CONTEXT_SORT_FUNC$FUNC
    );
    static final FunctionDescriptor CertCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateContext",
        constants$451.CertCreateContext$FUNC
    );
    static final FunctionDescriptor CertRegisterSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRegisterSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertRegisterSystemStore",
        constants$451.CertRegisterSystemStore$FUNC
    );
}


