// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$418 {

    static final FunctionDescriptor CryptSetProviderW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderW$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderW",
        constants$418.CryptSetProviderW$FUNC
    );
    static final FunctionDescriptor CryptSetProviderExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderExA$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderExA",
        constants$418.CryptSetProviderExA$FUNC
    );
    static final FunctionDescriptor CryptSetProviderExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProviderExW$MH = RuntimeHelper.downcallHandle(
        "CryptSetProviderExW",
        constants$418.CryptSetProviderExW$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultProviderA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultProviderA$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultProviderA",
        constants$418.CryptGetDefaultProviderA$FUNC
    );
    static final FunctionDescriptor CryptGetDefaultProviderW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetDefaultProviderW$MH = RuntimeHelper.downcallHandle(
        "CryptGetDefaultProviderW",
        constants$418.CryptGetDefaultProviderW$FUNC
    );
    static final FunctionDescriptor CryptEnumProviderTypesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumProviderTypesA$MH = RuntimeHelper.downcallHandle(
        "CryptEnumProviderTypesA",
        constants$418.CryptEnumProviderTypesA$FUNC
    );
}

